package proxy.dynamicProxy.soundCode;

import java.lang.reflect.Method;

/**
 * @author Jin
 * @Title: InvocationHandler
 * @ProjectName designmode_note
 * @Description: TODO
 * @date 2018/12/6/00610:42
 */
public interface InvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
