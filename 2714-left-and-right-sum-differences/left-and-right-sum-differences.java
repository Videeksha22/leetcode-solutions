class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int lSum= 0, rSum = 0;
        for(int i=0; i<n; i++){
            ans[i] = lSum;
            lSum += nums[i];
        }
        for(int i=n-1; i>=0; i--){
            ans[i] = Math.abs(ans[i] - rSum);
            rSum += nums[i];
        }
        return ans;
    }
}