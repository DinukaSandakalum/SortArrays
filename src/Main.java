import com.sortarray.Merge;
import com.sortarray.MergeAndSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = {3,1,6};
        int[] b = {-5,-2,5};
        int[] c = {6,-3,5};

        MergeAndSort mas = new MergeAndSort();
        Merge m = new Merge();

        int[] mergedArray = m.mergeAndSort(a,b,c);

        System.out.println("Merged Array = "+ Arrays.toString(mergedArray));
        System.out.println("Sorted Array = "+ Arrays.toString(mas.Sort(mergedArray)));

    }
}