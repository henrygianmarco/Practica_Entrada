package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear empleados
        List<Empleado> empleados = new ArrayList<>();
        List<String> lenguajesDesarrollador = new ArrayList<>();
        lenguajesDesarrollador.add("Java");
        lenguajesDesarrollador.add("Python");
        empleados.add(new Desarrollador(1, "Juan", "Desarrollo", 50000, lenguajesDesarrollador));

        List<Empleado> equipoGerente = new ArrayList<>();
        equipoGerente.add(new Empleado(2, "Ana", "Ventas", 60000) {
            @Override
            public double calcularBono() {
                return 0;
            }
        });
        equipoGerente.add(new Empleado(3, "Carlos", "Marketing", 55000) {
            @Override
            public double calcularBono() {
                return 0;
            }
        });
        empleados.add(new Gerente(4, "María", "Gerencia", 70000, equipoGerente));

        // Mostrar detalles de empleados
        for (Empleado empleado : empleados) {
            empleado.mostrarDetalles();
            System.out.println("Bono: S/." + empleado.calcularBono());
            if (empleado instanceof EvaluacionDesempeno) {
                System.out.println("Evaluación de desempeño: " + ((EvaluacionDesempeno) empleado).evaluarDesempeno());
            }
            System.out.println();
        }
    }
}