package Entity;

import Enum.AccountType;

public class Account implements Comparable<Account>{

	private String accountNo; //口座番号(先頭に空欄が入ることもある)
	private int balance;
	private AccountType accountType;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNo == null) ? 0 : accountNo.hashCode());
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + balance;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Account))
			return false;
		Account other = (Account) obj;
		if (accountNo == null) {
			if (other.accountNo != null)
				return false;
		} else if (!accountNo.equals(other.accountNo))
			return false;
		if (accountType != other.accountType)
			return false;
		if (balance != other.balance)
			return false;
		return true;
	}

	@Override
	public int compareTo(Account o) {
		if(this.accountNo.compareTo(o.accountNo) != 0)
			return this.accountNo.compareTo(o.accountNo);
		return 0;
	}





	public Account(String aNo, AccountType aType) {

	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}


}
