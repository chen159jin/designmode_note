package adapter;

/**
 * Adapter模式也叫适配器模式，是构造型模式之一 ，通过Adapter模式可以改变已有类（或外部类）的接 口形式。
 * 
 * @author Jin
 *
 */
public class MainClass {
	public static void main(String[] args) {
		Current current = new Current();
		current.use220V();

		Adapter adapter = new Adapter();
		adapter.use18V();

		// Adapter2 adapter2 = new Adapter2(new Current());
		// adapter.use18V();

	}
}
