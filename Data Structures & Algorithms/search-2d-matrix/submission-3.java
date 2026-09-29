class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(target < matrix[0][0]){
            return false;
        }
        int[] firstColumn = new int[matrix.length];

        for (int i = 0; i < firstColumn.length; i++) {
            firstColumn[i] = matrix[i][0];
        }
        int index = Arrays.binarySearch(firstColumn, target);
        if (index >= 0) return  true;
        index = -1 * (index + 2);
        index = Arrays.binarySearch(matrix[index] , target);
        return index >= 0;
    }
}
