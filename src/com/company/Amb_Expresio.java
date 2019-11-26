package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Amb_Expresio {
    void metodo (BufferedReader br) throws IOException {
        String lines = br.readLine();

        while (null != lines) {
            Pattern parenoel = Pattern.compile("^*<]:-DOo");
            Matcher encajaParenoel = parenoel.matcher(lines);

            Pattern follet = Pattern.compile("^<]:-D[^Oo]");
            Matcher encajaFollet = follet.matcher(lines);

            Pattern rens = Pattern.compile("^>:o)");
            Matcher encajaRens = rens.matcher(lines);

            System.out.print(encajaParenoel);

            System.out.print(encajaFollet);

            System.out.print(encajaRens);

            lines = br.readLine();
            System.out.println();
        }
    }
}
