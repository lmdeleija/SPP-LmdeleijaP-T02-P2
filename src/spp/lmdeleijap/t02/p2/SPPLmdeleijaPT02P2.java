/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lmdeleijap.t02.p2;
import java.util.Scanner;

/**
 *
 * @author luixm_000
 */
public class SPPLmdeleijaPT02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido al programa");
        op();
        
        System.out.println("Adiós");
        }
    static int Content(String valor){
        Scanner kb = new Scanner (System.in);
        
        System.out.println("Ingrese" + valor + " : ");
        int datos = kb.nextInt();
        
        return datos; 
        }
    static void Divisible (int valor){
        if ((valor%2)==0){
            System.out.println(valor + "es un número par");
            } if ((valor%3)==0){
                System.out.println(valor + "Es un numero que se puede dividir entre 3");
                } if ((valor%5)==0){
                    System.out.println(valor + "es un número divisible entre 5\n ");
                    } else {
                    }
                }
    static void op(){
        int valinf = Content("Valor inferior");
        int valsup = Content("Valor superior");
        int count = valinf; 
         System.out.println("Los valores existentes entre "+valinf+" y "+valsup+" son: ");
    while (count < valsup - 1){
        System.out.println(count=count+1);
    }System.out.println("");
    Divisible(valinf);
    Divisible(valsup);
                 
        
        }
    }
    

