package pack1;

public class Application1 {
	public static void main(String[] args) {
		Animals anim = new Animals();

		System.out.println("this anim");

		System.out.println(anim.age);
		System.out.println(anim.weight);
		System.out.println(anim.breed);
		System.out.println(anim.name);

		anim.name = "todd";

		Animals anim2 = new Animals();

		System.out.println("this anim 2");

		System.out.println(anim2.age);
		System.out.println(anim2.weight);
		System.out.println(anim2.breed);
		System.out.println(anim2.name);

		Animals anim3 = new Animals();

		System.out.println("this anim 3");
		anim3.name = "Robby";
		System.out.println(anim3.age);
		System.out.println(anim3.weight);
		System.out.println(anim3.breed);
		System.out.println(anim3.name);

		int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		System.out.println("printing min value");

		System.out.println(
				"Min value is " + Minium.minOfValues(my_array) + " and Max Value is " + Minium.maxValue(my_array));
		

		  Calculator1 calc = new Calculator1();
	        
	        
	        System.out.println(calc.sum(12, 13, 14));
	        System.out.println(calc.average(12, 13, 14));
	        System.out.println(calc.min(12, 13, 14));
	        System.out.println(calc.max(12, 13, 14));
	}

}
