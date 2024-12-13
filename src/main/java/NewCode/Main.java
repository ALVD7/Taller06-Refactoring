/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewCode;

/**
 *
 * @author arian
 */
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        EmpleadoPorHoras emp1 = new EmpleadoPorHoras("Pablo", 300.0, 40, 20.0, "1", "Masculino");

        empresa.contratarEmpleado(emp1);

        emp1.imprimirDetalles();

    }
}
