class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1, high=1000000;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(sumByD(nums, mid)<=threshold) high=mid-1;
            else low=mid+1;
        }
        return low;
    }

    long sumByD(int nums[], int div){
        int sum=0;
        for(int i : nums){
            sum += (i+div-1)/div;
        }
        return sum;
    }
}