
public class Client {

	public static void main(String[] args) {
		System.out.println("This is Javaobserver main");
		
		WeatherStation weatherStation = new WeatherStation();
		
		WuKong wk = new WuKong();
		TangSeng ts = new TangSeng();
		
		weatherStation.addObserver(wk);
		weatherStation.addObserver(ts);
		
		weatherStation.setTemperature(-20);
		weatherStation.setTemperature(20);
	}

}
