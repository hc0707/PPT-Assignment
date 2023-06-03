import java.util.Arrays;
import java.util.Comparator;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		int[][] intervals=new int[][] {{0,30},{5,10},{15,20}};
		System.out.println(solutions(intervals));;
	}

	public static boolean solutions(int[][] intervals) {

		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] i1, int[] i2) {
				return i1[0] - i2[0];
			}
		});

		for (int i = 0; i < intervals.length - 1; i++) {
			if (intervals[i][1] > intervals[i + 1][0])
				return false;
		}
		return true;

	}

}
