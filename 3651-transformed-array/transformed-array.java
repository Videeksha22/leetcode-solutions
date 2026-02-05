class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int OFFSET = 1 << 7;
        int MASK = (1 << 8)-1;
        for(int i=0; i<n; i++)
            nums[i] += OFFSET;
        for(int i=0; i<n; i++) {
            int cur = nums[i] - OFFSET;
            int idx = ((i + cur) % n + n) % n;
            int val = nums[idx] & MASK;
            nums[i] |= val << 8;
        }
        for(int i=0; i<n; i++)
            nums[i] = (nums[i] >> 8)-OFFSET;
        return nums;
    }
}