package Entity;

import Enum.KeyType;

public class StrongBox<E> {
	private int count;
	private E obj;
	private KeyType keyType;

	public StrongBox(KeyType keyType) {
		this.count = 0;
		this.keyType = keyType;
	}

	public E get() {
		this.count++;
		switch (keyType) {
		case PADLOCK:
			if(count >= 1024) {
				return obj;
			}
			break;
		case BUTTON:
			if(count >= 10000) {
				return obj;
			}
			break;
		case DIAL:
			if(count >= 30000) {
				return obj;
			}
			break;
		case FINGER:
			if(count >= 1000000) {
				return obj;
			}
			break;
		}
		return null;
	}

	public void put(E obj) {
		this.obj = obj;
	}


}
