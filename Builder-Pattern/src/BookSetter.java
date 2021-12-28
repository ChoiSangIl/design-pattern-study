
public class BookSetter {
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public void getInfo() {
		System.out.println("제목" + title +"저자:" + author + "가격:" + price + "출판사:" +publisher);
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
