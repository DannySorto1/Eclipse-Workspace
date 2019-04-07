package pack1;

public class Calculator1 {

static	int sum(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	static int minVal(int[] x) {
		int min = 1;
		for (int y : x) {
			if (y < min) {
				min = y;
			}
		}
		return min;
	}

static	int maxVal(int[] x) {
		int max = 0;
		for (int i : x) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
	static double average(int[] my_array) {
		double total = 0;
		double average = 0;
        for(int i=0; i<my_array.length; i++){
        	total = total + my_array[i];
        	  average = total / my_array.length;
        }

return average;
		
		
	}
}
