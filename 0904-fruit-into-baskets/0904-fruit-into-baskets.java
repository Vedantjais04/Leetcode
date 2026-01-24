class Solution {
    public int totalFruit(int[] fruits) {
        int type1 = -1, type2 = -1;
        int count2 = 0;
        int curr = 0;
        int max = 0;
        for (int fruit : fruits) {
            if (fruit == type1 || fruit == type2) {
                curr++;
            } else {
                curr = count2 + 1;
            }
            if (fruit == type2) {
                count2++;
            } else {
                count2 = 1;
                type1 = type2;
                type2 = fruit;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}
