import java.util.Arrays;

public class Problema5 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.deepToString(expBin(matriz, 2)));
    }

    public static int[][] eye(int n, int m){
        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (j == i){ matriz[i][j] = 1; }
            }
        }

        return matriz;
    }
    public static int[][] transpuesta(int[][] matriz){
        int n = matriz.length;
        int m = matriz[0].length;
        int[][] transpuesta = new int[m][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }
    public static int prodPunto(int[] A, int[] B){
        int sum = 0;
        for (int i = 0; i < A.length; i++){
            sum += A[i] * B[i];
        }
        return sum;
    }
    public static int[][] prod(int[][] A, int[][] B){
        int[][] t_b = transpuesta(B);
        int[][] res = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < B[0].length; j++){
                res[i][j] = prodPunto(A[i], t_b[j]);
            }
        }
        return res;
    }
    public static int[][] expBin(int[][] matriz, int e){
        if (e == 0){ return eye(matriz.length, matriz[0].length); }

        int[][] res = expBin(matriz, e / 2);
        res = prod(res, res);

        if (e % 2 != 0){ return prod(res, matriz); }
        return res;
    }
}
