class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    if (set.contains(num)) return false;
                    set.add(num);
                }
            }
        }
        for (int j = 0; j < 9; j++) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char num = board[i][j];
                if (num != '.') {
                    if (set.contains(num)) return false;
                    set.add(num);
                }
            }
        }
        for (int box = 0; box < 9; box++) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                int row = (box / 3) * 3 + i / 3;
                int col = (box % 3) * 3 + i % 3;

                char num = board[row][col];
                if (num != '.') {
                    if (set.contains(num)) return false;
                    set.add(num);
                }
            }
        }
        return true;
    }
}