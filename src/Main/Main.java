/**
 *
 */
package Main;

import java.util.regex.Pattern;

import Entity.Hero;

/**
 * @author MIBOX
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		@SuppressWarnings("unused")
		String nullParameter = null;

		if(s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if(s2.equalsIgnoreCase(s3)) {
			// ケース:大文字と小文字の区別
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です"); // 8
		if(s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}

		s1 = "Java and JavaScript";

		if(s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		if(s1.startsWith("Java")) {
			System.out.println("文字列s1は、Javaが始めにあります");
		}
		if(s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}
		System.out.println("文字列s1で最初にJavaが登場する位置は"
										+ s1.indexOf("Java")); // 0
		System.out.println("文字列s1で最後にJavaが登場する位置は"
										+ s1.lastIndexOf("Java")); // 9

		s1 = "Java programming";
		System.out.println("文字列3文字目以降は"
								+ s1.substring(3)); // a programming

		System.out.println("文字列3~8文字目以降は"
								+ s1.substring(3, 8)); // a pro

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 5000 ; i++) {
			sb.append("Java");
		}
		//String s = sb.toString();
		System.out.println(sb);

		String s10 = "";
		for(int i = 0; i < 5000 ; i++) {
			s10 += "Java";
		}
		System.out.println(s10);

		Pattern pattern = Pattern.compile("^.*$");
		System.out.println(pattern.matcher("").matches());

		String s = "Java";
		System.out.println(s.matches("Java")); // true
		System.out.println(s.matches("JavaJava")); // false
		System.out.println(s.matches("java")); // false
		System.out.println(s.matches("J.va")); // true
		System.out.println("Jaaaaava".matches("Ja*va")); // true
		System.out.println("あいskfhbldふぇjr".matches(".*")); // true

		System.out.println("----------------------------");

		System.out.println(s.matches("Ma.*")); // Maで始まる
		System.out.println(s.matches(".*ful")); // fulで終わる
		System.out.println("url".matches("[a-z]{3}")); // true

		s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		for(String w : words) {
			System.out.print(w + "->");
		}
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w); // aXc,dXf:gXi

		Hero hero = new Hero();
		hero.setName("minato");
		hero.setJob("hero");
		hero.setGold(28000);
		final String FORMAT = "%-8s  %-6s  所持金%,5d\n";
		s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
		System.out.println(s);
		System.out.printf(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
		System.out.printf("製品番号%s-%02d\n","SJV",3);



	}

}
