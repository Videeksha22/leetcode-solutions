class Solution {
    public long getDescentPeriods(int[] prices) {
        long sum=1, des=1;
        for(int i=1; i<prices.length; i++){
            if(prices[i] == prices[i-1]-1) des++;
            else des=1;
            sum+=des;
        }
        return sum;
    }
}