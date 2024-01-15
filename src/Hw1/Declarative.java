package Hw1;

import java.util.Arrays;
import java.util.Collections;

public class Declarative {
    /**
     * �������� ����� ����� �� ���������, �� � ������������� �����
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
