class Solution {
    public int countBinarySubstrings(String s) {
        int res=0, prev=0, count=1;
        for (int i=1; i<s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) 
                count++;
            else {
                prev = count;
                count = 1;
            }
            if(count <= prev) 
                res++;
        }
        return res;
    }
}