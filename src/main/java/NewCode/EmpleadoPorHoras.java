/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewCode;

/**
 *
 * @author arian
 */
public class EmpleadoPorHoras extends Empleado {


    public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, salarioBase, horasTrabajadas,0, departamento, genero);
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Género: " + getGenero());
    }

    @Override
    public double calcularSalario() {
        double salario = super.getHorasTrabajadas() * super.getTarifaHora();
        return salario;
    }

    // Más metodos
}
