package Hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GameField {

    static int[] field = {0, 0, 0,
            0, 0, 0,
            0, 0, 0};

    //012, 345, 678, 036, 147, 258, 048, 246


    static int getNumber() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                int n = Integer.parseInt(reader.readLine());
                if (n >= 0 && n < field.length && field[n] == 0) {
                    return n;
                }
                System.out.println("Choose free cell and enter its number");
            } catch (NumberFormatException e) {
                System.out.println("Please enter the number");
            } catch (IOException e) {
            }
        }
    }

    static boolean winner(int n) {
        // 0 1 2
        // 3 4 5
        // 6 7 8
        //поиск совпадений по горизонтали
        int row = n - n % 3; //номер строки - проверяем только её
        if (field[row] == field[row + 1] &&
                field[row] == field[row + 2]) return true;
        //поиск совпадений по вертикали
        int column = n % 3; //номер столбца - проверяем только его
        if (field[column] == field[column + 3])
            if (field[column] == field[column + 6]) return true;
        //мы здесь, значит, первый поиск не положительного результата
        //если значение n находится на одной из граней - возвращаем false
        if (n % 2 != 0) return false;
        //проверяем принадлежит ли к левой диагонали значение
        if (n % 4 == 0) {
            //проверяем есть ли совпадения на левой диагонали
            if (field[0] == field[4] &&
                    field[0] == field[8]) return true;
            if (n != 4) return false;
        }
        return field[2] == field[4] &&
                field[2] == field[6];
    }

    static void drawField() {
        System.out.println("     |     |     ");
        for (int i = 0; i < field.length; i++) {
            if (i != 0) {
                if (i % 3 == 0) {
                    System.out.println();
                    System.out.println("_____|_____|_____");
                    System.out.println("     |     |     ");
                } else
                    System.out.print("|");
            }

            if (field[i] == 0) System.out.print("  " + i + "  ");
            if (field[i] == 1) System.out.print("  X  ");
            if (field[i] == 2) System.out.print("  О  ");
        }
        System.out.println();
        System.out.println("     |     |     ");
    }

    public static boolean isDraw() {
        for (int n : field) if (n == 0) return false;
        return true;
    }
}


