
public interface WeatherSubject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver(Weather weather);
}
