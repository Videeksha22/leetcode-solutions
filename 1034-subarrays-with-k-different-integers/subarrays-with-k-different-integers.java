class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    public int atMostK(int[] nums, int k){
        Map<Integer, Integer> freq = new HashMap<>();
        int l=0, cnt=0;
        for(int r=0; r<nums.length; r++){
            freq.put(nums[r], freq.getOrDefault(nums[r], 0)+1);
            if(freq.get(nums[r]) == 1)
                k--;
            while(k<0){
                freq.put(nums[l], freq.get(nums[l])-1);
                if(freq.get(nums[l]) == 0)
                    k++;
                l++;
            }
            cnt += (r-l+1);
        }
        return cnt;
    }
}