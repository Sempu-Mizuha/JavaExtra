package Main;

public class pra1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuilder number = new StringBuilder();
		for( int i = 1 ; i <= 100 ; i++ ) {
			number.append(i).append(",");
		}
		String[] st = number.toString().split(",");
		for( String s : st ) {
			System.out.println(s);
		}

		System.out.println(folderFile("c:¥javadev", "readme.txt"));

	}

	public static String folderFile(String folder, String file) {
		StringBuilder folderFile = new StringBuilder();
		folderFile.append(folder);
		if(!folder.endsWith("¥")) {
			folderFile.append("¥");
		}
		folderFile.append(file);

		return folderFile.toString();
	}

}
