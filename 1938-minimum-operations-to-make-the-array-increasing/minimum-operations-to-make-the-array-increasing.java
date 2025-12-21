class Solution {
    public int minOperations(int[] nums) {
        int count=0, prev=0;
        for(int i : nums){
            if(i<=prev)
                count += ++prev-i;
            else
                prev = i;
        }
        return count;
    }
}