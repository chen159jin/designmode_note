package cor;

/**
 * concreteHandler     具体的处理类。
 * 
 * @author Jin
 *
 */
public class CarBodyHandler extends CarHandler {

	public void HandlerCar() {
		System.out.println("组装车身");
		if (this.carHandler != null) {
			this.carHandler.HandlerCar();
		}
	}

}
