public class Assignment4 {
	
	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
		System.out.println(findSubArray(arr));
		
	}
	
	public static int findSubArray(int nums[])
    {
		int n= nums.length;
        int sum = 0;
        int maxsize = -1, startindex = 0;
     
        for (int i = 0; i < n - 1; i++) {
            sum = (nums[i] == 0) ? -1 : 1;
 
            for (int j = i + 1; j < n; j++) {
                if (nums[j] == 0)
                    sum += -1;
                else
                    sum += 1;
 
 
                if (sum == 0 && maxsize < j - i + 1) {
                    maxsize = j - i + 1;
                    startindex = i;
                }
            }
        }
        return maxsize;
    }
}