package proxy.dynamicProxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
    //invocationHandler持有的被代理对象
    private RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    /**
     * proxy:代表动态代理对象
     * method：代表正在执行的方法
     * args：代表调用目标方法时传入的实参
     */
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object result = null;
        dazhe();
        try {
            result = method.invoke(realSubject, args);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        give();
        return result;
    }

    public void dazhe() {
        System.out.println("打折");
    }

    public void give() {
        System.out.println("赠送代金券");
    }

}
