
public class MaxSubArray {

	/* Given an integer array nums, find the contiguous subarray 
	 (containing at least one number) which has the largest sum
	 
	 */

	public static void main(String args[]) {
		MaxSubArray maxSubArray = new MaxSubArray();
		int arr[] = {-2,-3,-4,-1,-5};
		maxSubArray.maxSubArray(arr, arr.length);
	}
	
	private void maxSubArray(int arr[], int n) {
		
		int curSum = 0;
		int bestSum = Integer.MIN_VALUE;
		int start = 0,end = 0,s = 0;
		
		for (int i = 0 ; i < n ; i ++ ) {
			curSum += arr[i];
			if (bestSum < curSum) {
				bestSum = curSum;
				start = s;
				end = i;
			}
			if(curSum < 0) {
				curSum = 0;
				s = i+1;
			}
		}
		
		System.out.println("Max sum is " + bestSum + " between " + start + " and " + end);
		
		
	}
	
}
