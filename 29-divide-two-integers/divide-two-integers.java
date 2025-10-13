class Solution {
    public int divide(int dividend, int divisor) {
        double f = dividend/divisor;
        int d=(int)f;
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        else
            return d;
    }
}