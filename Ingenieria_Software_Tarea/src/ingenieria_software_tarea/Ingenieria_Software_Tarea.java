/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingenieria_software_tarea;

import java.util.Scanner;
import ingenieria_software_tarea.Calculardora;

/**
 *
 * @author jefferson
 */
public class Ingenieria_Software_Tarea extends Calculardora{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Calculardora nueva = new Calculardora();
         nueva.mostrarMensaje();
        System.out.println("SUMAR");
        Scanner entrada=new Scanner(System.in);
        System.out.println("INGRESE PRIMER VALOR ");
        int a=entrada.nextInt();
        
        System.out.println("INGRESE SEGUNDO VALOR");
        int b=entrada.nextInt();
        
       
        nueva.suma(a,b);
         
        System.out.println("ESTIMADO USUARIO ESTE ES EL RESULTADO :  "+nueva.suma(a, b));
    }
    
    
  
    
}
