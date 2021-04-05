
public class Restaurant {
	public IFood getFood(String name) {
		switch (name) {
		case "chip":
			return new Chips();
		case "chicken":
			return new Chicken();
		default:
			System.out.println("We cannot provide this kind of food");
			return null;

		}
	}
}
