class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i : piles){
            max=Math.max(max, i);
        }
        int low=1, high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalHr=calculateTotalHr(piles, mid);
            if(totalHr<=h) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    long calculateTotalHr(int piles[], int hr){
        long totalHr=0;
        for(int i=0; i<piles.length; i++)
            totalHr += (piles[i]+hr-1)/hr;
        return totalHr;
    }
}