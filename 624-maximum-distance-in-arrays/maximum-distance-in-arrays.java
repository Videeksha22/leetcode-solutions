class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int smallest=arrays.get(0).get(0);
        int biggest=arrays.get(0).get(arrays.get(0).size()-1);
        int result=0;
        for(int i=1; i<arrays.size(); i++){
            List<Integer> curr = arrays.get(i);
            int localMin=curr.get(0);
            int localMax=curr.get(curr.size()-1);
            result = Math.max(result, Math.max(localMax-smallest, biggest-localMin));
            smallest = Math.min(smallest, localMin);
            biggest = Math.max(biggest, localMax);
        }
        return result;
    }
}