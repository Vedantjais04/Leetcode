
class Solution {
    int[][] rects;
    int[] prefix;
    int totalPoints;
    Random rand;

    public Solution(int[][] rects) {
        this.rects = rects;
        this.rand = new Random();

        prefix = new int[rects.length];
        int sum = 0;

        for (int i = 0; i < rects.length; i++) {
            int x1 = rects[i][0];
            int y1 = rects[i][1];
            int x2 = rects[i][2];
            int y2 = rects[i][3];

            int points = (x2 - x1 + 1) * (y2 - y1 + 1);
            sum += points;
            prefix[i] = sum;
        }

        totalPoints = sum;
    }

    public int[] pick() {
        int k = rand.nextInt(totalPoints) + 1;

        int left = 0, right = prefix.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (prefix[mid] < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int[] rect = rects[left];
        int x1 = rect[0], y1 = rect[1], x2 = rect[2], y2 = rect[3];

        int width = x2 - x1 + 1;

        int base = (left == 0) ? 0 : prefix[left - 1];
        int offset = k - base - 1;

        int dx = offset % width;
        int dy = offset / width;

        return new int[]{x1 + dx, y1 + dy};
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(rects);
 * int[] param_1 = obj.pick();
 */