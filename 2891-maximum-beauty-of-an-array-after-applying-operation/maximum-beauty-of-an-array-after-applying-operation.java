class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int n = nums.length;
        for(int i=0; i<nums.length; ++i)
            nums[i]+=k;
        int mxe = 0;
        for(int i=0; i<n; i++)
            mxe = Math.max(mxe, nums[i]+k);
        int[] cnt = new int[mxe + 2];
        for(int i=0; i<n; i++) {
            cnt[nums[i]-k]++;
            cnt[nums[i]+k+1]--;
        }
        int tot=0, ans=0;
        for(int i=0; i<=mxe; i++) {
            tot += cnt[i];
            ans = Math.max(ans, tot);
        }
        return ans;
    }
}