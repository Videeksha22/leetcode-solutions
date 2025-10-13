class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        int[] prev = new int[26];
        for(String word : words){
            int[] curr = new int[26];
            for(char ch : word.toCharArray())
                curr[ch-'a']++;
            if(!Arrays.equals(curr, prev)){
                res.add(word);
                prev=curr;
            }
        }
        return res;
    }
}