class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n=nums1.length, m=nums2.length;
        if(m>n)
            return maxDotProduct(nums2, nums1);
        int[] dp = new int[m+1];
        Arrays.fill(dp, -1000000000);
        for(int i=1; i<=n; i++){
            int prev=-1000000000;
            for(int j=1; j<=m; j++){
                int curr = nums1[i-1]*nums2[j-1];
                int temp = dp[j];
                int opt1=curr, opt2=curr+prev, opt3=dp[j], opt4=dp[j-1];
                dp[j] = Math.max(Math.max(opt1, opt2), Math.max(opt3, opt4));
                prev = temp;
            }
        }
        return dp[m];
    }
}