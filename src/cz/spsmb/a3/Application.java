package cz.spsmb.a3;

import java.util.Scanner;

public class Application {
    public static final int THO_5000 = 5000;
    public static final int THO_2000 = 2000;
    public static final int THO_1000 = 1000;
    public static final int THO_500 = 500;
    public static final int THO_200 = 200;
    public static final int THO_100 = 100;
    public static final int THO_50 = 50;
    public static final int THO_20 = 20;
    public static final int THO_10 = 10;
    public static final int THO_5 = 5;
    public static final int THO_2 = 2;
    public static final int THO_1 = 1;

    public static void main(String[] args) {
        int[] money = {THO_5000, THO_2000, THO_1000, THO_500, THO_200, THO_100,
                THO_50, THO_20, THO_10, THO_5, THO_2, THO_1};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int value : money) {
            System.out.println(x / value +"x "+value);
            x %=value;
        }
    }
}
