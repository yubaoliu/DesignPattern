
public class Client {

	public static void main(String[] args) {
		System.out.println("Class adaptor main");
		
		NoteBook noteBook = new NoteBook();
		noteBook.PowerOn(new PowerAdaptor());
	}

}
