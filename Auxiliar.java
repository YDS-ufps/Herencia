
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 

/**
 *
 * @author estudiantes
 */
public class Auxiliar extends Persona {
    
    private String cargo;
    private double auxilioTransporte;
    
    public Auxiliar(String codigo, String cedula, String nombre, int edad, Fecha fechaActual, Fecha fechaIngreso, double salario,String cargo,double auxilioTransporte){
        super(codigo, cedula, nombre, edad, fechaActual, fechaIngreso, salario);
        this.cargo = cargo;
        this.auxilioTransporte = auxilioTransporte;
    }

    public String getCargo() {
        return cargo;
    }

    public double getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setAuxilioTransporte(double auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }
    
    @Override
    public void salario() {
        
    }
    
}
