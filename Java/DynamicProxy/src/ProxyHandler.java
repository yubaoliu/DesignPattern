import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

	Object realSubject;
	public ProxyHandler(Object realSubject)
	{
		this.realSubject = realSubject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("call the proxy handler");
		Object ret = method.invoke(realSubject, args);
		System.out.println(realSubject.getClass().getSimpleName());
		return ret;
	}

}
