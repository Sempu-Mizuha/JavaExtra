package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Item;

public class ItemDAO {

	public static final String DATA_BASE = "jdbc:h2:"+ System.getProperty("user.dir") + "/dataBase/practice";
	public static final String ID = "sa";
	public static final String PASS = "";

	// 静的初期化(初めてこのクラスを利用する時のみ作用)
	static {
		// 事前準備(jarファイルからクラス情報を読み込む)
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public List<Item> findByMinimumPrice(int price) {

		// List型返す
		List<Item> list = new ArrayList<>();

		// java7 以降のtry-with-resources書き方(closeを見かけ上省略)
		try (Connection con2 = DriverManager.getConnection(DATA_BASE,	ID, PASS)){
//			con2.setAutoCommit(false); // 手動コミットに変更
			// sql作成(変数あり)
			StringBuilder sql2 = new StringBuilder();
			sql2.append("SELECT * ");
			sql2.append("FROM ITEMS ");
			sql2.append("WHERE PRICE > ? ");
			try (PreparedStatement pstmt2 = con2.prepareStatement(sql2.toString())){
				// SQLを組み立てて送信
				int i = 1;
				pstmt2.setInt(i++, price);
				try (ResultSet rs = pstmt2.executeQuery()){
					// 複数結果
					while (rs.next()) {
						Item item = new Item();
						item.setName(rs.getString("NAME"));
						item.setPrice(rs.getInt("PRICE"));
						item.setWeight(rs.getInt("WEIGHT"));
						list.add(item);
					}
				}
			}
//			con2.commit();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		}

		return list;

	}




}
