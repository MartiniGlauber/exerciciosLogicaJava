/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciologica3;

import java.util.Scanner;

/**
 * Crie um programa que leia 6 números inteiros e no final mostre quantos deles
 * são pares e quantos são ímpares.
 *
 */
public class ExercicioLogica3 {

    public static void main(String[] args) {

        int num, par = 0, impar = 0, i = 1;
        Scanner input = new Scanner(System.in);

        while (i < 7) {
            System.out.println("Digite valor: ");
            num = input.nextInt();
            i++;

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Foram digitados " + par + " pares e " + impar + " impares");

    }

}
