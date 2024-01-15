package Hw1;

import java.util.Arrays;
import java.util.Collections;

public class Declarative {
    /**
     * Написать точно такую же процедуру, но в декларативном стиле
     **/

    public int[] Dec_descending_sort(int[] array) {
        int[] ints = Arrays.stream(array)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(a -> a)
                .toArray();

        return ints;
    }

}
