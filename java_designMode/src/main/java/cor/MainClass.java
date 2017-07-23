package cor;

/**
 * Chain of Responsibility（CoR）模式也叫职 责链模式或者职责连锁模式，是行为模式之一， 该模式构造一系列分别担当不同的职责的类的对
 * 象来共同完成一个任务，这些类的对象之间像链 条一样紧密相连，所以被称作职责链模式。
 * 
 * 要实现Chain of Responsibility模式，需要满足该模式 的基本条件：
 * 1，对象链的组织。需要将某任务的所有职责执行对象以链的形式加以组织。
 * 2，消息或请求的传递。将消息或请求沿着对象链传递，以让处于对象链中的对象得到处理机会。 
 * 3，处于对象链中的对象的职责分配。不同的对象完成不同的职责。
 * 4，任务的完成。处于对象链的末尾的对象结束任务并停止消息或请求的继续传递。
 * 
 * @author Jin 
 * 优点：
 *         1。责任的分担。每个类只需要处理自己该处理的工作（不该处理的传递给下一个对象完成），明确各类的责任范围，符合类的最小封装原则。
 *         2。可以根据需要自由组合工作流程。如工作流程发生变化，可以通过重新分配对象链便可适应新的工作流程。
 *         3。类与类之间可以以松耦合的形式加以组织。
 * 缺点： 因为处理时以链的形式在对象间传递消息，根据实现方式不同，有可能会影响处理的速度。
 */
public class MainClass {
	public static void main(String[] args) {
		CarHandler headH = new CarHeadHandler();
		CarHandler bodyH = new CarBodyHandler();
		CarHandler tailH = new CarTailHandler();

		// 组装顺序预先设定好,顺序是车头-->车身-->车尾
		headH.setNextHandler(bodyH);
		bodyH.setNextHandler(tailH);

		// 调用职责链的链头来完成操作
		headH.HandlerCar();

		System.out.println("---------------");

		// 顺序改变，希望是车身-->车头--车尾
		bodyH.setNextHandler(headH);
		headH.setNextHandler(tailH);
		bodyH.HandlerCar();

		// 简便操作
		bodyH.setNextHandler(headH).setNextHandler(tailH);
		bodyH.HandlerCar();

	}
}
