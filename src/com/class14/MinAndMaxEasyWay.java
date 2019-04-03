package com.class14;

import java.util.Arrays;

public class MinAndMaxEasyWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={6,-1,-2,-3,0,1,2,3,4};
		Arrays.sort(nums);
		System.out.println("Minimum = " + nums[0]);
		System.out.println("Maximum = " + nums[nums.length-1]);
	}

}
