class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length, m=potions.length;
        int[] ans = new int[spells.length];
        Arrays.sort(potions);
        for(int i=0; i<n; i++){
            long s=spells[i];
            int low=0, high=m-1, index=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if (s * potions[mid] >= success) {
                    index = mid;
                    high = mid - 1;
                } 
                else low = mid + 1;
            }
            if(index !=-1) ans[i] = m-index;
        }
        return ans;
    }
}