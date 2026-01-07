class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(nums == null || n<2) return 0;
        int max=nums[0];
        int min=nums[0];
        for(int i : nums){
            min=Math.min(min, i);
            max=Math.max(max, i);
        }
        int diff = (int)Math.ceil((double)(max-min)/(n-1));
        int[] bucketsMIN = new int[n-1];
        int[] bucketsMAX = new int[n-1];
        Arrays.fill(bucketsMIN, Integer.MAX_VALUE);
        Arrays.fill(bucketsMAX, Integer.MIN_VALUE);
        for(int i : nums){
            if(i == min || i == max) continue;
            int index=(i-min)/diff;
            bucketsMIN[index] = Math.min(i, bucketsMIN[index]);
            bucketsMAX[index] = Math.max(i, bucketsMAX[index]);
        }
        int maxDiff=Integer.MIN_VALUE;
        int prev=min;
        for(int i=0; i<n-1; i++){
            if(bucketsMIN[i] == Integer.MAX_VALUE && bucketsMAX[i] == Integer.MIN_VALUE)
                continue;
            maxDiff = Math.max(maxDiff, bucketsMIN[i]-prev);
            prev = bucketsMAX[i];
        }
        maxDiff = Math.max(maxDiff, max-prev);
        return maxDiff;
    }
}