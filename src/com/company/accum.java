package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class accum {

    public static String mumble(String s){
        Scanner sc = new Scanner(in);
        out.print("Word: ");
        String word = sc.nextLine();
        out.print(accum.mumble(word));
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

}
