package bridge;

/**
 * Bridge 模式又叫做桥接模式，是构造型的设 计模式之一。Bridge模式基于类的最小设计原则，通过 使用封装，聚合以及继承等行为来让不同的类承担不同
 * 的责任。它的主要特点是把抽象（abstraction）与行为 实现（implementation）分离开来，从而可以保持各部
 * 分的独立性以及应对它们的功能扩展。
 * 
 * @author Jin
 *
 */
public class MainClass {
	public static void main(String[] args) {

		Engine engine2000 = new Engine2000();
		Engine engine2200 = new Engine2200();

		Car car1 = new Bus(engine2000);
		car1.installEngine();

		Car car2 = new Bus(engine2200);
		car2.installEngine();

		Car jeep1 = new Jeep(engine2000);
		jeep1.installEngine();

		Car jeep2 = new Jeep(engine2200);
		jeep2.installEngine();

	}
}
