/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewCode;

/**
 *
 * @author arian
 */
public class EmpleadoTemporario extends Empleado {

    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento, String genero, int mesesContrato) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento, genero);
        this.mesesContrato = mesesContrato;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Género: " + getMesesContrato());
    }

    // Más metodos
    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

}
