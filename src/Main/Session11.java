package Main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class Session11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// urlに接続(単純:簡易)
		InputStreamReader isr = null;
		try {
			URL url = new URL("http://dokojava.jp");
			InputStream is = url.openStream(); // これではバイトのまま
			isr = new InputStreamReader(is); // これで1文字にできる(BufferedReaderに変換もできるようになる)
			int i = isr.read();
			while(i != -1) {
				System.out.print((char) i);
				i = isr.read();
			}
		} catch (MalformedURLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			if(isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}

		System.out.println();
		System.out.println();

		//urlに接続(詳細:複雑)
		Socket sock = null;
		try {
			sock = new Socket("dokojava.jp", 80);
			InputStream is = sock.getInputStream();
			OutputStream os = sock.getOutputStream();
			os.write("GET /index.html HTTP/1.0\r\n".getBytes());
			os.write("\r\n".getBytes());
			os.flush();
			InputStreamReader isr2 = new InputStreamReader(is);
			int i = isr2.read();
			while(i != -1) {
				System.out.print((char) i);
				i = isr2.read();
			}

		} catch (UnknownHostException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			if(sock != null) {
				try {
					sock.close();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}

		System.out.println();

		//自分が接続される側になる
		System.out.println("起動完了");
		ServerSocket svSock = null;
		try {
			svSock = new ServerSocket(39648);
			Socket sock2 = svSock.accept(); // 呼び出すと誰かから接続されるまでまつ。
			System.out.println(sock2.getInetAddress() + "からの接続");
			sock2.getOutputStream().write("WELCOME".getBytes());
			sock2.getOutputStream().flush();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			if(svSock != null) {
				try {
					svSock.close();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}





	}

}
