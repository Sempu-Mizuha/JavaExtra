package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Entity.Account;
import Entity.Book;
import Entity.Hero;
import Entity.Sword;

public class Session4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero a = new Hero();
		System.out.println(a);

		// equals()をオーバーライドしないと変なことになる
		List<Hero> list = new ArrayList<Hero>();
		Hero h1 = new Hero();
		h1.setName("ミナト");
		list.add(h1);
		System.out.println("要素数=" + list.size());
		h1 = new Hero();
		h1.setName("ミナト");
		list.remove(h1);
		System.out.println("要素数=" + list.size());

		// hashCode()をオーバーライドしていないと変なことになる
		Set<Hero> set = new HashSet<Hero>();
		h1 = new Hero();
		h1.setName("ミナト");
		set.add(h1);
		System.out.println("要素数=" + set.size());
		h1 = new Hero();
		h1.setName("ミナト");
		set.remove(h1);
		System.out.println("要素数=" + set.size());

		// 自然順序設定しておかないと変なことになる
		List<Account> listAccount = new ArrayList<Account>();
		Collections.sort(listAccount);

		// cloneの行い方
		Hero h11 = new Hero("ミナト");
		Sword s = new Sword("はがねの剣");
		h11.setSword(s);
		System.out.println("装備:" + h11.getSword().getSword());
		System.out.println("clone()で複製します");
		Hero h12 = h11.clone();
		System.out.println("コピー元の勇者の剣の名前を変えます");
		h11.getSword().setSword("ひのきの棒");
		System.out.println("コピー元とコピー先の勇者の装備を表示します");
		System.out.println("コピー元:" + h11.getSword().getSword() + "/コピー先:" + h12.getSword().getSword());

		List<Hero> list1 = new ArrayList<Hero>();
		list1.add(h11);
		System.out.println("コピー前:" + list1.get(0) + list1.get(0).getSword());
		@SuppressWarnings("unchecked")
		List<Hero> list2 = (ArrayList<Hero>) ((ArrayList<Hero>) list1).clone();
		list1.get(0).setName("スガワラ");
		list1.get(0).getSword().setSword("はがねの剣");
		System.out.println("コピー前:" + list1.get(0) + list1.get(0).getSword());
		System.out.println("コピー後:" + list2.get(0) + list2.get(0).getSword());

		String a1 = "a";
		String a2 = a1;
		a1 = "aa";
		System.out.println( a1 + " " + a2 );

		Book book1 = new Book();
		Book book2 = new Book();
		book1.setTitle("あ");
		book2.setTitle("い");
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		System.out.println(book1.equals(book2));
		System.out.println(book1.compareTo(book2));


	}

}
