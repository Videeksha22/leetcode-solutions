class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> prefArr = new HashSet<Integer>();
        for(int val : arr1){
            while(!prefArr.contains(val) && val > 0){
                prefArr.add(val);
                val /= 10;
            }
        }
        int longPref = 0;
        for(int val : arr2){
            while(!prefArr.contains(val) && val > 0)
                val /= 10;
            if(val > 0)
                longPref = Math.max(longPref, (int) Math.log10(val) + 1);
        }
        return longPref;
    }
}