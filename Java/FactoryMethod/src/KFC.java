
public class KFC implements IStore{

	@Override
	public IChips getChips() {
		// TODO Auto-generated method stub
		System.out.println("Chips from KFC");
		return new KFCChips();
	}
	
}
