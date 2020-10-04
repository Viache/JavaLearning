package com.twoSum.SlavaKravtson;
import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		int [] nums = {3, 2, 4};
		int target = 6;
		int [] twoSum = null;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					twoSum = new int [] {i, j};
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(twoSum));
	}
}
