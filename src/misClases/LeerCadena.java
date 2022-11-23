/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misClases;

/**
 *
 * @author CRISTIAN
 */
import java.io.*;
public class LeerCadena {
    public static String lectura()
    {
        String cadena=null;
        try 
        {
            BufferedReader dato=new BufferedReader(new InputStreamReader(System.in));
            cadena=dato.readLine();
        } 
        catch (Exception e) 
        {
            
        }
        return cadena;
    }
    
}
