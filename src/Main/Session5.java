package Main;

import Entity.Outer;
import Entity.Poket;

public class Session5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Poket<String> p = new Poket<String>();
		p.put("1192");
		String s = p.get();
		System.out.println(s);

		// static 有り メンバクラス
		@SuppressWarnings("unused")
		Outer.Inner ic = new Outer.Inner();

		// static 無し メンバクラス
		Outer o = new Outer();
		@SuppressWarnings("unused")
		Outer.Inner2 ic2 = o.new Inner2();

		Poket<Object> poket = new Poket<Object>();
		System.out.println("使い捨てのインスタンスを作りpoketに入れます");
		// 匿名クラス
		poket.put(new Object() {
			@SuppressWarnings("unused")
			private String innerField;
			@SuppressWarnings("unused")
			void innerField() {
			}
		});




	}

}
