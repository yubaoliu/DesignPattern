// 在没有使用类时不创建，可以节约内存
//优点：使用时候才创建，资源节约
//缺点：为线程安全要付出额外代价
public class Lazy {
	private static Lazy lazy = null;

	private Lazy() {
	}
	// synchronized 类似于加锁, 如果去掉synchronized，可能得到不同的实例
	// synchronized 的效率很底, 可使用双重锁机制来解决这个问题，参考DoubleCheck
	public synchronized static Lazy getInstance() {
		if (lazy == null) {
			System.out.println("create lazy "+ "getInstance");
			try {
				Thread.sleep(3000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lazy = new Lazy();
		}
		return lazy;
	}

}
