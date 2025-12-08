class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val=(long) m*k;
        if(val>bloomDay.length) return -1;
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i : bloomDay){
            min=Math.min(i, min);
            max=Math.max(i, max);
        }
        int low=min, high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay, mid, m, k))
                high=mid-1;
            else 
                low=mid+1;
        }
        return low;
    }

    boolean possible(int[] arr, int day, int m, int k){
        int count=0;
        int bouquets=0;
        for(int i : arr){
            if(i<=day) count++;
            else{
                bouquets += (count/k);
                count=0;
            }
        }
        bouquets += (count/k);
        return bouquets >= m;
    }
}