
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main thread");
		Soldier soldier = new Soldier();
		soldier.killEnemy(new Rifle());
		soldier.killEnemy(new HandGun());
//		soldier.killEnemy(new ToyGun());
	}

}
