class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDist = Integer.MAX_VALUE;
        int resultIndex = -1;

        for (int i = 0; i < points.length; i++) {
            int px = points[i][0];
            int py = points[i][1];
            if (px == x || py == y) {
                int dist = Math.abs(px - x) + Math.abs(py - y);

                if (dist < minDist) {
                    minDist = dist;
                    resultIndex = i;
                }
            }
        }

        return resultIndex;
    }
}