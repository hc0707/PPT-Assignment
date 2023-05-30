import java.util.Arrays;

public class Assignment2 {

	public static void main(String[] args) {
		
		solution(new int[] {3,2,2,3}, 3);
		
	}
	
	public static void solution(int[] nums, int val) {
		int k=0;
		for (int i = 0; i < nums.length-k; i++) {
			if (nums[i]==val) {
				k++;
				for (int j = i; j < nums.length-1; j++) {
					nums[j]=nums[j+1];
					if (j==nums.length-2) 
						nums[j+1]=0;
				}
				
			}
		}
		System.out.println(k+" ,nums= "+Arrays.toString(nums));
	}
}
