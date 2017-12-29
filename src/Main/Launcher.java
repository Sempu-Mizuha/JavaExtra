package Main;

import java.lang.reflect.Method;

import Enum.Start;

public class Launcher {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 1
		String fqcn = args[0];
		Start start = Start.valueOf(args[1]);

		// 2
		long memory = (Runtime.getRuntime().totalMemory()
							- Runtime.getRuntime().freeMemory())/1024/1024;
		System.out.println(memory + " MB");

		try {
			// 3
			Class<?> classFqcn = Class.forName(fqcn);
			Method[] classFqcnMethod = classFqcn.getMethods();
			for( Method m : classFqcnMethod ) {
				System.out.println(m);
			}

			// 4
			Method main = classFqcn.getMethod("main", String[].class);
			switch(start) {
			case E:
				ProcessBuilder pb = new ProcessBuilder("java",classFqcn.getName());
				Process proc = pb.start();
				proc.waitFor(); // process終了までまつ
				break;
			case I:
				main.invoke(null, (Object)args);
				break;
			}

			// 5
			long memory2 = (Runtime.getRuntime().totalMemory()
					- Runtime.getRuntime().freeMemory())/1024/1024;
			System.out.println(memory2 + " MB");

			// 6
			System.exit(0);

		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.exit(1);
		}






	}

}
