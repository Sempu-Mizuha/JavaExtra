/**
 * パッケージ.クラス名:
 * junit.AccountTest
 */
package junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import jp.miyabilink.atm.Account;

/**
 * テストクラス
 * @author Sempu-Mizuha
 * @version 1.1
 * @since 1.0 Sempu-Mizuha 2017/12/29 19:34:03 <br>
 * @since 1.1 Sempu-Mizuha 2018/01/01 12:57:57 <br>
 */
public class AccountTest {

  /**
   * 全テスト終了時にアラートを出すメソッド.
   * @throws java.lang.Exception
   * @since 1.1 Sempu-Mizuha 2018/01/01 12:57:57 <br>
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    StringBuilder sb = new StringBuilder();
    System.out.println(sb.append(Account.class.getName()).append("のJUnitテストは終了です。"));
  }


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
//		assert 1 == 0;
		System.out.println("正常終了します");
	}

  /**
   * {@link jp.miyabilink.atm.Account#setBalance(int)} のためのテスト・メソッド.
   * 負の値を入れる
   * @since 1.1 Sempu-Mizuha 2018/01/01 13:23:58 <br>
   */
  @Test(expected = IllegalArgumentException.class)
  public void testSetBalanceFalse() {
    Account a = new Account();
    a.setBalance(-100);
    fail("例外を表示しませんでした");
  }

  /**
   * {@link jp.miyabilink.atm.Account#setBalance(int)} のためのテスト・メソッド.
   * 0を入れる
   * @since 1.1 Sempu-Mizuha 2018/01/01 13:23:58 <br>
   */
  @Test
  public void testSetBalance0() {
    Account a = new Account();
    a.setBalance(0);
    assertEquals(0, a.getBalance());
  }

  /**
   * {@link jp.miyabilink.atm.Account#setBalance(int)} のためのテスト・メソッド.
   * 正の値を入れる
   * @since 1.1 Sempu-Mizuha 2018/01/01 13:23:58 <br>
   */
  @Test
  public void testSetBalanceTrue() {
    Account a = new Account();
    a.setBalance(100);
    assertEquals(100, a.getBalance());
  }


}
