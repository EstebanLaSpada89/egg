/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8_pagina24;

import static com.sun.javafx.fxml.expression.Expression.and;
import static com.sun.javafx.fxml.expression.Expression.and;
import java.util.Scanner;
import static javafx.beans.binding.Bindings.and;

/**
 *
 * @author Esteban
 */
public class Ejercicio8_pagina24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se 
        //pedirá de nuevo hasta que la nota sea correcta.
        Scanner leer=new Scanner(System.in);
        System.out.println("Escriba su nota del 1 al 10");
        int nota=leer.nextInt();
                
       
        while (nota>10 || nota<1){
            System.out.println("Ingrese una nota valida");
            nota=leer.nextInt();
        }
        System.out.println("Su nota es " + nota);
    }
    
}
