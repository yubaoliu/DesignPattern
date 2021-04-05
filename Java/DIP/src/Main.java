
public class Main {

	public static void main(String[] args) {
		System.out.println("This is DIP Main");
		Mother mother = new Mother();
		mother.read(new Book());
		mother.read(new Newspaper());
	}

}
