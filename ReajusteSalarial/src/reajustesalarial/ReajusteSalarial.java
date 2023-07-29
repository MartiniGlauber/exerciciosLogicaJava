/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reajustesalarial;

import java.util.Scanner;

/**
 * 1. Uma empresa precisa reajustar o salário dos seus funcionários, dando um
 * aumento de acordo com alguns fatores. Faça um programa que leia o salário
 * atual, o gênero do funcionário e há quantos anos esse funcionário trabalha na
 * empresa. No final, mostre o seu novo salário, baseado na tabela a seguir: -
 * 
 * Mulheres 
 * - menos de 15 anos de empresa: +5% 
 * - de 15 até 20 anos de empresa: +12%
 * - mais de 20 anos de empresa: +23% 
 * Homens 
 * - menos de 20 anos de empresa: +3% 
 * - de 20 até 30 anos de empresa: +13% 
 * - mais de 30 anos de empresa: +25%
 * 
 */
public class ReajusteSalarial {

    public static void main(String[] args) {
        
        float salAtual, novoSal = 0;
        int tempoEmp, genero;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o gênero do empregado: 1 - Mulher ou 2 - Homem"); 
        genero = input.nextInt();
        System.out.println("Insira o salário atual: ");
        salAtual = input.nextFloat();
        System.out.println("Insira o tempo de empresa: ");
        tempoEmp = input.nextInt();
        
            
        if(genero ==1){
            if (tempoEmp < 15){
                novoSal = (salAtual * 1.05f);
            }
            else if(tempoEmp <20){
                novoSal = (salAtual *1.12f);
            }
            else{
                novoSal = (salAtual * 1.23f);
            }
        }
        else if(genero ==2){
            if (tempoEmp < 20){
                novoSal = (salAtual * 1.03f);
            }
            else if(tempoEmp <30){
                novoSal = (salAtual *1.13f);
            }
            else{
                novoSal = (salAtual * 1.25f);
            }
            
        }
        else{
            System.out.println("Gênero inexistente:");
        }
        
        System.out.println("O novo salário deste colaborador é "+ novoSal);

    }

}
