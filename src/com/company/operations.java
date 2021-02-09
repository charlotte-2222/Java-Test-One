package com.company;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static java.lang.System.*;
public class operations {

    public static void wage(double hr, double rate, double total){
        Scanner input = new Scanner(in);
        out.print("Hours: ");
        hr = input.nextDouble();
        out.print("Rate: ");
        rate = input.nextDouble();

        if(hr <= 40){
            total=hr*rate;
        }else{total=(40*rate)+
                ((hr-40)*(rate*1.5));}
        out.println("Total: "+total);

    }

    public static void add(double numA, double numB){
        Scanner input = new Scanner(in);
        out.print("------------------\n");
        out.print("\nEnter your first number: ");
        numA = input.nextInt();
        out.print("\nEnter your second number: ");
        numB = input.nextInt();

        double answer = numA + numB;
        out.println("\nTotal: " + answer);
    }
    public static void sub(double numA, double numB){
        Scanner input = new Scanner(in);
        out.print("------------------\n");
        out.print("\nEnter your first number: ");
        numA = input.nextInt();
        out.print("\nEnter your second number: ");
        numB = input.nextInt();

        double answer = numA - numB;
        out.println("\nTotal: " + answer);
    }
    public static void multi(double numA, double numB){
        Scanner input = new Scanner(in);
        out.print("------------------\n");
        out.print("\nEnter your first number: ");
        numA = input.nextInt();
        out.print("\nEnter your second number: ");
        numB = input.nextInt();

        double answer = numA * numB;
        out.println("\nTotal: " + answer);
    }
    public static void div(double numA, double numB){
        Scanner input = new Scanner(in);
        out.print("------------------\n");
        out.print("\nEnter your first number: ");
        numA = input.nextInt();
        out.print("\nEnter your second number: ");
        numB = input.nextInt();

        double answer = numA / numB;
        out.println("\nTotal: " + answer);
    }

    public static void power(double numA, double numB){
        Scanner input = new Scanner(in);
        out.print("------------------\n");
        out.print("\nEnter your first number: ");
        numA = input.nextInt();
        out.print("\nEnter your second number: ");
        numB = input.nextInt();

        double answer = Math.pow(numA, numB);
        out.println("\nTotal: "+answer);
    }





}
