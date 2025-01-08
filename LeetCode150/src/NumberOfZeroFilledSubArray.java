
public class NumberOfZeroFilledSubArray {
	
	public long zeroFilledSubarray(int[] nums) {

        int n = nums.length;
        long sum =0;
        long count =0;

        for(int i=0; i<n; i++) {
            if(nums[i] == 0) {
                count++;
            } else {
                count = 0;
            }
            sum+=count;
        }

        return sum;
    }

}
