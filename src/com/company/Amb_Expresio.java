package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Amb_Expresio {
    void metodo () throws IOException {
        FileReader fileReader = new FileReader("data/santako.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String lines = br.readLine();
        while (null != lines) {
            System.out.println();
            int inoel = 0;
            int irens = 0;
            int ifollet = 0;
            Pattern parenoel = Pattern.compile("\\*<]:-DOo");
            Matcher encajaParenoel = parenoel.matcher(lines);
            while (encajaParenoel.find()){
                inoel++;
            }
            lines = encajaParenoel.replaceAll("");


            Pattern follet = Pattern.compile("<]:-D");
            Matcher encajaFollet = follet.matcher(lines);
            while (encajaFollet.find()){
                ifollet++;
            }

            Pattern rens = Pattern.compile(">:o\\)");
            Matcher encajaRens = rens.matcher(lines);
            while (encajaRens.find()){
                irens++;
            }

            if (inoel>0) {
                System.out.print(" Pare Noel ("+inoel+")");
            }
            if (irens>0) {
                System.out.print(" Ren ("+irens+")");
            }
            if (ifollet>0) {
                System.out.print(" Follet ("+ifollet+")");
            }
            System.out.println();
            lines = br.readLine();
        }
        br.close();
    }
}
