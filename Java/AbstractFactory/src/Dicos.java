
public class Dicos implements IStore{ 
	@Override
	public IChips getChips() {
		// TODO Auto-generated method stub
		System.out.println("Chips from Discos");
		return new DicosChips();
	}

	@Override
	public IChicken getChicken() {
		System.out.println("chicken from Discos");
		return new HandGunChicken();
	}
}
