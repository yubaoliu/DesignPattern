import java.util.Observable;

public class WeatherStation extends Observable {

	int temperature =0;
	
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		setChanged();
		notifyObservers(temperature);
	}
}
