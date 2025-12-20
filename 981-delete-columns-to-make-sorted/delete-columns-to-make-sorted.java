class Solution {
    public int minDeletionSize(String[] strs) {
        int result=0;
        for(int i=0; i<strs[0].length(); i++)
            result += isUnsorted(strs, i);
        return result;
    }

    private int isUnsorted(String[] strs, int i){
        for(int j=1; j<strs.length; j++){
            if(strs[j].charAt(i) < strs[j-1].charAt(i))
                return 1;
        }
        return 0;
    }
}