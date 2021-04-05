
public class TangSeng implements Observer {

	@Override
	public void update(Weather weather) {
		if (weather.dampness > 50) {
			System.out.println("TangSeng open the air machine");
		}
	}
}
