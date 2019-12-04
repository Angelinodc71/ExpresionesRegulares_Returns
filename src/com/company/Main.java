package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige A para expresion regular");
        System.out.println("Elige B sin expresion regular");
        String opcion = sc.nextLine();
        if (opcion.equals("A")) {
            Sense_Expresio sense_expresio = new Sense_Expresio();
            sense_expresio.metodo();
        }
        if (opcion.equals("B")) {
            Amb_Expresio amb_expresio = new Amb_Expresio();
            amb_expresio.metodo();
        }
    }
}
