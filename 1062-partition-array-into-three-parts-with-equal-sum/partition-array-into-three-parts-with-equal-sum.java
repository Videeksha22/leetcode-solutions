class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int i : arr) sum+=i;
        if(sum%3!=0) return false;
        int target=sum/3;
        int currSum=0, count=0;
        for(int i=0; i<arr.length-1; i++){
            currSum+=arr[i];
            if(currSum==target){
                currSum=0;
                count++;
                if(count==2) return true;
            }
        }
        return false;
    }
}