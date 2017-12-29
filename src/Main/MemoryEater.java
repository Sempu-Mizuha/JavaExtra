package Main;

public class MemoryEater {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long[] list = new long[1280000];
		int i = 0;
		for( long l : list) {
			list[i] = l+i;
			i++;
		}


	}

}
