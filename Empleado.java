
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
    private static int empleados = 100;
    
    public Empleado(String nombre, String apellido, double salario, int dia,int mes, int año)
    {
        this.nombre = new String(nombre);
        this.apellido = new String(apellido);
        numeroEmpleado = empleados++;
        ingreso = new Date(año, mes, dia);
        setSalario(salario);
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
    
    public static void main(String args[]) {
        Empleado robert = new Empleado("Roberto", "Salazar", 800.00, 15,2,2022);
        System.out.println( robert.toString() );
        
    }
    
    
}










