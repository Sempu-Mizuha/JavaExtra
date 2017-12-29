package dto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Item implements Serializable, Comparable<Item>, Cloneable {

	/**
	 *
	 */
	private static final long serialVersionUID = 20171224L;
	private String name;
	private int price;
	private int weight;



	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}



	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}



	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}



	@Override
	public int compareTo(Item o) {
		// TODO 自動生成されたメソッド・スタブ
		return CompareToBuilder.reflectionCompare(this, o);
	}




	@Override
	public Item clone() {
		// TODO 自動生成されたメソッド・スタブ
		Item result = null;
		try {
			result = (Item) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return result;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}


}
