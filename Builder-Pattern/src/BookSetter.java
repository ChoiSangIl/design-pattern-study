
public class BookSetter {
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public void getInfo() {
		System.out.println("����" + title +"����:" + author + "����:" + price + "���ǻ�:" +publisher);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
