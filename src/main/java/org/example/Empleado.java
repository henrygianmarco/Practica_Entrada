package org.example;

public abstract class Empleado {
    protected int id;
    protected String nombre;
    protected String departamento;
    protected double salario;

    public Empleado(int id, String nombre, String departamento, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: S/ " + salario);
    }

    public abstract double calcularBono();
}
