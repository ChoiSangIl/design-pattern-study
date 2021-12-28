
public class PatternTest {

	public static void main(String[] args) {
		//�����ڸ� ���� filde�� ����
		Book book = new Book("�����͸�2��", "��ƾ�Ŀ﷯", 30000, "�Ѻ� �̵��");
		book.getInfo();
		
		//�����ڰ� ��������? -> .... �����ϱ� �� ����ڴ�
		//Book book = new Book("�����͸�2��", "��ƾ�Ŀ﷯", 30000, "�Ѻ� �̵��", "10", "������ �ű�", .....);
		
		//Setter�� �̿��ϸ� ��������� ������ �ְ� �Ҽ� ���� ������?
		BookSetter book2 = new BookSetter();
		book2.setTitle("�����͸�2��");
		book2.setAuthor("��ƾ�Ŀ﷯");
		book2.setPrice(30000);
		book2.setPublisher("�Ѻ� �̵��");
		book2.getInfo();
		//������ �ִ� ������, �ش簪�� �Һ����� �����ϰ� �ʹٸ�? �����ڸ� �̿��ؼ� �ϸ������, �׷���� �Ű������� �������� �����ϱ� �����.
		
		//Builder�� �̿��� ���� ���
		Book book3 = new BookBuilder()
					.setTitle("�����͸�2��")
					.setAuthor("��ƾ�Ŀ﷯")
					.setPrice(30000)
					.setPublisher("�Ѻ� �̵��")
					.build();
		book3.getInfo();
		
	}

}
