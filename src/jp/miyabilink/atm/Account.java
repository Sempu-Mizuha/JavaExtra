package jp.miyabilink.atm;

import java.io.Serializable;

import Entity.Bank;

/**
 * 口座クラス。
 * このクラスは、1つの銀行口座を表します。
 * @author 湊
 * @author 菅原
 * @author Sempu-Mizuha
 * @version 1.2
 * @since 0.1(菅原) <br>
 * @since 0.2(湊) <br>
 * @since 1.2 Sempu-Mizuha 2017/12/29 22:19:08 <br>
 * @since 1.3 Sempu-Mizuha 2018/01/01 13:28:51 <br>
 * @deprecated 代わりにNewAccountクラスを利用してください。
 * @see NewAccount
 */
@Deprecated
public class Account implements Serializable {

  /**
   * serialVersionUID。クラスを更新した際は数値を変える。
   */
  private static final long serialVersionUID = 742671479344033874L;
  /**
   * 口座名義人
   */
  private String owner; // 口座名義人
  /**
   * 残高
   */
  private int balance; // 口座残高


  /**
   * @param balance
   * @param owner
   */
  public Account(final String owner, int balance) {
    this.balance = balance;
    this.owner = owner;
  }




  /**
   * コンストラクター
   * @since 1.3 Sempu-Mizuha 2018/01/01 13:28:51 <br>
   */
  public Account() {
  }




  /**
   * @return balance
   */
  public int getBalance() {
    return balance;
  }



  /**
   * 残高を受け取るメソッド.
   * @param balance 残高
   * @since x.x Sempu-Mizuha 2018/01/01 14:03:45 <br>
   */
  public void setBalance(final int balance) {
    if (balance < 0) {
      throw new IllegalArgumentException("負の残高が設定されそうになりました");
    }
    assert balance >= 0 : "残高は負の値でなければいけません。";
    this.balance = balance;
  }



  /**
   * @return owner
   */
  public String getOwner() {
    return owner;
  }



  /**
   * @param owner セットする owner
   */
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   * 送金手続きを行うメソッド。
   * @param dest 送金先の口座
   * @param amount 送金額
   * @since 1.2 Sempu-Mizuha 2017/12/29 17:42:56 <br>
   */
  public void transfer(Account dest, int amount) {
    dest.balance += amount;
    balance -= amount;
    // …送金処理の記述…(残高不足の場合は例外を送出)
    System.out.println("正常に送金完了しました");
    assert this.balance >= 0 : "負の残高" + this.balance;
  }

  /**
   * 他行への振り込みを行うメソッド。
   * このメソッドを呼び出すと、<b>他の</b>口座に送金します。
   * @since 0.1(菅原)
   * @since 0.2(湊)
   * @param bank 送金先銀行
   * @param dest 送金先口座
   * @param amount 送金する金額
   * @return 送金手数料
   * @throws IllegalArgumentException 残高不足のとき
   */
  public int transfer(Bank bank, Account dest, int amount) throws IllegalArgumentException{
    return amount;
  }

}
