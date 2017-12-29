package Entity;

public class Sword implements Cloneable{

	private String sword;

	public Sword(String sword) {
		this.sword = sword;
	}

	public Sword() {
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sword [sword=").append(sword).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sword == null) ? 0 : sword.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Sword))
			return false;
		Sword other = (Sword) obj;
		if (sword == null) {
			if (other.sword != null)
				return false;
		} else if (!sword.equals(other.sword))
			return false;
		return true;
	}

	@Override
	public Sword clone(){
		// TODO 自動生成されたメソッド・スタブ
		Sword result = new Sword();
		result.sword = this.sword;
		return result;
	}

	public String getSword() {
		return sword;
	}

	public void setSword(String sword) {
		this.sword = sword;
	}

}
