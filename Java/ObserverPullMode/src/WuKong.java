
public class WuKong implements Observer {

	@Override
	public void update(WeatherStation weatherStation) {
		if (weatherStation.getTemprature() < 0) {
			System.out.println("WuKong wear more clothes");
		}
	}

}
