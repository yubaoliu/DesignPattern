
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is strategy main");
		
//		Travel travel = new BikeTravel();
		Travel travel = new AirPlaneTravel();
		
		Person wk = new Person(travel);
		wk.takeHolidy();
		
	}

}
