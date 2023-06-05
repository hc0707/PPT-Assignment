public class Assignment3 {

	public static void main(String[] args) {
		int[] arr= {0,2,3,4,1};
		System.out.println(mountainArray(arr));
	}

	public static boolean mountainArray(int[] arr) {
		if (arr.length<3) return false;
		
		boolean result = false;
		l1: {
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[i - 1]) {
					for (int j = i; j < arr.length; j++) {
						if (arr[j] >= arr[j - 1])
							break l1;
					}
					result = true;
					break;
				}
				else if (arr[i] == arr[i - 1]) break;
			}
		}
		return result;
	}
}