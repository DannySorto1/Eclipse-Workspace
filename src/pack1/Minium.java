package pack1;

public class Minium {

	static int minOfValues(int[] x) {
		int min = 1;
		for (int y : x) {
			if (y < min) {
				min = y;
			}
		}
		return min;

	}

	static int maxValue(int[] x) {
		int max = 0;
		for (int i : x) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}
