package flyweight;

/**
 * Flyweight模式也叫享元模式，是构造型模式之 一，它通过与其他类似对象共享数据来减小内存 占用。
 * 
 * @author Jin
 *
 */
public class MainClass {

	public static void main(String[] args) {
		// MyCharacter myChar1 = new MyCharacter('a');
		// MyCharacter myChar2 = new MyCharacter('b');
		// MyCharacter myChar3 = new MyCharacter('a');
		// MyCharacter myChar4 = new MyCharacter('d');
		//
		// myChar1.display();
		// myChar2.display();
		// myChar3.display();
		// myChar4.display();
		//
		// if(myChar1 == myChar3) {
		// System.out.println("true");
		// } else {
		// System.out.println("false");
		// }
		// 1.创建MyCharacter工厂
		MyCharacterFactory factory = new MyCharacterFactory();

		// 2.从工厂中取出相应的MyCharacter
		MyCharacter myChar1 = factory.getMyCharacter('a');
		MyCharacter myChar2 = factory.getMyCharacter('b');
		MyCharacter myChar3 = factory.getMyCharacter('a');
		MyCharacter myChar4 = factory.getMyCharacter('d');

		myChar1.display();
		myChar2.display();
		myChar3.display();
		myChar4.display();
//myChar1与myChar3共享数据  而上面的不能
		if (myChar1 == myChar3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
