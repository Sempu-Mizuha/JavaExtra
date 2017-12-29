package Entity;

public class Hero extends Character implements Cloneable{

	String name;
	int hp;
	String job;
	Sword sword;
	int gold;

	public Hero(String name) {
		super();
		this.name = name;
	}

	public Hero() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gold;
		result = prime * result + hp;
		result = prime * result + ((job == null) ? 0 : job.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sword == null) ? 0 : sword.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Hero))
			return false;
		Hero other = (Hero) obj;
		if (gold != other.gold)
			return false;
		if (hp != other.hp)
			return false;
		if (job == null) {
			if (other.job != null)
				return false;
		} else if (!job.equals(other.job))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sword == null) {
			if (other.sword != null)
				return false;
		} else if (!sword.equals(other.sword))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hero [name=").append(name).append(", hp=").append(hp).append(", job=").append(job)
				.append(", sword=").append(sword).append(", gold=").append(gold).append("]");
		return builder.toString();
	}

	@Override
	public Hero clone(){
		// TODO 自動生成されたメソッド・スタブ
		try {
			 Hero result = (Hero) super.clone();
			 result.sword = this.sword.clone();
			 return result;
		} catch (CloneNotSupportedException e) {
			// TODO 自動生成された catch ブロック
			throw new RuntimeException();
		}
//		Hero result = new Hero();
//		result.name = this.name;
//		result.hp = this.hp;
//		result.sword = this.sword.clone();
//		return result;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}

	@Override
	public void sleep() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
