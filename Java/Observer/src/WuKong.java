
public class WuKong implements Observer {
	WeatherStation weatherStation;
	
	public WuKong(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}
	
	@Override
	public void update() {
		if(weatherStation.getTemprature()<0) {
			System.out.println("WuKong wear more clothes");
		}
	}

}
