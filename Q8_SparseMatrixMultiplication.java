public class Q8_SparseMatrixMultiplication {
    public static int[][] multiply(int[][] mat1, int[][] mat2) {
        if(mat1 == null || mat2 == null) return null;
        int[][] mul = new int[mat1.length][mat2[0].length];
        for(int r=0; r<mul.length; r++) {
            for(int c=0; c<mul[0].length; c++) {
                for(int k=0; k<mat1[0].length; k++) {
                    mul[r][c] += mat1[r][k] * mat2[k][c];
                }
            }
        }
        return mul;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1,0,0}, {-1,0,3}};
        int[][] mat2 = {{7,0,0}, {0,0,0}, {0,0,1}};

        int[][] mul = multiply(mat1, mat2);
        for(int i=0; i<mul.length; i++) {
            for(int j=0; j<mul[0].length; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
