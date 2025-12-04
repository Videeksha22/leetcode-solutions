class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums)
            set.add(n);
        int ans=0;
        for(int n : nums){
            if(set.contains(n+diff) && set.contains(n+2*diff))
                ans++;
        }
        return ans;
    }
}