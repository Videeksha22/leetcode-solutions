class Solution {
    public int numSpecial(int[][] mat) {
        int specials=0;
        for(int i=0; i<mat.length; i++){
            int idx = checkRow(mat, i);
            if(idx >= 0 && checkCol(mat, i, idx))
                specials++;
        }
        return specials;
    }

    private int checkRow(int[][] mat, int i){
        int idx=-1;
        for(int j=0; j<mat[0].length; j++){
            if(mat[i][j] == 1){
                if(idx >= 0) return -1;
                else idx=j;
            }
        }
        return idx;
    }

    private boolean checkCol(int[][] mat, int i, int idx){
        for(int j=0; j<mat.length; j++){
            if(mat[j][idx] == 1 && j != i) return false;
        }
        return true;
    }
}