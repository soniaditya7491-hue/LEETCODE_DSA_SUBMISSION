class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int x = 0;
        int y = matrix.length - 1;
        int l = 0;
        int m = matrix[0].length - 1;
        List<Integer> result = new ArrayList<>();
        
        while (l <= m && x <= y) {
            for (int i = l; i <= m; i++) {
                result.add(matrix[x][i]);
            }
            x++;
            
            for (int i = x; i <= y; i++) {
                result.add(matrix[i][m]);
            }
            m--;
            
            if (x <= y) {
                for (int i = m; i >= l; i--) {
                    result.add(matrix[y][i]);
                }
                y--;
            }
            
            if (l <= m) {
                for (int i = y; i >= x; i--) {
                    result.add(matrix[i][l]);
                }
                l++;
            }
        }
        return result;
    }
}
