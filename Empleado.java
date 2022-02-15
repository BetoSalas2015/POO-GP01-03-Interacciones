
/**
 * Write a description of class Empleado here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
import java.util.Date;

public class Empleado
{
    private String nombre;
    private String apellido;
    private int numeroEmpleado;
    private Date ingreso;
    private double salario;
    
    public Empleado(String nom, String ap, double sal, int dia,int mes, int año)
    {
        nombre = new String(nom);
        apellido = new String(ap);
        numeroEmpleado = 100;
        ingreso = new Date(año, mes, dia);
        setSalario(sal);
    }
    
    public void setSalario(double sal) {
        salario = (sal > 0) ? sal : 1;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public String getNombre() {
        return new String(nombre);              //  enfoque uno
    }
    
    public String getApellido() {
        return new String(apellido);        // enfoque dos
    }
    
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }
    
    public Date getIngreso() {
        return new Date(); 
    }
    
    public String toString() {
        return "Empleado: " + nombre + " " + apellido + ", ID: " + 
                Integer.toString(numeroEmpleado) + 
                ", Fecha Ingreso: " + ingreso.toString() + ", Salario: " + 
                Double.toString(salario);
    }
    
}








