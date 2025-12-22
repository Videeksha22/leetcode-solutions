class Solution {
    public int splitNum(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        Arrays.sort(arr);
        int a=0, b=0;
        for(int i=0; i<arr.length; ++i){
            int digit = arr[i]-'0';
            if(i%2 == 0){
                a *= 10;
                a += digit;
            }
            else{
                b *= 10;
                b += digit;
            }
        }
        return a+b;
    }
}