package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import Entity.Hero;

public class Pra3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero Sato   = new Hero("斎藤");
		Hero Suzuki = new Hero("鈴木");

		List<Hero> list = new ArrayList<Hero>();
		list.add(Sato);
		list.add(Suzuki);

		Iterator<Hero> it = list.iterator();
		while(it.hasNext()) {
			Hero h = it.next();
			System.out.println(h.getName());
		}

		Map<Hero, Integer> map = new HashMap<Hero, Integer>();
		map.put(Sato, 3);
		map.put(Suzuki, 7);

		Iterator<Hero> itHero = map.keySet().iterator();
		while(itHero.hasNext()) {
			Hero h = itHero.next();
			System.out.println( h.getName() + "が倒した敵=" + map.get(h) );
		}


	}

}
