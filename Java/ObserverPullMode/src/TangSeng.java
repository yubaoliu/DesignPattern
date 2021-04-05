
public class TangSeng implements Observer {

	@Override
	public void update(WeatherStation weatherStation) {
		if (weatherStation.getDampness() > 50) {
			System.out.println("TangSeng open the air machine");
		}
	}
}
