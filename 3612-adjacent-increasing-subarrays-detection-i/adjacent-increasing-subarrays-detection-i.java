class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int len = 1, prevLen = 0, maxLen = 0;
        for (int i=1; i<nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) len++;
            else {
                prevLen = len;
                len = 1;
            }
            maxLen = Math.max(maxLen, Math.max(len >> 1, Math.min(prevLen, len)));
            if (maxLen >= k) return true;
        }
        return false;
    }
}