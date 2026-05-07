class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans=0, total=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            total += nums[i];
            total %= k;
            if(total < 0) total += k;
            if(map.containsKey(total))
                ans += map.get(total);
            map.put(total, map.getOrDefault(total, 0)+1);
        }
        return ans;
    }
}