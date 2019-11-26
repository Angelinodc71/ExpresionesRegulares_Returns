package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/home/ivan/IdeaProjects/ExpresionesRegulares_Returns/src/com/company/santako.txt");
        BufferedReader br = new BufferedReader(fileReader);

//       Sense_Expresio sense_expresio = new Sense_Expresio();
//       sense_expresio.metodo(br);
        Amb_Expresio amb_expresio = new Amb_Expresio();
        amb_expresio.metodo(br);
    }
}
