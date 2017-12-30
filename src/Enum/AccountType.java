package Enum;

import java.util.HashMap;
import java.util.Map;

public enum AccountType {
	FUTSU(1), //jjjjjj
	TOUZA(2), //uuuuuu
	TEIKI(3); //ooooo

	private int num;
	private Map<Integer, AccountType> typeByValue;

	private AccountType(int num) {
		this.num = num;
	}

	/**
	 * @return num
	 */
	public int getNum() {
		return num;
	}

	public AccountType getTypeByValue(int str){
		try {
			makeMap();
			return getType(str);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return null;
		}
	}

	private void makeMap(){
		if(typeByValue == null) {
			typeByValue = new HashMap<Integer, AccountType>();
			for(AccountType v : values()){
				typeByValue.put(v.getNum(), v);
			}
		}
	}

	private AccountType getType(int str){
		AccountType accountType = typeByValue.get(str);
		if(accountType == null) {
			throw new IllegalArgumentException("undefined : " + str);
		}
		return accountType;
	}

}
