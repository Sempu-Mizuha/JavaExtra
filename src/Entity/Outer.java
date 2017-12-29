package Entity;

public class Outer {

	int outerField;
	int outerMember;
	static int outerStaticField;

	// static 有り メンバクラス
	public static class Inner{
		void innerMethod() {
			outerStaticField = 10;
		}
	}

	// static 無し メンバクラス
	public class Inner2{
		void innerMethod() {
			outerField = 10;
		}
	}

	void outerMethod() {
		@SuppressWarnings("unused")
		Inner ic = new Inner();
		@SuppressWarnings("unused")
		int a = 10;
		// ローカルクラス
		class Inner3{
			public void innerMethod() {
				System.out.println("innerMethodです");
				System.out.println(outerMember);
			}
		}
		Inner3 ic3 = new Inner3();
		ic3.innerMethod();

	}

}
