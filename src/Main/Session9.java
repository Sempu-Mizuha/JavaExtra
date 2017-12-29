package Main;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class Session9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String txtFileName = "txt/rpgsave.txt";
		String txtFileBinaryName = "txt/rpgbinarysave.dat";

		// FileWriter(バグ潰し込み)
		// true falseで返せるようにコメント追加
		FileWriter fw = null;
		try {
			fw = new FileWriter(txtFileName, true); // step1
			fw.write("ああああ"); // step2
			fw.flush(); // dbで言う所のコミット
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			// return false;
		} finally {
			if(fw != null) {
				try {
					fw.close(); fw = null; // step3
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
					// return false;
				}
			}
		}
		// return true

		// FileReader(バグ潰し込み)
		// ここでは吐き出したものの処理は記載せず(基本1文字ずつ以外このクラスではできないので不便)
		FileReader fr = null;
		try {
			fr = new FileReader(txtFileName); // step1
			System.out.println("全てのデータを読んで表示します");
			int i = fr.read(); // 読むものがないと-1で吐き出される
			while(i != -1) {
				char c = (char) i;
				System.out.println(c);
				i = fr.read(); // 次の1文字を読む
			}
			System.out.println("ファイルの末尾に到達しました");
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}

		// ここまでテキスト
		// ここからバイナリ
		// FileWriter(バグ潰し込み)
		// true falseで返せるようにコメント追加
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(txtFileBinaryName, true); // step1
			fos.write("AAAA".getBytes("utf-8")); // step2 int or byte[] 以外ダメ
			fos.write(65); // 二進数で01000001を突っ込んでいることになる
			fos.flush(); // dbで言う所のコミット
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			// return false;
		} finally {
			if(fos != null) {
				try {
					fos.close(); fos = null; // step3
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
					// return false;
				}
			}
		}
		// return true

		// 一括で全部読むReaderは存在しない(容量パンクのため)
		// String data = MyFileReader.readAll(txtFileName);

		System.out.println("aaaa"); // 通常に画面表示
		System.err.println("aaaa"); // エラーとして画面表示
		try {
			int inRead1 = System.in.read();
			int inRead2 = System.in.read();
			System.out.println((char) inRead1);
			System.out.println((char) inRead2);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		// 1文字ずつ読み込む
		String msg = "第1土曜";
		Reader sr = new StringReader(msg);
		try {
			char c1 = (char) sr.read();
			char c2 = (char) sr.read();
			System.out.println(c1);
			System.out.println(c2);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		// ByteArrayInputStream を使うと1バイトずつ読み込む

		// 1バイトずつ書き込む
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(65);
		baos.write(66);
		byte[] data = baos.toByteArray();
		System.out.println(data[0]);
		// StringWriter で1文字ずつ書き込む

		// 暗号化(ストリームに挟む...まだ理解できない件)
		Cipher cipher = null;
		FileOutputStream fos2 = null;
		CipherOutputStream cos = null;
		OutputStreamWriter osw = null;
		try {
			cipher = Cipher.getInstance("DES");
			KeyGenerator keyGen = KeyGenerator.getInstance("DES");
			keyGen.init(56);
			SecretKey key = keyGen.generateKey();
			cipher.init(Cipher.ENCRYPT_MODE, key);
			// STEP1: 通常のファイル出力ストリームfos2を生成
			fos2 = new FileOutputStream("txt/data.txt");
			// STEP2: このストリームを下流にもつ暗号化ストリームcosを生成し接続
			cos = new CipherOutputStream(fos2, cipher);
			// STEP3: cosに書き込めば、暗号化された上でファイルに流れていく
//			cos.write(65);
			// STEP3: さらに文字バイト変換するストリームoswを接続
			osw = new OutputStreamWriter(cos);
			osw.write("AB");
			osw.flush();
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			if(osw != null) {
				try {
					osw.close(); osw = null; // step3
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
					// return false;
				}
			}
		}





	}

}
