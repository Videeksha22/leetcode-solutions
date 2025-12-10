class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length, m=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i = 0, j = 0;
        while(i < n && j < m){
            if(nums1[i] < nums2[j]) {
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] output = new int[arr.size()];
        int k = 0;
        while(k < arr.size()){
            output[k] = arr.get(k);
            k++;
        }
        return output;
    }
}