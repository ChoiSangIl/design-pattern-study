
public class Book {
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	public void getInfo() {
		System.out.println("����" + title +"����:" + author + "����:" + price + "���ǻ�:" +publisher);
	}
}
