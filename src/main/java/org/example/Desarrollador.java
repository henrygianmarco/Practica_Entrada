package org.example;

import java.util.List;

public class Desarrollador extends Empleado{
    private List<String> lenguajes;

    public Desarrollador(int id, String nombre, String departamento, double salario, List<String> lenguajes) {
        super(id, nombre, departamento, salario);
        this.lenguajes = lenguajes;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Lenguajes dominados: " + lenguajes);
    }

    @Override
    public double calcularBono() {
        return 100 * lenguajes.size(); // Bono calculado según la cantidad de lenguajes dominados
    }
}
