package Modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laboratorio
 */
public class Estudiante extends Persona{
    
    private int CarnetNumero;
    private int Edad_Estudiante;

    public Estudiante(int CarnetNumero, int Edad_Estudiante, int cedula, String nombre, String apellido, String genero, int telefono, String Correo) {
        super(cedula, nombre, apellido, genero, telefono, Correo);
        this.CarnetNumero = CarnetNumero;
        this.Edad_Estudiante = Edad_Estudiante;
    }

    public Estudiante(int CarnetNumero, int Edad_Estudiante) {
        this.CarnetNumero = CarnetNumero;
        this.Edad_Estudiante = Edad_Estudiante;
    }

    public Estudiante() {
    }
  

    public int getCarnetNumero() {
        return CarnetNumero;
    }

    public void setCarnetNumero(int CarnetNumero) {
        this.CarnetNumero = CarnetNumero;
    }

    public int getEdad_Estudiante() {
        return Edad_Estudiante;
    }

    public void setEdad_Estudiante(int Edad_Estudiante) {
        this.Edad_Estudiante = Edad_Estudiante;
    }
    
    
  
}
