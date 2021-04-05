import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		System.out.println("Dynamic Proxy main");
		
		IKFC kfc = (IKFC)Proxy.newProxyInstance(Client.class.getClassLoader(), 
				new Class[] {IKFC.class},
				new ProxyHandler(new KFC()));
		kfc.eat();
		
		ImiSeller mi = (ImiSeller)Proxy.newProxyInstance(Client.class.getClassLoader(), 
				MiStore.class.getInterfaces(),
				new ProxyHandler(new MiStore()));
		mi.buy();
	}
}
