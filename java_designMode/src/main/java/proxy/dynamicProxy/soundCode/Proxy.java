package proxy.dynamicProxy.soundCode;

import java.lang.reflect.Constructor;

/**
 * @author Jin
 * @Title: Proxy
 * @ProjectName designmode_note
 * @Description: TODO
 * @date 2018/12/5/00515:13
 */
public class Proxy {
    public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
            throws IllegalArgumentException {
        //所有被实现的业务接口
        final Class<?>[] intfs = interfaces.clone();
        //寻找或生成指定的代理类
        Class<?> cl = getProxyClass0(loader, intfs);
        try {
            //通过反射类中的Constructor获取其所有构造方法
            final Constructor<?> cons = cl.getConstructor(new Class[] { InvocationHandler.class });
            //通过Constructor返回代理类的实例
            return cons.newInstance(new Object[]{h});
        } catch (Exception e) {
            throw new InternalError(e.toString(), e);
        }
//        return null;
    }

    private static Class<?> getProxyClass0(ClassLoader loader,
                                    Class<?>... interfaces) {
        return null;
    }
}
