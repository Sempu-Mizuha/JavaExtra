/**
 * jp.miyabilink.atm.Bank
 */
package jp.miyabilink.atm;

//import java.io.FileWriter;
import java.io.IOException;

/**
 * 銀行クラス.
 * @author Sempu-Mizuha
 * @version 1.3
 * @since 1.0 Sempu-Mizuha 2017/12/29 11:45:09 <br>
 * @since 1.1 Sempu-Mizuha 2017/12/29 15:07:53 <br>
 * @since 1.2 Sempu-Mizuha 2017/12/30 0:05:41 <br>
 * @since 1.3 Sempu-Mizuha 2017/12/30 12:14:36 <br>
 * @since 1.4 Sempu-Mizuha 2017/12/31 12:26:27 <br>
 */
public class Bank {

  /**
   * 銀行名の最小文字数.
   * @since 1.4 Sempu-Mizuha 2017/12/31 12:36:41 <br>
   */
  public static final int CONSTANT = 3;
  /**
   * 銀行名(必ず3文字以上が設定される).
   * @since 1.1 Sempu-Mizuha 2017/12/29 15:13:05
   */
  private String name;
  /**
   * Nameを取得するgetterメソッド.
   * @return Nameを取得する
   * @since 1.3 Sempu-Mizuha 2017/12/29 15:24:41
   */
  public String getName() {
    return name;
  }


  /**
   * nameを登録するメソッド.
   * @param name nameを登録する
   * @since 1.3 Sempu-Mizuha 2017/12/30 12:20:08 <br>
   */
  public void setName(final String name) {
    if (name.length() < CONSTANT) {
      throw new IllegalArgumentException("名前が不正です");
    }
    this.name = name;
  }











  /**
   * @(x.xにバージョンを記載:この行は削除すること)
   * addressを取得するメソッド
   * @return addressを取得する
   * @since x.x Sempu-Mizuha 2017/12/29 14:01:53
   */
  public String getAddress() {
    return address;
  }







  /**
   * @(x.xにバージョンを記載:この行は削除すること)
   * addressを登録するメソッド
   * @param address addressを登録する
   * @since x.x Sempu-Mizuha 2017/12/29 14:01:53
   */
  public void setAddress(final String address) {
    this.address = address;
  }







  /**
   * 銀行住所.
   * @since 1.1 Sempu-Mizuha 2017/12/29 13:08:03
   */
  private String address;



  /**
   * @(作成したメソッドの説明を↓に記載 & 作成したタグに説明を追加 & x.xにバージョンを記載:この行は削除すること)
   *
   * @return
   * @throws CloneNotSupportedException
   * @see java.lang.Object#clone()
   * @deprecated aioueo
   * @since x.x Sempu-Mizuha 2017/12/29 13:31:30
   */
  @Override
  @Deprecated
  protected Object clone() throws CloneNotSupportedException {
    // TODO 自動生成されたメソッド・スタブ
    return super.clone();
  }







  /**
   * 追加訂正.
   * @return アドレス文字のバイト配列
   * @see java.lang.String#getBytes()
   * @since x.x Sempu-Mizuha 2017/12/29 13:41:04 <br>
   * @since 1.4 Sempu-Mizuha 2017/12/31 12:26:27 <br>
   */
  public byte[] getBytes() {
    return address.getBytes();
  }







  /**
   * @(作成したコンストラクターの説明を↓に記載 & 作成したタグに説明を追加 & x.xにバージョンを記載:この行は削除すること)
   *
   * @param name おまけ
   * @param address おまけ
   * @since x.x Sempu-Mizuha 2017/12/29 13:03:44
   */
  public Bank(final String name, final String address) {
    this.name = name;
    this.address = address;
  }

  /**
   * 因数を受け取らないコンストレクター.
   * @since 1.3 Sempu-Mizuha 2017/12/30 12:40:06 <br>
   */
  public Bank() {
  }


  /**
   * 新規名義を作成する.
   * @param owner 名義名
   * @param initalBalance 新規通帳金額
   * @throws IOException 例外
   * @throws NullPointerException 例外
   * @since 1.1 Sempu-Mizuha 2017/12/29 13:25:52
   */
  public void addAccount(final String owner, final int initalBalance)
      throws IOException, NullPointerException {
    // FileWriter fw = new FileWriter("aaaa");

  }

  /**
   * @(作成したメソッドの説明を↓に記載 & 作成したタグに説明を追加 & x.xにバージョンを記載:この行は削除すること)
   *
   * @param args 外部からの指定されたパラメータ
   * @throws IOException @(ここにタグの説明を記載)
   * @since x.x Sempu-Mizuha 2017/12/29 15:50:23
   */
  public static void main(final String[] args) throws IOException {
    // TODO 自動生成されたメソッド・スタブ
    System.out.println("試験用のメインメソッドです");
  }

}
