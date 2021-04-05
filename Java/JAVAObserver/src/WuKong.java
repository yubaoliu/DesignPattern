import java.util.Observable;
import java.util.Observer;

public class WuKong implements Observer {

	@Override
	public void update(Observable o, Object arg) {
//		WeatherStation weatherStation = (WeatherStation) o;
//		if (weatherStation.getTemperature() < 0) {
		int temperature = (int) arg;
		if (temperature < 0) {
			System.out.println("Wukong will wear more clothes");
		}
	}

}
