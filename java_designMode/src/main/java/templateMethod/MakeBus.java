package templateMethod;

/**
 * ConcreteClass： 具体的实现子类
 * 
 * @author Jin
 *
 */
public class MakeBus extends MakeCar {

	public void makeBody() {
		System.out.println("bus:组装车身");
	}

	public void makeHead() {
		System.out.println("bus:组装车头");
	}

	public void makeTail() {
		System.out.println("bus:组装车尾");
	}
}
