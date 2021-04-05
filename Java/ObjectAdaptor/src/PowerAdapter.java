
public class PowerAdapter implements Power12V {
	private Power220V power220V;
	
	public PowerAdapter(Power220V power)
	{
		power220V = power;
	}
	
	@Override
	public void getPower12V() {
		power220V.getPower220();
		transform();
		System.out.println("Output 12V");
	}

	private void transform() {
		// TODO Auto-generated method stub
		System.out.println("Convert 220V to 12V");
	}
}
