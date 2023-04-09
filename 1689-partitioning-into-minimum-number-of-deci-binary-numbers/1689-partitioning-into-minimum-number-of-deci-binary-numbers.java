class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        int size = n.length();
        for(int i=0; i<size; ++i){
            if(n.charAt(i) > ans)
                ans = n.charAt(i);
        }
        return ans - '0';
    }
}