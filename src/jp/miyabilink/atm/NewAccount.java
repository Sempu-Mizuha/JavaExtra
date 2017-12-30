/**
 *
 */
package jp.miyabilink.atm;

import Entity.Bank;

/**
 * @author MIBOX
 *
 */
@SuppressWarnings("serial")
public class NewAccount extends Account {

	/**
	 * @param balance
	 * @param owner
	 */
	public NewAccount(int balance, String owner) {
		super(owner, balance);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 * @see jp.miyabilink.atm.Account#transfer(Entity.Bank, jp.miyabilink.atm.Account, int)
	 */
	@SuppressWarnings("deprecation")
	@Override
	public int transfer(Bank bank, Account dest, int amount) throws IllegalArgumentException {
		// TODO 自動生成されたメソッド・スタブ
		return super.transfer(bank, dest, amount);
	}


	/**
	 * @param dest
	 * @param amount
	 * @deprecated
	 */
	@Deprecated
	public void transfer(Account dest, int amount) {

	}


}
