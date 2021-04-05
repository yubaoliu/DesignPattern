
public class Mcdonald implements IStore{

	@Override
	public IChips getChips() {
		System.out.println("Chips from Mcdonald");
		return new MCChips();
	}

	@Override
	public IChicken getChicken() {
		System.out.println("chicken from Mcdonald");
		return new McChicken();
	}

}
