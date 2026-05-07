class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);
        int ans=0, total=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            total += nums[i];
            int req = total - k;
            if(count.containsKey(req)){
                ans += count.get(req);
            }
            count.put(total, count.getOrDefault(total, 0)+1);
        }
        return ans;
    }
}