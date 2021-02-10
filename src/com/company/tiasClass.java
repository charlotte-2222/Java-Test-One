package com.company;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class tiasClass {
    public static void getTIAS(){
        try {
            File htmlFile = new File("/Applications/Java-Test-One/src/com/company/TIAS.html");
            Desktop.getDesktop().browse(htmlFile.toURI());

        }catch (IOException e){System.out.println("E");}
    }


}
