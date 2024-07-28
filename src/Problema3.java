public class Problema3 {
    public static void main(String[] args) {
        int[] miArray = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(aux(miArray, 1000));
    }

    public static boolean aux(int[] array, int n){
        return binarySearch(array, 0, array.length - 1, n);
    }

    public static boolean binarySearch(int[] array, int i, int s, int n){
        if (i > s) { return false; }

        int m = (i + s)/2;

        if (array[m] == n) { return true; }
        else if (array[m] > n) { return binarySearch(array, i, m - 1, n); }
        else { return binarySearch(array, m + 1, s, n); }
    }
}
