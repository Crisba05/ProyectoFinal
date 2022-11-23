/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misClases;

/**
 *
 * @author CRISTIAN
 */
public class Alumno
{
    int codigo;
    String nombres;
    String apellidos; 
    String fechaNacimiento;
    String direccion;

    public Alumno(int codigo, String nombres) {
        this.codigo = codigo;
        this.nombres = nombres;
    }

    public Alumno(int codigo, String nombres, String apellidos, String fechaNacimiento) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Alumno(int codigo, String nombres, String apellidos, String fechaNacimiento, String direccion) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + '}';
    }
    
    
}


