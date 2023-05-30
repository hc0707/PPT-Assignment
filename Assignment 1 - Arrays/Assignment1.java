import java.util.Arrays;

/***Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.*/

public class Assignment1 {

	public static void main(String[] args) {
		
		int[] result = solution(new int[]{2,7,11,15}, 9);
		System.out.println(Arrays.toString(result));
		
	}
	
	public static int[] solution(int[] nums, int target) {
		int[] result=new int[2];
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]+nums[j]==target) {
					result[0]=nums[i];
					result[1]=nums[j];
					return result;
				}
			}
		}
		return result;
	}
}
