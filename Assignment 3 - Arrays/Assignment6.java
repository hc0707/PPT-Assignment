public class Assignment6 {

	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {2,2,1}));

	}

	public static int solution(int[] nums) {
		int ans=0; 
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i]; 
        }
        return ans;    
	}
}
