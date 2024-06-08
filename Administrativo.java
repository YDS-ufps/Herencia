
/**
 * Write a description of class Administrativo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/*
 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 /* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 /*/

//**
 //*
 //* @author estudiantes
 //*/

public class Administrativo extends Persona {

    private String cargo;
    private double comision;

    public Administrativo(String codigo, String cedula, String nombre, int edad, Fecha fechaActual, Fecha fechaIngreso, double salario, String cargo, double comision) {
        super(codigo, cedula, nombre, edad, fechaActual, fechaIngreso, salario);
        this.cargo = cargo;
        this.comision = comision;
    }

    public String getCargo() {
        return cargo;
    }

    public double getComision() {
        return comision;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    

    @Override
    public void salario() {
        
        salario = salario + comision;
        System.out.println(salario);
        
    }
}
