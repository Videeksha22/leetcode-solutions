class Solution {
    public int minCostToMoveChips(int[] position) {
        int odds=0, evens=0;
        for(int i : position){
            if(i%2==0) evens++;
            else odds++;
        }
        return Math.min(evens, odds);
    }
}