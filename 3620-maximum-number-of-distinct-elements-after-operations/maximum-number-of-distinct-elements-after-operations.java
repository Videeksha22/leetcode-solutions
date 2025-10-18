class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        int ans=0;
        Arrays.sort(nums);
        int last=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; ++i){
            int min=nums[i]-k;
            int max=nums[i]+k;
            if(last<max){
                last=Math.max(last+1, min);
                ans++;
            }
        }
        return ans;
    }
}