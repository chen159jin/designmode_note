package proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class MainClass {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		//创建一个与代理对象相关联的InvocationHandler
		MyHandler myHandler = new MyHandler();
		myHandler.setRealSubject(realSubject);
		//创建一个与代理对象相关联的InvocationHandler
		Subject proxySubject = (Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(), realSubject.getClass().getInterfaces(), myHandler);
		proxySubject.sailBook();
	}
}
