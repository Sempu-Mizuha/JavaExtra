package jp.miyabilink.atm;

import java.io.Serializable;

import Entity.Bank;

/**
 * 口座クラス。
 * このクラスは、1つの銀行口座を表します。
 * @author 湊
 * @author 菅原
 * @version 0.2
 * @since 0.1(菅原)
 * @since 0.2(湊)
 * @deprecated 代わりにNewAccountクラスを利用してください。
 * @see NewAccount
 */
@Deprecated
public class Account implements Serializable{

	/**
	 * serialVersionUID。クラスを更新した際は数値を変える。
	 */
	private static final long serialVersionUID = 742671479344033874L;
	/**
	 * 残高
	 */
	private int balance;
	/**
	 * 口座名義人
	 */
	private String owner;


	/**
	 * @param balance
	 * @param owner
	 */
	public Account(int balance, String owner) {
		this.balance = balance;
		this.owner = owner;
	}




	/**
	 * @return balance
	 */
	public int getBalance() {
		return balance;
	}



	/**
	 * @param balance セットする balance
	 */
	public void setBalance(int balance) {
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
