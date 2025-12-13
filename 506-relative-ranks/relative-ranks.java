class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int[][] sortedPairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            sortedPairs[i][0] = score[i];
            sortedPairs[i][1] = i;
        }
        Arrays.sort(sortedPairs, (x, y) -> y[0]-x[0]);
        String[] ans = new String[n];
        for(int i=0; i<n; i++){
            int index = sortedPairs[i][1];
            if (i == 0) ans[index] = "Gold Medal";
            else if (i == 1) ans[index] = "Silver Medal";
            else if (i == 2) ans[index] = "Bronze Medal";
            else ans[index] = String.valueOf(i + 1);
        }
        return ans;
    }
}