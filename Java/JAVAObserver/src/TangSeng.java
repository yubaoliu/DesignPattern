import java.util.Observable;
import java.util.Observer;

public class TangSeng implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		WeatherStation weatherStation = (WeatherStation) o;
		if (weatherStation.getTemperature() > 10) {
			System.out.println("TangSeng will open the air machine");
		}
	}
	

}
