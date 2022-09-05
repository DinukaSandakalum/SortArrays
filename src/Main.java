import com.sortarray.Merge;
import com.sortarray.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] a = {3,1,6};
        int[] b = {-5,-2,5};
        int[] c = {6,-3,5};

        Sort mas = new Sort();
        Merge m = new Merge();

        int[] mergedArray = m.merge(a,b,c);

        System.out.println("Merged Array = "+ Arrays.toString(mergedArray));
        System.out.println("Sorted Array = "+ Arrays.toString(mas.sort(mergedArray)));

    }
}