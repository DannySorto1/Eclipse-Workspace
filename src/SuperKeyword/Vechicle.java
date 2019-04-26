package SuperKeyword;

//class Bike3 {
//
//	int speed = 100;
//
//	void display() {
//		System.out.println(speed);
//	}
//
//}
//
//public class Vechicle extends Bike3 {
//	int speed = 50;
//
//	void display() {
//
//		System.out.println(super.speed);
//	}
//
//	public static void main(String[] args) {
//		Vechicle b = new Vechicle();
//		b.display();
//
//	}
//
//}

class Vechicle {
	Vechicle() {
		System.out.println("Vehicle is created");
	}

	public static void main(String[] args) {
		Bike5 b = new Bike5();
	}
}

class Bike5 extends Vechicle {
	Bike5() {
		super();
		System.out.println("Bike is created");
	}

}
