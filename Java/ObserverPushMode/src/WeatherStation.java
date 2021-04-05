import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherSubject {
	List<Observer> observers = new ArrayList<Observer>();
	private int temperature = 0;
	private int dampness = 0;

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver(Weather weather) {
		for (Observer o : observers) {
			o.update(weather);
		}
	}

	public int getTemprature() {
		return temperature;
	}

	public int getDampness() {
		return dampness;
	}

	public void setDampness(int dampness) {
		this.dampness = dampness;
		notifyWeather();
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyWeather();
	}
	
	private void notifyWeather() {
		Weather weather = new Weather();
		weather.temperature = temperature;
		weather.dampness = dampness;
		notifyObserver(weather);
	}
}
