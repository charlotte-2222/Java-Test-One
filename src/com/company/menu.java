package com.company;
import java.util.Scanner;
import static java.lang.System.out;
public class menu {
    public static int Menu() {
            Scanner input = new Scanner(System.in);
            int select;
            Scanner in = new Scanner(System.in);
            out.println("-------------------------");
            out.println("Select some test stuff: ");
            out.println("1 = accum: ");
            out.println("2 = operations: ");
            out.println("3 = addition: ");
            out.println("4 = subtraction: ");
            out.println("5 = multiplication: ");
            out.println("6 = division: ");
            out.println("7 = raise to (X) power: ");
            out.println("8 = print a diamond: ");
            out.print("Enter your choice: ");
            select = in.nextInt();
            return select;
    }
}
