package com.company;
import java.util.Scanner;
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

    public static void factorial(){
        int q, a, factor = 1;
        Scanner input = new Scanner(in);
        out.print("Enter a number: ");
        q = input.nextInt();
        if(q<0)
            out.println("Enter a number greater than 0");
        else{
            for (a=1; a <=q; a++){
                factor=factor*a;

            }
            out.println("Factorial of " +q+ " is "+factor);
        }

    }



}
