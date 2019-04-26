package inheritence;

public class Parent {
	public Parent() {
		System.out.println("I am from Parent Class");
	}

	public String reverseString(String name) {
		String reversed = "";
		for (int x = name.length() - 1; x >= 0; x--) {
			reversed = reversed + name.charAt(x);

		}
		return reversed;
	}

	public String reverse2(String first, String Second) {
		String reversed = "";
		if (first.length() == Second.length()) {
			for (int x = first.length() - 1; x >= 0; x--) {
				reversed = reversed + first.charAt(x) + Second.charAt(x);

			}

		} else {
			System.out.println("length don't match");
		}
		return reversed;
	}

	public static void main(String[] args) {
		Parent obj = new Parent();
		System.out.println(obj.reverseString("WhatsUp"));
		System.out.println(obj.reverse2("one", "twoo"));

	}

}
