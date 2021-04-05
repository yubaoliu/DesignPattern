
public class PowerAdaptor extends Power220 implements Power5V {

	@Override
	public void getPower5V() {
		super.getPower220();
		transform();
		System.out.println("output 5V");
	}
	
	void transform() {
		System.out.println("convert 220V to 5V");
	}
	

}
