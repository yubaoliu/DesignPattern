
public class DoubleCheck {
	//volatile 保证所对应的变量不会编译器改变执行顺序,
	// volatile 从内存取值， 效率低， 使用Holder的方式来解决这个问题
	private volatile static DoubleCheck doubleCheck = null;
	
	private  DoubleCheck() {
		System.out.println(this.getClass().getSimpleName() + "create");
	}
	public static DoubleCheck getInstance() {
		if(doubleCheck == null) {
			synchronized (DoubleCheck.class) {
				if(doubleCheck == null)
				{
					try {
						Thread.sleep(3000L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// new操作不是一个原子操作
					doubleCheck = new DoubleCheck();
				}
			}
		}
		return doubleCheck;
	}
}
