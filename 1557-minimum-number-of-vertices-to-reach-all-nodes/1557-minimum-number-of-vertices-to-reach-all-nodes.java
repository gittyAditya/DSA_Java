class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] alone_nodes = new boolean[n];
        for (List<Integer> edge : edges)
            alone_nodes[edge.get(1)] = true;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; ++i)
            if(!alone_nodes[i])
                ans.add(i);
        return ans;
    }
}