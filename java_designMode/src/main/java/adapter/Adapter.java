package adapter;
/**
 * 1.通过继承实现Adapter
 * @author Jin
 *
 */
public class Adapter extends Current{
	public void use18V() {
		System.out.println("使用适配器");
		this.use220V();
	}
}
