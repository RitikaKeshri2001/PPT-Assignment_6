public class Q2_SearchSorted2dArray {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        // base case condition
        if(m == 0){
            return false;
        }
        //binary search algo
        int low = 0, high = m*n-1;
        int midIdx, midElement, rowIdx, colIdx;

        while(low <= high){
            midIdx = low + (high - low)/2;
            rowIdx = midIdx/n;
            colIdx = midIdx % n;
            midElement = matrix[rowIdx][colIdx];

            //condition
            if(target == midElement){
                return true;
            } else {
                if(target < midElement){
                    //left side
                    high = midIdx - 1;
                } else {
                    //right side
                    low = midIdx + 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
}
