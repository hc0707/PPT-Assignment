import java.util.Arrays;

public class Assignment4 {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(new int[] { 9,9,9})));
		
	}

	public static char[] solution(int[] nums) {
		int k=0;
		int multiplier= (int) Math.pow(10, nums.length-1);
		for (int i = 0; i < nums.length; i++) {
			k+=nums[i]*multiplier;
			multiplier/=10;
		}
		k++;
		return String.valueOf(k).toCharArray();
	}
}
