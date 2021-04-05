
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is Factory method main");
		
		IStore store = new Dicos();
		store.getChips().eat();
		
	}
}
