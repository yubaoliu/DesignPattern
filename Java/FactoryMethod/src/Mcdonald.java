
public class Mcdonald implements IStore{

	@Override
	public IChips getChips() {
		// TODO Auto-generated method stub
		System.out.println("Chips from Mcdonald");
		return new MCChips();
	}

}
