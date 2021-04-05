
public class TangSeng implements Observer {
	WeatherStation weatherStation;

	public TangSeng(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}

	@Override
	public void update() {
		if (weatherStation.getDampness() > 50) {
			System.out.println("TangSeng open the air machine");
		}
	}
}
