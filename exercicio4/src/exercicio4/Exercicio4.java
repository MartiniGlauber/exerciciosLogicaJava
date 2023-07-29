/*
  Desenvolva um programa que faça o sorteio de 20 números entre 0
e 10 e mostre na tela:
a) Quais foram os números sorteados
b) Quantos números estão acima de 5
c) Quantos números são divisíveis por 3
 */
package exercicio4;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio4 {

    public static void main(String[] args) {

        ArrayList<Integer> valores = new ArrayList<>();
        int num, maioresQue5 = 0, divisiveisPor3 = 0;
        Random ram = new Random();

        for (int i = 0; i < 20; i++) {
            num = ram.nextInt(11);
            valores.add(num);
            if (num > 5) {
                maioresQue5++;
            }
            if (num % 3 == 0) {
                divisiveisPor3++;
            }
        }
        System.out.println("os numeros sorteados foram" + valores);
        System.out.println("Foram sorteados "+maioresQue5+ " numeros maiores que 5.");
        System.out.println("Foram sorteados "+divisiveisPor3+" divisiveis por 3");
    }
}


