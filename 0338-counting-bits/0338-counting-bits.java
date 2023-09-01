class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        int num = n;
        for(int i=1; i<=n; ++i){
            int test = i;
            int remainder = 0;
            while(test != 0){
                if(test % 2 != 0){
                    remainder++;
                    test/=2;
                }
                else test/=2;
            }
            dp[i] = remainder;
        }
        return dp;
    }
}