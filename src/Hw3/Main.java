package Hw3;

import static Hw3.GameField.*;

public class Main {
    public static void main(String[] args) {

        boolean b;
        boolean isCurrentX = false;
        do {
            isCurrentX = !isCurrentX;
            drawField();
            System.out.println("mark " + (isCurrentX ? "X" : "O"));
            int n = getNumber();
            field[n] = isCurrentX ? 1 : 2;
            b = !winner(n);
            if (isDraw()) {
                System.out.println("Draw");
                return;
            }
        } while (b);
        drawField();
        System.out.println();

        System.out.println("The winner is " + (isCurrentX ? "X" : "O") + "!");
    }
}
