package Main;

import jp.miyabilink.atm.Account;

public class Session14 {

	public static void main(String[] args) {
		Account minato = new Account("ミナト", 5000);
		Account asaka = new Account("アサカ", 5000);
		minato.transfer(asaka, 40000);
		System.out.println(minato.getBalance());

		System.out.println("アサートにわざと失敗します");
		assert 1 == 0;
		System.out.println("正常終了します");
	}

}
