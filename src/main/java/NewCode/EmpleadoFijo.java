/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewCode;

/**
 *
 * @author arian
 */
public class EmpleadoFijo extends Empleado {

    private double bonoAnual;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento, String genero, double bonoAnual) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento, genero);
        this.bonoAnual = bonoAnual;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Bono Anual: " + bonoAnual);
        System.out.println("Género: " + getGenero());
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonoAnual;
    }

    // Más metodos
}
