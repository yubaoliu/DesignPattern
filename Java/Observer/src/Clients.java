
public class Clients {

	public static void main(String[] args) {
		System.out.println("This is observer main");
		
		WeatherStation weatherStation = new WeatherStation();
		
		WuKong wk = new WuKong(weatherStation);
		TangSeng ts = new TangSeng(weatherStation);
		
		weatherStation.registerObserver(wk);
		weatherStation.registerObserver(ts);
		
		weatherStation.setTemperature(-20);
		weatherStation.setDampness(100);
	}

}
