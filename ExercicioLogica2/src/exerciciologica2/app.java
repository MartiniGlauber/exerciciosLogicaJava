/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciologica2;

/**
 *
 * @author 182220008
 */
public class app {
    public static void main(String[] args) {
        int v[] = new int[5];
        int cont = 0;
        
        while (cont < 5){
            v[cont] = cont+7;
            cont++;
        }
        for (int i = 0; i <5; i++){
            System.out.println("v["+i+"]:"+v[i]);
        }
    }
}
