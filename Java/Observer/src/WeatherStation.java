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
	public void notifyObserver() {
		for (Observer o : observers) {
			o.update();
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
		notifyObserver();
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyObserver();
	}
}
