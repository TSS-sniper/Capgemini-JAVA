package Day18.Sorting.Custom_Sorting;

import java.util.*;

public class Book implements Comparable{
	Double rating;
	int price;
	String title;

	@Override
	public String toString() {
		return "Book [rating=" + rating + ", price=" + price + ", title=" + title + "]";
	}

	public Book(double rating, int price, String title) {
		super();
		this.rating = rating;
		this.price = price;
		this.title = title;
	}
	
	public int compareTo(Object o) {
		Book b2 = (Book) o;
		return this.price - b2.price;

	}

}


class RatingComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Book b1 =(Book) o1;
		Book b2 =(Book) o2;
		return b1.rating.compareTo(b2.rating);
	}
	}
class titleComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Book b1 =(Book) o1;
		Book b2 =(Book) o2;
		return b1.title.compareTo(b2.title);
	}
}
