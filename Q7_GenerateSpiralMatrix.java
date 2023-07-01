public class Q7_GenerateSpiralMatrix {
    public static int[][] generateMatrix(int n) {
        int [][] a = new int[n][n];
        int l=0,t=0,b=n-1,r=n-1,v=1;
        while(t<=b || l<=r){
            // top
            if(t<=b){
                for(int i=l;i<=r;i++)
                    a[t][i]=v++;
                t++;
            }
            // right
            if(l<=r){
                for(int i=t;i<=b;i++)
                    a[i][r]=v++;
                r--;
            }
            // bottom
            if(t<=b){
                for(int i=r;i>=l;i--)
                    a[b][i]=v++;
                b--;
            }
            // left
            if(t<=b){
                for(int i=b;i>=t;i--)
                    a[i][l]=v++;
            }
            l++;
        }
        return a;
    }

    public static void main(String[] args) {
        int n=3;
        int[][] matrix = generateMatrix(n);
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
