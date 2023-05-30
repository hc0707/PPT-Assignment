import java.util.Arrays;

public class Assignment8 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {1,2,2,3})));
	}

	public static int[] solution(int[] s) {
		int[] result= new int[2];
		
		for (int i = 0; i < s.length-1; i++) {
			if (s[i+1]-s[i]!=1) {
				result[0]=s[i+1];
				result[1]=s[i]+1;
				break;
			}
			
		}
		return result;
	}
}
