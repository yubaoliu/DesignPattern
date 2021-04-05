//优点：线程安全
//缺点：过早浪费资源
public class Hungury {
	private static Hungury hungury  = new Hungury();
	
	private Hungury() {}
	
	public static Hungury getInstance() {
		System.out.println("create hungury "+ "getInstance");
		// TEST:
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hungury;
	}
}
