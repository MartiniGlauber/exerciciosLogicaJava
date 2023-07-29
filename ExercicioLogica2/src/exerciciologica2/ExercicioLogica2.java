/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciologica2;

import java.util.Scanner;

/**
 * Crie um programa que calcule e mostre na tela o resultado da soma entre 6 + 8
 * + 10 + 12 + 14 + ... + 98 + 100.
 */
public class ExercicioLogica2 {

    public static void main(String[] args) {

        int i = 6, soma = 0;

        while (i <= 100) {
            soma += i; // o "+=" é o mesmo que "soma = soma + i". 
            System.out.print((i += 2) + " ");
        }
        System.out.println("\n" +soma);
       

    }

}
