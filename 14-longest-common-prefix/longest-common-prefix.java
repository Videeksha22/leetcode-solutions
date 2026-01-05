class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String pre = strs[0];
        int preLen = pre.length();
        for(int i=1; i<strs.length; i++){
            String s = strs[i];
            while(preLen > s.length() || !pre.equals(s.substring(0, preLen))){
                preLen--;
                if(preLen == 0)
                    return "";
                pre = pre.substring(0, preLen);
            }
        }
        return pre;
    }
}