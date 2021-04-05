
public class KFC implements IStore{

	@Override
	public IChips getChips() {
		// TODO Auto-generated method stub
		System.out.println("Chips from KFC");
		return new KFCChips();
	}

	@Override
	public IChicken getChicken() {
		System.out.println("Chicken from KFC");
		return new  OrleanChicken();
	}
	
}
