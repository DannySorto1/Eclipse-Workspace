package pack1;

public class Application {

	public static void main(String[] args) {
		Human person1 = new Human();

		

		System.out.println(person1.eyeColour);
		System.out.println(person1.height);
		System.out.println(person1.weight);
		System.out.println(person1.gender);

		Human person2 = new Human();

		Human.eyeColour = "blue";

		System.out.println(person2.eyeColour);
		System.out.println(person2.height);
		System.out.println(person2.weight);
		System.out.println(person2.gender);
		
	}

}
