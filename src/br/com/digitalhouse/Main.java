package br.com.digitalhouse;

import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Integer umNumeroA;
        double umNumeroB;
        String umaCadeiaDeTexto;

        umNumeroA = 10;
        umNumeroB = 20.0d;
        umaCadeiaDeTexto = "Cadeia de texto do Tairo";

        System.out.println (umNumeroA);
        System.out.println (umNumeroB);
        System.out.println (umaCadeiaDeTexto);
        System.out.println ("soma de A + B = " + (umNumeroA + umNumeroB));
        System.out.println ("subtração de A - B = " + (umNumeroA - umNumeroB));

        Scanner scanner = new Scanner(System.in);

        umNumeroA = scanner.nextInt();

        System.out.println ("recebi " + umNumeroA);

    }
}
