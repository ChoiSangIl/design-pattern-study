
public class PatternTest {

	public static void main(String[] args) {
		//생성자를 통한 filde값 설정
		Book book = new Book("리펙터링2판", "마틴파울러", 30000, "한빛 미디어");
		book.getInfo();
		
		//생성자가 많아지면? -> .... 설정하기 참 힘들겠다
		//Book book = new Book("리펙터링2판", "마틴파울러", 30000, "한빛 미디어", "10", "남기혁 옮김", .....);
		
		//Setter를 이용하면 멤버변수를 가독성 있게 할수 있지 않을까?
		BookSetter book2 = new BookSetter();
		book2.setTitle("리팩터링2판");
		book2.setAuthor("마틴파울러");
		book2.setPrice(30000);
		book2.setPublisher("한빛 미디어");
		book2.getInfo();
		//가독성 있다 하지만, 해당값을 불변으로 설정하고 싶다면? 생성자를 이용해서 하면되지만, 그럴경우 매개변수가 많아지면 설정하기 힘들다.
		
		//Builder를 이용한 생성 방법
		Book book3 = new BookBuilder()
					.setTitle("리펙터링2판")
					.setAuthor("마틴파울러")
					.setPrice(30000)
					.setPublisher("한빛 미디어")
					.build();
		book3.getInfo();
		
	}

}
