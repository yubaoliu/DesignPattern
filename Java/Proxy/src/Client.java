
public class Client {

	public static void main(String[] args) {
		System.out.println("Proxy main");
		
		IMacSeller seller = new HongkongMacSeller();
		seller.buy();
	}
}
