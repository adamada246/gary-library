import java.util.Scanner;
//Build 3
class Gary {
	private Scanner gary;

	Gary() {
		gary = new Scanner(System.in);
	}

	Gary(Scanner g) {
		gary = g;
	}

	public int getBuild() {
		return 3;
	}
	public boolean isGary(String n) {
		if (n.toLowerCase().contains("gary")) {
			return true;
		}
		return false;
	}

	public void destroyGary(Scanner gary) {
		gary.close();
	}

	public Scanner birthGary(Scanner gary) {
		return gary.reset();
	}

	public Scanner getGary() {
		return gary;
	}

	public void setGary(Scanner g) {
		gary = g;
	}
}
