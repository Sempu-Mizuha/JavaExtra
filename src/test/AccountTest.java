/**
 * パッケージ.クラス名:
 * test.AccountTest
 */
package test;

import jp.miyabilink.atm.Account;

/**
 * 初めてのテストクラス
 * @author Sempu-Mizuha
 * @version 1.0
 * @since 1.0 Sempu-Mizuha 2017/12/29 17:54:13 <br>
 */
class AccountTest {

	/**
	 * テストを行うためのメインメソッド
	 * @param args 外部からのパラメータを受け取る
	 * @since 1.0 Sempu-Mizuha 2017/12/29 17:54:14 <br>
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		testInstantiate(); // 1つめのテスト
		testTransfer();    // 2つめのテスト
	}

	private static void testInstantiate() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("無事newできるかテストします");
		Account a = new Account("ミナト", 30000);
		if(!"ミナト".equals(a.getOwner())) {
			System.out.println("失敗！　名義人がおかしい");
		}
		if(30000 != a.getBalance()) {
			System.out.println("失敗！　残高がおかしい");
		}
		System.out.println("テストを終了します");
	}

	private static void testTransfer() {
		// TODO 自動生成されたメソッド・スタブ

	}



}
