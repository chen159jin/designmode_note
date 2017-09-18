package memento;

public class Client {
	public static void main(String[] args) {
	//public static void main(final String[] args) {
		PlayerOriginator player = new PlayerOriginator(10, 100, 1000);
		System.out.print("player's original attributes are ");
		player.showState();

		final Caretaker taker = new Caretaker();
		taker.setMemento(player.createMemento());

		player.setVitality(70);
		player.setAggressivity(60);
		player.setDefencivity(20);

		System.out.print("after player fight with Boss, player's attributes are ");
		player.showState();

		// reset player's attribute
		player.setMemento(taker.getMemento());
		System.out.print("after resetting, player's attributes are ");
		player.showState();

	}
}
