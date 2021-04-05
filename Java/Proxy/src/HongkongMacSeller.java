
public class HongkongMacSeller implements IMacSeller{
	IMacSeller seller = new USAMacSeller();
	
	@Override
	public void buy() {
		seller.buy();
		System.out.println("Buy a macbook from Hongkong");
	}
	
}
