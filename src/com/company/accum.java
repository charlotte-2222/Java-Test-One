package com.company;

import java.util.Scanner;
import javax.swing.*;
import static java.lang.System.in;
import static java.lang.System.out;

public class accum {
    public static String mumble(String s){

        int length = s.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            String ch = s.substring(i, i + 1);
            sb.append(ch.toUpperCase());

            for (int j = 0; j < i; j++) {
                sb.append(ch.toLowerCase());
            }

            if (i < length - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }
    public static void bullshit(String word){
        Scanner sc = new Scanner(in);
        out.print("Word: ");
        String words = sc.nextLine();
        out.print(accum.mumble(words));

    }

}


