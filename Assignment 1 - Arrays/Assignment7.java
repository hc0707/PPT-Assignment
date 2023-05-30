import java.util.Arrays;

public class Assignment7 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {0,1,0,3,12})));
	}

	public static int[] solution(int[] nums) {
		int p1=0;
		int p2=0;
		while (p1<nums.length) {
			if (nums[p1]!=0) {
				int temp=nums[p1];
				nums[p1]=nums[p2];
				nums[p2]=temp;
				p2++;
			}
			p1++;
		}
		return nums;
	}
}
