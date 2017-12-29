package Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;
import java.util.function.Supplier;

import Entity.Hero;
import Entity.Character;
import Interface.BiBiFunction;

public class Session6 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 関数オブジェクト
		// subメソッドの処理ロジックを、変数funcに代入する
		IntBinaryOperator func = Session6::sub;
		// 変数funcに格納されている処理ロジックを、引数5と3で実行する
		int ans = func.applyAsInt(5, 3);
		System.out.println("5-3は" + ans);

		// ラムダ式
		// 「2つの引数の差を求める処理」の実態を生み出し、代入する
		IntBinaryOperator func1 = (int a, int b) -> { return a - b;};
		int ans2 = func1.applyAsInt(5, 3);
		System.out.println("5-3は" + ans2);

		// https://qiita.com/opengl-8080/items/22c4405a38127ed86a31
		// から関数を受け取れる型を探す
		// 勇者インスタンスを受け取り、そのHPを返す
		Function<Hero, Integer> function = (Hero h) -> { return h.getHp(); };
		// 何も受け取らず、現在日時を返す
		Supplier<Date> supplier = () -> { return new java.util.Date(); };
		// long配列を受け取り、そのコピーを作り、内容を並び替えて返す
		Function<long[], long[]> function2 = (long[] array)
				-> { long[] array2 = java.util.Arrays.copyOf(array, array.length);
				java.util.Arrays.sort(array2);
				return array2;};
		// 関数オブジェクトを受け取り、2回呼び出した合計を返す
		BiBiFunction<IntBinaryOperator,Integer,Integer,Integer> biFunction
			= (IntBinaryOperator func5, Integer a, Integer b)
			-> { int result = func5.applyAsInt(a, b) + func5.applyAsInt(a, b);
				 return result;};

		// ラムダ式省略形式
		IntToDoubleFunction func3 = x -> x*x*3.14;
		double b = 1.41;
		IntToDoubleFunction func4 = x -> x*x*b; // b:final パラメータとして扱われる。

		// ラムダ式使用方法
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		List<Character> list2 = new ArrayList<Character>();
		Hero h = new Hero("ミナト");
		list2.add(h);

		// List<Integer> list1の各要素を2倍にする
		list1.stream().map( i -> i * 2 ).forEach( i -> System.out.println(i) ); // 基本データとして扱われているので変化しない、残念
		list1.stream().forEach( i -> i = i * 2 );
		for(Integer i : list1) {
			i = i * 2;
			System.out.println(i);
		}
		for(Integer i : list1) {
			// i = i * 2;
			System.out.println(i);
		}

		Integer i = 6;
		Integer j = i * 2;

		// List<Character> list2の各要素に対してsleep()を読み出す
		list2.stream().forEach( c -> c.sleep() );
		list2.parallelStream().forEach( c -> c.sleep() );


	}

	public static int twice(int x) {
		return x*2;
	}

	public static int sub(int a, int b) {
		return a - b;
	}


}
