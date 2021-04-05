// 这是最乡级的单例模式的写法
public class Holder {
	private static class InnerHolder{
		private static Holder instance = new Holder();
	}
	
	private Holder() {
		System.out.println("Holder creator");
	}
	
	public static Holder getInstance() {
		System.out.println("Holder getInstance");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return InnerHolder.instance;
	}
}
