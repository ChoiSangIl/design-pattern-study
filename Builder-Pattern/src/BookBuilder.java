
public class BookBuilder {
	private Book book;
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public BookBuilder() {
		this.title="noTitle";
		this.author="noAuthor";
		this.price=0;
		this.publisher="noPublisher";
	}
	
	public BookBuilder setTitle(String title) {
		this.title = title;
		return this;
	}
	
	public BookBuilder setAuthor(String author) {
		this.author = author;
		return this;
	}
	
	public BookBuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	
	public BookBuilder setPublisher(String publisher) {
		this.publisher = publisher;
		return this;
	}
	
	public Book build() {
		return new Book(this.title, this.author, this.price, this.publisher);
	}
	
}
