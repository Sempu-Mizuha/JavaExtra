package Entity;

import java.util.Date;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Book implements Cloneable, Comparable<Book> {

	private String title;
	private Date publishDate;
	private String comment;



	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	/* (非 Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	/* (非 Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public int compareTo(Book o) {
		return CompareToBuilder.reflectionCompare(this, o);
	}

	/* (非 Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Book clone(){
		try {
			Book result = (Book) super.clone();
			result.publishDate = (Date) this.publishDate.clone();
			return result;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}


	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title セットする title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return publishDate
	 */
	public Date getPublishDate() {
		return publishDate;
	}

	/**
	 * @param publishDate セットする publishDate
	 */
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	/**
	 * @return comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment セットする comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

}
