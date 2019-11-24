package com.company;

import java.io.BufferedReader;
import java.io.IOException;

public class Sense_Expresio {
    void metodo (BufferedReader br) throws IOException {
        String lines = br.readLine();

        while (lines!=null) {
            int paranoels = 0;
            int follets = 0;
            int rens = 0;
            char[] line = lines.toCharArray();
            System.out.println(line);
            boolean esparenoel = false;
            for (int i = 0; i < line.length ; i++) {
                if (i+8 < line.length) {
                    if (line[i] == '*' & line[i+1] == '<' &line[i+2] == ']' &line[i+3] == ':' &line[i+4] == '-' &line[i+5] == 'D' &line[i+6] == 'O' &line[i+7] == 'o'){
                        paranoels++;
                        esparenoel = true;
                    }
                }

                if (i+4 < line.length & !esparenoel) {
                    if (line[i] == '<' &line[i+1] == ']' &line[i+2] == ':' &line[i+3] == '-' &line[i+4] == 'D' ) {
                        follets++;
                    }
                }

                if (i+3 < line.length) {
                    if (line[i] == '>' &line[i+1] == ':' &line[i+2] == 'o' &line[i+3] == ')') {
                        rens++;
                    }
                }
            }

            System.out.println("Pare Noel("+paranoels+")"+" Ren ("+rens+")"+" Follet("+follets+")");
            lines = br.readLine();
        }
    }
}
