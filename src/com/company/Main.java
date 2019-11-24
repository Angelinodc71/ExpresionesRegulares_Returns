package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("E:\\Intellij Projects\\Expresiones Regulares\\src\\com\\company\\santako.txt");
        BufferedReader br = new BufferedReader(fileReader);

       Sense_Expresio se = new Sense_Expresio();
       se.metodo(br);
    }
}
