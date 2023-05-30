public class Assignment6 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 1 }));

	}

	public static boolean solution(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] - nums[j] == 0)
					return true;
			}
		}
		return false;
	}
}
