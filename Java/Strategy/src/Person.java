
public class Person {
	private Travel travel;

	public Person(Travel travel) {
		this.travel = travel;
	}

	public void takeHolidy() {
		System.out.println("We go to travel");
		travel.travel();
	}
}
