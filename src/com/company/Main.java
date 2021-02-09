package com.company;
import javax.swing.*;
import java.util.Scanner;

import static com.company.accum.mumble;
import static java.lang.System.in;
import static java.lang.System.out;
public class Main {


    public static void main(String[] args) {
        String words = "";
        double hr = 0,
                rate=0,
                total = 0,
                numA=0,
                numB = 0,
                answer = 0;

        int choice = menu.Menu();
        switch(choice){
            case 1 : accum.bullshit(words);
            break;
            case 2: operations.wage(hr,
                        rate,
                        total);
                break;

            case 3:
                operations.add(numA,
                    numB);
                break;

            case 4: operations.sub(numA,
                    numB);
            break;

            case 5: operations.multi(numA,
                    numB);
            break;

            case 6: operations.div(numA,
                    numB);

            break;

            case 7: operations.power(numA,
                    numB);
            break;

            case 8:
                diamond.DiamondStuff();
                break;



        }

    }
}
