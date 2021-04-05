
public class Client {

	public static void main(String[] args) {
		System.out.println("Class object adaptor main");
		
		NoteBook noteBook = new NoteBook();
		PowerAdapter powerAdapter = new PowerAdapter(new Power220V());
		noteBook.TurnOn(powerAdapter);
	}

}
