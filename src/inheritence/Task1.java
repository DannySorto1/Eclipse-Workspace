package inheritence;

public class Task1 {
	void yep(boolean a, boolean b) {
		if (a == b) {
			System.out.println(false);
		}
		if (a == false && b == true) {
			System.out.println(true);
		}
		if (a == true && b == false) {
			System.out.println(false);
		}
		if (a == false && b == false) {
			System.out.println(true);
		}
	}

	public static void main(String[] args) {
		Task1 obj = new Task1();
		obj.yep(true, false);
	}
}
