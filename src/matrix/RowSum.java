package matrix;

public class RowSum {
    static int[] getRowwise(int[][] mat){
        int[] rowSum = new int[mat.length];

        for (int i = 0; i < mat.length; i++){
            int sum = 0;
            for(int j =0; j <mat[i].length; j++){
                sum = mat [i][j]+sum;
            }
            rowSum[i] = sum;
        }
        return rowSum;
    }
    public static void main(String[] args) {
        int[][] mat = Matrix.read();
        Matrix.display(mat);
        int[] sum = getRowwise(mat);

        for(int i : sum){
            System.out.println(i);
        }
    }
}
