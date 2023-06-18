package assignement;

public class SquareRoot {
	public static void main(String[] args) {
		System.out.println(getSquareRoot(8));
	}
	
	public static int getSquareRoot(int x) {
		int s=0;
		int e=x;
		int mid=0;
		int ans=0;
		while (s<=e) {
			mid=(s+e)/2;
			if (mid*mid == x) 
				return mid;
			if(mid*mid<x) {
				s=mid+1;
				ans=mid;
			}
			else
				e=mid-1;
		}
		return ans;
	}
}
