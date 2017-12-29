package Entity;

public class Poket<E> {
	private E data; // 格納用の変数

	/**
	 * @return data
	 */
	public E get() {
		return data;
	}

	/**
	 * @param data セットする data
	 */
	public void put(E data) {
		this.data = data;
	}


}
