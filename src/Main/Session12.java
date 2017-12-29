package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dao.ItemDAO;
import dto.Item;

public class Session12 {

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

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		// 事前準備(jarファイルからクラス情報を読み込む)
//		try {
//			Class.forName("org.h2.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		}

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// db接続
			con = DriverManager.getConnection(DATA_BASE,	ID, PASS);
			con.setAutoCommit(false); // コミットを手動で行う

			// sql作成(変数あり)
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE ");
			sql.append("FROM MONSTERS ");
			sql.append("WHERE HP <= ? ");
			sql.append("OR NAME = ? ");

			// 雛形を準備
			pstmt = con.prepareStatement(sql.toString());

			// ?を埋めて送信する
			int i = 1;
			pstmt.setInt(i++, 10); // 1番目
			pstmt.setString(i++, "ゾンビ"); // 2番目
			int r = pstmt.executeUpdate();

			// 少し異なるSQLを再度叩き込む(基盤を使い回しできる)
			int j = 1;
			pstmt.setInt(j++, 5); // 1番目
			pstmt.setString(j++, "ゴブリン"); // 2番目
			pstmt.executeUpdate();

			// 結果
			if(r != 0) {
				System.out.println(r + "件のデータを消去しました");
				con.commit(); // コミット手動
			} else {
				System.out.println("該当するモンスターはいませんでした");
				throw new SQLException();
			}

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			if(con != null) {
				try {
					con.rollback(); // ロールバック
				} catch (SQLException e1) {
					// TODO 自動生成された catch ブロック
					e1.printStackTrace();
				}
			}
		} finally {
			// 雛形閉じる
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
			// db切断
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}

		}

		// java7 以降のtry-with-resources書き方(closeを見かけ上省略)
		try (Connection con2 = DriverManager.getConnection(DATA_BASE,	ID, PASS);){
			// sql作成(変数あり)
			StringBuilder sql2 = new StringBuilder();
			sql2.append("SELECT * ");
			sql2.append("FROM MONSTERS ");
			sql2.append("WHERE HP >= ? ");
			try (PreparedStatement pstmt2 = con2.prepareStatement(sql2.toString());){
				// SQLを組み立てて送信
				int i = 1;
				pstmt2.setInt(i++, 10);
				try (ResultSet rs = pstmt2.executeQuery();){
					// 複数結果
					while(rs.next()) {
						System.out.println(rs.getString("NAME"));
					}
					// 単数結果
					if(rs.next()) {
						System.out.println("ゴブリンのHPは" + rs.getInt("HP"));
					} else {
						System.out.println("ゴブリンはDBに存在しません");
					}
				}
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		System.out.println("1円以上のアイテム一覧表を表示します");
		ItemDAO itemDAO = new ItemDAO();
		List<Item> items = itemDAO.findByMinimumPrice(1);
		for(Item item : items) {
			System.out.printf("%10s%4d%4d\n", item.getName(), item.getPrice(), item.getWeight());
		}






	}

}
