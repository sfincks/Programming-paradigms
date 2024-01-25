package Hw4;

import java.util.Arrays;
import java.util.stream.Stream;

public class Correlation {

    public static void main(String[] args) {
        int[] data1 = {1, 2, 3, 4, 5};
        int[] data2 = {2, 3, 6, 8, 10};
        Correlation correlation = new Correlation();
        double cor = correlation.correlation(data1, data2);
        System.out.println(cor);
    }
    /**
     * r = E(x*y) - E(x)*E(y) /  //1 - 2*3
     * sqrt(E(x^2)-(E(x)^2) * sqrt(E(y^2)-(E(y)^2)
     * формула из википедии https://en.wikipedia.org/wiki/Correlation
     *
     * использовал этот вид функции, потому что её было проще разбить на части
     */


    public double correlation(int[] X, int[] Y) {
        int n = X.length;
        double sumX = 0.0;  //2
        double sumY = 0.0;  //3
        double sumXX = 0.0;
        double sumYY = 0.0;
        double sumXY = 0.0; //1

//        for (int i = 0; i < n; i++) {
//            double x = X[i];
//            double y = Y[i];
//
//            sumX += x;
//            sumY += y;
//            sumXX += x * x;
//            sumYY += y * y;
//            sumXY += x * y;
//        }
        sumX = Arrays.stream(X).sum();
//        System.out.println(sumX);
        sumY = Arrays.stream(Y).sum();
//        System.out.println(sumY);
        sumXX = Arrays.stream(X).map(x -> x*x).reduce(0,Integer::sum);
//        System.out.println("sumXX 55 " + sumXX);
        sumYY = Arrays.stream(Y).map(x -> x*x).reduce(0,Integer::sum);
//        System.out.println("sumYY 213 " + sumYY);
        for (int i = 0; i < n; i++) {
            double x = X[i];
            double y = Y[i];
            sumXY += x * y;
        }
//        System.out.println("sumXY 108 " + sumXY);

        double covariation = sumXY / n - sumX * sumY / n / n;
        double standartDeviationX = Math.sqrt(sumXX / n - sumX * sumX / n / n);
        double standartDeviationY = Math.sqrt(sumYY / n - sumY * sumY / n / n);
        return covariation / standartDeviationX / standartDeviationY;

    }

}
