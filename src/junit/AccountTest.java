/**
 * パッケージ.クラス名:
 * junit.AccountTest
 */
package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import jp.miyabilink.atm.Account;

/**
 * テストクラス
 * @author Sempu-Mizuha
 * @version 1.0
 * @since 1.0 Sempu-Mizuha 2017/12/29 19:34:03 <br>
 */
public class AccountTest {

	/**
	 * {@link jp.miyabilink.atm.Account#Account(java.lang.String, int)} のためのテスト・メソッド。
	 * 実際にAccountをnewして使ってみるテスト
	 * @since 1.0 Sempu-Mizuha 2017/12/29 20:06:56 <br>
	 */
	@Test
	public void testAccount() {
		Account a = new Account("ミナト", 30000);
		assertEquals("ミナト", a.getOwner());
		assertEquals(30000, a.getBalance());
	}

	/**
	 * {@link jp.miyabilink.atm.Account#transfer(jp.miyabilink.atm.Account, int)} のためのテスト・メソッド。
	 * @since 1.0 Sempu-Mizuha 2017/12/29 20:08:06 <br>
	 */
	@Test
	public void testTransferAccountInt() {
		Account minato = new Account("ミナト", 5000);
		Account asaka = new Account("アサカ", 5000);
		minato.transfer(asaka, 40000);
		System.out.println(minato.getBalance());

		System.out.println("アサートにわざと失敗します");
		assert 1 == 0;
		System.out.println("正常終了します");
	}

}
