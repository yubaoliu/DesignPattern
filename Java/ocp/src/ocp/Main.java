package ocp;

public class Main {
	public static void main(String[] args)
	{
		System.out.println("main test");
		CharDisplayManager manager = new CharDisplayManager();
		manager.display(new LineChart());
		manager.display(new PieChart());
		manager.display(new BarChart());
		manager.display(new newChart());
//		manager.distplay("bar");
//		manager.distplay("pie");
	}
}
