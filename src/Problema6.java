import java.util.ArrayList;
import java.util.Arrays;

public class Problema6 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(nqueens(5).toArray()));
    }

    public static ArrayList<ArrayList<Integer>> nqueens(int n){
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();
        ArrayList<Integer> rows = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            rows.add(0);
        }

        np(rows, 0, n, sol);
        return sol;
    }

    public static boolean isValid(ArrayList<Integer> rows, int row, int col){
        for (int i = 0; i < col; i++){
            if (rows.get(i) == row || rows.get(i) - i == row - col || rows.get(i) + i == row + col ){
                return false;
            }
        }
        return true;
    }
    public static void np(ArrayList<Integer> rows, int i, int n, ArrayList<ArrayList<Integer>> sol) {
        if (i == n) {
            sol.add(new ArrayList<>(rows));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isValid(rows, row, i)){
                rows.set(i, row);
                np(rows, i + 1, n, sol);
                rows.set(i, 0);
            }
        }
    }
}
