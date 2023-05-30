import java.util.Arrays;

public class Assignment5 {

	public static void main(String[] args) {
		solution(new int[] {1,2,3,0,0,0}, new int[] {2,5,6}, 3, 3);
		
	}

	public static void solution(int[] nums1, int[] nums2, int m, int n) {
		int p=0;
		for (int i = m; i < m+n; i++) {
			nums1[i]=nums2[p];
			p++;
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}
}
