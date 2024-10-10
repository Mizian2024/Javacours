package org.example;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);

        int a;
        int b ;
        int c;
        int d;
        String op;

        System.out.println("Enter first number");
        a = numbers.nextInt();
        System.out.println("Enter second number");
        b = numbers.nextInt();
        System.out.println("Enter third number");
        c = numbers.nextInt();
        System.out.println("Enter fourth number");
        d = numbers.nextInt();
        Scanner operation = new Scanner(System.in);
        op = operation.next();
        switch (op) {
            case "+":
                System.out.println(a + "+" + b + c + d + "=" + (a + b + c + d));
                break;





        }

    }
}