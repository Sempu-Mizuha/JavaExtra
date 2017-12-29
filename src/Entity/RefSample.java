package Entity;

public class RefSample {
	public int times = 0;

	public RefSample(int times) {
		this.times = times;
	}

	public void hello(String msg) {
		this.hello(msg, this.times);
	}

	public void hello(String msg, int t) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello, " + msg + " x" + t);
	}



}
