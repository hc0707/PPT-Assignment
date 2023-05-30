public class Assignment3 {

	public static void main(String[] args) {

		System.out.println(solution(new int[] { 1, 3, 5, 6}, 5));

	}

	public static int solution(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target)
				return i;
		}
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] < target && nums[i + 1] > target) {
				return i + 1;
			}
		}
		return -1;
	}
}
