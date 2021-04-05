
public class KFC {
	public Hamberger sell() {
		Bread bread = new Bread();
		Vegetable vegetable = new Vegetable();
		Beef beef = new Beef();
		Hamberger hamberger = new Hamberger(beef, vegetable, bread);
		System.out.println("KFC sell a hamberge");
		return hamberger;
	}
}
