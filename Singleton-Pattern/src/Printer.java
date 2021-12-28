public class Printer {
	private static Printer printer = null;
	private int count = 0;

	private Printer(){}

	public static Printer getInstance() {
		if(printer == null) {
			printer = new Printer();
		}
		return printer;
	}

	public void print(String input) {
		count++;
		System.out.println(input + "count : "+ count);
	}
}