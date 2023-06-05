import java.util.Arrays;

public class Assignment {

	public static void main(String[] args) {
		int[] nums= {0,0,1,0,1};
		shiftArray(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void shiftArray(int[] nums) {
		int p1=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				int swap=nums[i];
				nums[i]=nums[p1];
				nums[p1]=swap;
				p1++;
			}
		}
	}
}
