package bridge;

/**
 * Refined Abstraction Abstraction子类 Implementor 行为实现类接口
 * (Abstraction接口定义了基于Implementor接口的更高层次的操作) ConcreteImplementor Implementor子类
 * 
 * @author Jin
 *
 */
public class Engine2000 implements Engine {

	public void installEngine() {
		System.out.println("安装2000cc发动机");
	}

}
