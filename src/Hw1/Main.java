package Hw1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Imperative imp = new Imperative();
        int[] array = {4, 1, 4, 5, 1, 5, 62, 7, 8, 3, 6, 6};
        System.out.println(Arrays.toString(array));
        imp.Imp_descending_sort(array);
        System.out.println(Arrays.toString(array));

        Declarative dec = new Declarative();
        int[] array1 = {4, 1, 4, 5, 1, 5, 62, 7, 8, 3, 6, 6};
        System.out.println(Arrays.toString(array1));
        int[] arr1 = dec.Dec_descending_sort(array1);
        System.out.println(Arrays.toString(arr1));


    }
}