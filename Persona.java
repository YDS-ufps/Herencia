
 /**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Persona {
    
    String codigo, cedula, nombre;
    int edad;
    Fecha fechaActual;
    Fecha fechaIngreso;
    double salario;

    public Persona() {
    }

    public Persona(String codigo, String cedula, String nombre, int edad, Fecha fechaActual, Fecha fechaIngreso, double salario) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaActual = fechaActual;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Fecha getFevhaActual() {
        return fechaActual;
    }

    public Fecha getFechaIngreso() {
        return fechaIngreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFevhaActual(Fecha fevhaActual) {
        this.fechaActual = fevhaActual;
    }

    public void setFechaIngreso(Fecha fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void imprimirInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Cedula: " + cedula);
        System.out.println("Código: " + codigo);
    }
    
    public int calcularExperiencia(Fecha fechaActual, Fecha fechaIngreso){
        int experiencia;
        return experiencia = fechaActual.getAnio() - fechaIngreso.getAnio();
    }
    
    public abstract void salario();
}