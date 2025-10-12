class Solution {
    public String removeDigit(String number, char digit) {
        List<String> arr = new ArrayList<>();
        for(int i=0; i<number.length(); i++){
            if(number.charAt(i) == digit){
                String ans = number.substring(0,i)+number.substring(i+1);
                arr.add(ans);
            }
        }
        Collections.sort(arr);
        return arr.get(arr.size()-1);
    }
}