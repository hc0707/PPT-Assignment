import java.util.Arrays;

public class Assignment1 {

	public static void main(String[] args) {
		
		String s="IDID";
		int[] perm = perm(s);
		System.out.println(Arrays.toString(perm));
	}

	public static int[] perm(String s) {

		int[] res = new int[s.length() + 1];
		int leftPointer = 0;
		int rightPointer = s.length();
		int idx = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == 'I') {
				res[idx] = leftPointer;
				idx++;
				leftPointer++;
			} else {
				res[idx++] = rightPointer--;

			}
		}
		if (s.charAt(s.length() - 1) == 'I') {
			res[idx] = leftPointer;
		} else {
			res[idx] = rightPointer;
		}

		return res;
	}
}
