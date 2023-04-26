class Solution {
    
    private void dfs(int row, int col, int[][] image, int[][] ans, int color, int iniColor, int deltaRow[], int deltaCol[], int m, int n){
        ans[row][col] = color;
        for(int i=0; i<4; ++i){
            int nRow = row + deltaRow[i];
            int nCol = col + deltaCol[i];
            if(nRow>=0 && nRow<m && nCol>=0 && nCol<n && image[nRow][nCol] == iniColor && ans[nRow][nCol] != color)
                dfs(nRow, nCol, image, ans, color, iniColor, deltaRow, deltaCol, m, n);
        }
        
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans = image;
        int iniColor = image[sr][sc];
        int m = image.length;
        int n = image[0].length;
        int[] deltaRow = {1, 0, -1, 0};
        int[] deltaCol = {0, -1, 0, 1};
        dfs(sr, sc, image, ans, color, iniColor, deltaRow, deltaCol, m, n);
        return ans;
    }
}