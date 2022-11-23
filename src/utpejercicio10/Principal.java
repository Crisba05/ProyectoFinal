/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utpejercicio10;

import misClases.*;

/**
 *
 * @author CRISTIAN
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Calculadora objCalc1=new Calculadora();
        System.out.println(objCalc1.operar(12.35f, 10.56f));
        System.out.println(objCalc1.operar(12.35f, 10.56f, 15.0f));
        
        Alumno objalum1=new Alumno(123, "Carlos");
        Alumno objalum2=new Alumno(526, "Roberto", "Garcia Perez", "09/05/2003");
        Alumno objalum3=new Alumno(426, "Maria", "Sanchez Casas", "10/03/2005", "Jr xxxxxxxxxx");
        System.out.println(objalum1.toString());
        System.out.println(objalum2.toString());
        System.out.println(objalum3.toString());
    }
    
}
