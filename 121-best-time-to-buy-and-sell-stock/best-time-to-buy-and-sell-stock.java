class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mn = prices[0];
        int maxProf = 0;
        for(int i=1; i<n; i++){
            int currProf = prices[i] - mn;
            maxProf = Math.max(currProf, maxProf);
            mn = Math.min(mn, prices[i]);
        }
        return maxProf;
    }
}