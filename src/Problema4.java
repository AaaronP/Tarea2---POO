import java.util.Arrays;

public class Problema4 {
    public static void main(String[] args) {
        int[] miArray = {1, 0, 2, 3, 4, 5, 11, 7, 8, 6, 10};

        // original
        System.out.println(Arrays.toString(miArray));

        quickSort(miArray, 0, miArray.length - 1);

        // ordernado
        System.out.println(Arrays.toString(miArray));
    }

    public static void quickSort(int[] array, int l, int h) {
        if (l < h){
            int pivot = particion(array, l, h);

            quickSort(array, l, pivot - 1);
            quickSort(array, pivot + 1, h);
        }
    }

    public static int particion(int[] array, int l, int h){
        int pivot = array[h];
        int i = l - 1;

        for (int j = l; j < h; j++){
            if (array[j] < pivot){
                i++;
                int temporal = array[i];
                array[i] = array[j];
                array[j] = temporal;
            }
        }

        int temporal = array[i + 1];
        array[i + 1] = array[h];
        array[h] = temporal;

        return i + 1;
    }
}
