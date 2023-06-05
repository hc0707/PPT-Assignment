public class Assignment2 {
	
	public static void main(String[] args) {
		int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		System.out.println(searchMatrix(matrix, 2));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		boolean result=false;
		int column=matrix[0].length;
		int min= 0;
        int max =matrix.length*column;
        int mid=0;
        while (min<=max) {
            mid=(min+max)/2;
            int element = matrix[mid/column][mid%column];
            if (target==element) {
                result=true;
                break;
            }
            else if(target<element)
            max=mid-1;
            else if(target>element)
            min=mid+1;
        }
        return result;
	}
}