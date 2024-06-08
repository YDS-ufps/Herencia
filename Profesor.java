
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 

/**
 *
 * @author estudiantes
 */
public class Profesor extends Persona {
    
    private String cargo;
    private int numeroHoras;
    private double valorHora;
    
    public Profesor(String codigo, String cedula, String nombre, int edad, Fecha fechaActual, Fecha fechaIngreso, double salario,String cargo){
        super(codigo, cedula, nombre, edad, fechaActual, fechaIngreso, salario);
        this.cargo = cargo;
        this.numeroHoras = numeroHoras;
        this.valorHora = valorHora;
        
    }
    
    @Override
    public void salario() {
        salario = numeroHoras * valorHora;
        System.out.println(salario);
    }
}
