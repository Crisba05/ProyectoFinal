/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misClases;

/**
 *
 * @author CRISTIAN
 */
public class Calculadora 
{
    float numero1;
    float numero2;
    float numero3;
    float numero4;
    ///////////////////////////
    public float operar(float numero1p, float numero2p)
    {
        this.numero1= numero1p;
        this.numero2= numero2p;
        return this.numero1+this.numero2;
        
    }
    public float operar(float numero1p, float numero2p,float numero3p)
    {
        this.numero1= numero1p;
        this.numero2= numero2p;
        this.numero3= numero3p;
        return this.numero1+this.numero2+this.numero3;
        
    }
    public float operar(float numero1p, float numero2p,float numero3p, float numero4p)
    {
        this.numero1= numero1p;
        this.numero2= numero2p;
        this.numero3= numero3p;
        this.numero4= numero4p;
        return this.numero1*this.numero2+this.numero3*this.numero4;
        
    }
    
}
