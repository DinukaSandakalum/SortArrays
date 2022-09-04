import com.sortarray.MergeAndSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = {3,1,6};
        int[] b = {-5,-2,5};
        int[] c = {6,-3,5};

        MergeAndSort mas = new MergeAndSort();

        System.out.println(Arrays.toString(mas.mergeAndSort(a,b,c)));

    }
}