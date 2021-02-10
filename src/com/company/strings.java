package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class strings {
    public static String Upper(final String init) {
        if (init == null)
            return null;

        final StringBuilder ret = new StringBuilder(init.length());

        for (final String word : init.split(" ")) {
            if (!word.isEmpty()) {
                ret.append(Character.toUpperCase(word.charAt(0)));
                ret.append(word.substring(1).toLowerCase());
            }
            if (!(ret.length() == init.length()))
                ret.append(" ");
        }
        return ret.toString();

    }
    public static void Up() {
        Scanner sc = new Scanner(in);
        out.print("Word or Sentence: ");
        String upping = sc.nextLine();
        out.print(strings.Upper(upping));
    }
    // -------
    //--------
    public static String sarcasm(String text) {
        text = text.trim();

        String[] tokens = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String token : tokens) {
            StringBuilder textToken = new StringBuilder();

            for (int i = 0; i < token.length(); i++) {

                if (i % 2 == 0) {
                    textToken.append(token.charAt(i));
                } else {

                    if (token.charAt(i) >= 'a' && token.charAt(i) <= 'z') {
                        textToken.append(Character.toUpperCase(token.charAt(i)));
                    } else if (token.charAt(i) >= 'A' && token.charAt(i) <= 'Z') {
                        textToken.append(Character.toLowerCase(token.charAt(i)));
                    } else {
                        textToken.append(token.charAt(i));
                    }

                }

            }
            result.append(textToken).append(" ");
        }

        return result.toString();
    }
    public static void sarcy() {
        Scanner sc = new Scanner(in);
        out.print("Sentence: ");
        String sarc = sc.nextLine();
        out.print(strings.sarcasm(sarc));
    }



}
