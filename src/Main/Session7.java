package Main;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import Entity.RefSample;

public class Session7 {

	public static void main(String[] args) throws IOException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// TODO 自動生成されたメソッド・スタブ
		// 任意のアプリケーションを起動する
		System.out.println("計算を開始します。");
		int a = 2;
		int b = 4;
		System.out.println(a+b);
		System.out.println("計算完了。結果をメモ帳で表示します。");
		ProcessBuilder pd = new ProcessBuilder
				("/Applications/Emacs.app/Contents/MacOS/Emacs",
						"/Users/MIBOX/Desktop/workspace/txt/calcreport.txt");
		pd.start();

		// システムプロパティを取得
		System.out.println("ご利用のJavaのバージョン");
		System.out.println(System.getProperty("java.version"));
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("【システムプロパティ一覧】");
		while(i.hasNext()) {
			String key = i.next();
			System.out.print(key + " = ");
			System.out.println(System.getProperty(key));
		}

		// システムごとの改行コードを受け取る
		final String BR = System.getProperty("line.separator");
		System.out.println("本日は" + BR + "晴天なり");

		// システムプロパティの設定
		System.setProperty("rpg.version", "0.3");

		// OS環境変数
		Map<String,String> os = System.getenv();
		Iterator<String> ios = os.keySet().iterator();
		while(ios.hasNext()) {
			String key = ios.next();
			System.out.print(key + " = ");
			System.out.println(System.getenv(key));
		}

		// メモリ確認
		long f = Runtime.getRuntime().freeMemory() / 1024 / 1024;
		long t = Runtime.getRuntime().totalMemory() / 1024 / 1024;
		long m = Runtime.getRuntime().maxMemory() / 1024 / 1024;
		System.out.println("残り " + f + " MB");
		System.out.println("総容量 " + t + " MB");
		System.out.println("限界値 " + m + " MB");

		// クラスの情報を入手する
		// Stringに関する情報を取得して表示する
		Class<?> info1 = String.class;
		System.out.println(info1.getSimpleName()); //->String
		System.out.println(info1.getName()); //->java.lang.String
		System.out.println(info1.getPackage().getName()); //->java.lang
		System.out.println(info1.isArray()); //->false

		// Stringの親クラスの情報を所得する
		Class<?> info2 = info1.getSuperclass();
		System.out.println(info2.getName()); //->java.lang.Object

		//argsは文字列配列として判定される
		Class<?> info3 = args.getClass();
		System.out.println(info3.isArray()); //->true

		// クラスの情報を入手しあれこれ(使用用途不明)
		Class<?> clazz = RefSample.class;
		// 引数intをもつコンストラクタを取得し、インスタンスを生成する。
		Constructor<?> cons = clazz.getConstructor(int.class);
		RefSample rs = (RefSample) cons.newInstance(256);
		// pubフィールドに関するFieldを取得して読み書き
		Field fi = clazz.getField("times");
		fi.set(rs, 2);                  // rsのtimesに代入
		System.out.println(fi.get(rs)); //rsのtimesを取得
		// 引数2つ(String, int)のhelloメソッドを取得して呼び出す
		Method me = clazz.getMethod("hello", String.class, int.class);
		me.invoke(rs, "reflection!", 128);
		// クラスやメソッドへの修飾(publicやfinalの有無)を調べる
		boolean pubc = Modifier.isPublic(clazz.getModifiers());
		boolean finm = Modifier.isFinal(me.getModifiers());
		System.out.println(pubc + ", " + finm);



//		if(true) {
//			System.out.println("データが壊れています。異常終了します。");
//			// システムを強制終了させる(0:正常終了、他異常終了)
//			System.exit(1);
//		}
		System.out.println("正常終了しました");

	}

}
