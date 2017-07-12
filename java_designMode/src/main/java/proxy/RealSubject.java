package proxy;

/**
 * 
 * RealSubject（真实主题角色）：      定义了代理角色所代表的真实对象。
 * 
 * @author Jin
 *
 */
public class RealSubject implements Subject {

	public void sailBook() {
		System.out.println("卖书");
	}

}
