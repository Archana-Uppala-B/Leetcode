class Solution {
    // O(N) approach
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        int[] count = new int[n], sumDist = new int[n];
        dfs(0, -1, adjList, count, sumDist, 0);
        dfs2(0, -1, adjList, count, sumDist, n);
        return sumDist;
    }

    private void dfs(int node, int parent, List<List<Integer>> adjList, int[] count, int[] sumDist, int sum) {
        sumDist[0] += sum++;
        for (int neighbor : adjList.get(node)) {
            if (neighbor == parent) continue;
            dfs(neighbor, node, adjList, count, sumDist, sum);
            count[node] += count[neighbor];
        }
        count[node]++;
    }

    private void dfs2(int node, int parent, List<List<Integer>> adjList, int[] count, int[] sumDist, int totalNodes) {
        for (int neighbor : adjList.get(node)) {
            if (neighbor == parent) continue;
            // neighbors will be visited exactly once as there is no cycle
            sumDist[neighbor] = sumDist[node] - 2 * count[neighbor] + totalNodes;
            dfs2(neighbor, node, adjList, count, sumDist, totalNodes);
        }
    }
}