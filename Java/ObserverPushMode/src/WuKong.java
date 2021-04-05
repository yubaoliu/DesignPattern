
public class WuKong implements Observer {

	@Override
	public void update(Weather weather) {
		if (weather.temperature < 0) {
			System.out.println("WuKong wear more clothes");
		}
	}

}
