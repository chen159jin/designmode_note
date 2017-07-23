package templateMethod;

/**
 * Template Method模式也叫模板方法模式，是 行为模式之一，它把具有特定步骤算法中的某些 必要的处理委让给抽象方法，通过子类继承对抽
 * 象方法的不同实现改变整个算法的行为。
 * 
 * - 具有统一的操作步骤或操作过程 - 具有不同的操作细节 - 存在多个具有同样操作步骤的应用场景，但某些具体的操作细节却各不相同
 * 
 * 
 * @author Jin
 *
 */
public class MainClass {
	public static void main(String[] args) {
		MakeCar bus = new MakeBus();
		// bus.makeHead();
		// bus.makeBody();
		// bus.makeTail();
		bus.make();

		System.out.println("-------------------");

		MakeCar jeep = new MakeJeep();
		// jeep.makeHead();
		// jeep.makeBody();
		// jeep.makeTail();
		jeep.make();

		System.out.println("-------------------");

		MakeCar ka = new MakeKa();
		ka.make();
	}
}
