/**
 * パッケージ.クラス名:
 * jp.miyabilink.atm.BankCode
 */
package jp.miyabilink.atm;

/**
 * 銀行のコードを登録する.
 * @author Sempu-Mizuha
 * @version 1.1
 * @since 1.0 Sempu-Mizuha 2017/12/31 17:26:59 <br>
 * @since 1.1 Sempu-Mizuha 2017/12/31 20:48:59 <br>
 * @since 1.1 Sempu-Mizuha 2017/12/31 20:59:58 <br>
 */
public class BankCode {
  /**
   * 銀行コード.
   * @since 1.1 Sempu-Mizuha 2017/12/31 21:09:43 <br>
   */
  private String number;

  /**
   * numberを取得するメソッド.
   * @return numberを取得する
   * @since 1.1 Sempu-Mizuha 2017/12/31 20:59:58 <br>
   */
  public String getNumber() {
    return number;
  }

  /**
   * numberを登録するメソッド.
   * @param number numberを登録する
   * @since 1.1 Sempu-Mizuha 2017/12/31 20:59:58 <br>
   */
  public void setNumber(final String number) {
    this.number = number;
  }

}
