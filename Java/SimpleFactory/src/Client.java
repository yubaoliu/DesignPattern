
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is Simple Factory main");
		Restaurant restaurant = new Restaurant();
		
		IFood food = restaurant.getFood("chip");
		if(food!=null)
		{
			food.eat();
		}
		
		food = restaurant.getFood("chicken");
		if(food!=null)
		{
			food.eat();
		}
		
		food = restaurant.getFood("others");
		if(food!=null)
		{
			food.eat();
		}
		
	}

}
