class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=1, j=1;
        int n=name.length(), m=typed.length();
        if(name.charAt(0) != typed.charAt(0)) return false;
        while(i<n && j<m){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else{
                if(typed.charAt(j) == typed.charAt(j-1)) j++;
                else return false;
            }
        }
        if(i==n && j==m) return true;
        else if(i!=n && j==m) return false;
        else{
            while(j!=m){
                if(typed.charAt(j) == typed.charAt(j-1)) j++;
                else return false;
            }
        }
        return true;
    }
}