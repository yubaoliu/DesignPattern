/* 线程安全懒汉式单例模式有三种方法
 * 1. Synchronized  
 * 2. 双重检测锁单例模式
 * 3. 内部类Holder式 （最终版本）
*/
public class Client {

	public static void main(String[] args) {
		System.out.println("This is singleton main");
//		System.out.println("This is hungury: "+ Hungury.getInstance());
//		System.out.println("This is lazy: "+ Lazy.getInstance());
//		System.out.println("This is hungury: "+ Hungury.getInstance());
//		System.out.println("This is lazy: "+ Lazy.getInstance());
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("this is singleton object: " + Hungury.getInstance());
				System.out.println("This is lazy: "+ Lazy.getInstance());
				System.out.println("This is DoubleCheck: "+ DoubleCheck.getInstance());
				System.out.println("This is Holder: "+ Holder.getInstance());
			}
			
		}).start();
		System.out.println("This is hungury: "+ Hungury.getInstance());
		System.out.println("This is lazy: "+ Lazy.getInstance());
		System.out.println("This is DoubleCheck: "+ DoubleCheck.getInstance());
		System.out.println("This is Holder: "+ Holder.getInstance());
	}

}
