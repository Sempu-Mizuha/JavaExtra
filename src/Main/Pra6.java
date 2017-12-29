package Main;

import Entity.FuncList;
import Interface.Func1;
import Interface.Func2;

public class Pra6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FuncList funcList = new FuncList();

		Func1 func1 = FuncList::isOdd;
		System.out.println(func1.isOdd(10));
		Func2 func2 = funcList::addNamePrefix;
		System.out.println(func2.addNamePrefix(false, "Alice"));

		Func1 func11 = x -> x % 2 == 1;
		System.out.println(func11.isOdd(15));
		Func2 func22 = (male, name) -> {
			if(male == true) { return "Mr." + name; }
			else { return "Ms." + name; }
		};
		System.out.println(func22.addNamePrefix(true, "Mike"));


	}

}
