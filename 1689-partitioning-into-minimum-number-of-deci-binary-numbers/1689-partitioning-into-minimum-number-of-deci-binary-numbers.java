class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        int size = n.length();
        for(int i=0; i<size; ++i){
            if(n.charAt(i) - '0' > ans)
                ans = n.charAt(i) - '0';
        }
        return ans;
    }
}