package Hw2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable multi = new MultiplicationTable();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        multi.multiTable(n);
    }
/** Выбрал процедурную парадигму, потому что код в виде функции потом проще вызвыать и спиользовать*/
    public void multiTable (int n){
        System.out.println("");
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
            System.out.printf("%d * %d = %d%n",i,j,i*j);
            }
            System.out.println("---------------");
        }
    }

}
