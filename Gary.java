import java.io.InputStream;
import java.util.Scanner;
//Build 5
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
		return 5;
	}
	public static boolean isGary(String n) {
		return n.toLowerCase().contains("gary");
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
