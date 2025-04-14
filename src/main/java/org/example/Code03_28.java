package org.example;

import java.util.Scanner;
public class Code03_28{
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
                int a = s.nextInt();
                int b = s.nextInt();
                double result = (double) a/b;

                System.out.print(a + "/" + b + "=" + result);

                s.close();


    }
}
