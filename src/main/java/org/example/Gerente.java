package org.example;

import java.util.List;

public class Gerente extends Empleado implements EvaluacionDesempeno{
    private List<Empleado> equipo;

    public Gerente(int id, String nombre, String departamento, double salario, List<Empleado> equipo) {
        super(id, nombre, departamento, salario);
        this.equipo = equipo;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Equipo a cargo:");
        for (Empleado empleado : equipo) {
            System.out.println("- " + empleado.nombre);
        }
    }

    @Override
    public double calcularBono() {
        return 50 * equipo.size(); // Bono calculado según el número de personas a cargo
    }

    @Override
    public String evaluarDesempeno() {
        // Evaluación de desempeño específica para un Gerente
        if (equipo.size() >= 5) {
            return "Excelente desempeño";
        } else if (equipo.size() >= 3) {
            return "Buen desempeño";
        } else {
            return "Regular desempeño";
        }
    }
}
