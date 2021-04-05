
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is Abstract Factory main");
		
		IStore iStore = new Dicos();
		IChicken iChicken = iStore.getChicken();
		iChicken.eat();
		
		iStore = new Mcdonald();
		IChips iChips = iStore.getChips();
		iChips.eat();
		
	}
}
