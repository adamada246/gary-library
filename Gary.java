import java.io.InputStream;
import java.util.Scanner;
//Build 4
class Gary {
	private Scanner gary;

	Gary() {
		gary = new Scanner(System.in);
	}
	Gary(Scanner g) {
		gary = g;
	}
	Gary(InputStream source){
		gary = new Scanner(source);
	}
	public int getBuild() {
		return 4;
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
	public String toString() {
		return "gary";
	}
	public Scanner getGary() {
		return gary;
	}

	public void setGary(Scanner g) {
		gary = g;
	}
	public void setGary(InputStream source) {
		gary= new Scanner(source);
	}
}
