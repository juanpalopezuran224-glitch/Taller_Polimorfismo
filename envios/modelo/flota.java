/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.modelo;


import java.util.ArrayList;

public class flota {
    private final String nombre;
    private final ArrayList<vehiculo> vehiculos;

    public flota(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public boolean agregar(vehiculo vehiculo) {
        if (vehiculo == null || vehiculos.contains(vehiculo)) {
            return false;
        }
        // Opcional: verificar si ya existe una placa igual
        for (vehiculo v : vehiculos) {
            if (v.getPlaca().equals(vehiculo.getPlaca())) {
                return false;
            }
        }
        vehiculos.add(vehiculo);
        return true;
    }

    public void mostrar() {
        System.out.println(nombre + ":");
        for (vehiculo v : vehiculos) {
            System.out.println("- " + v.describir());
        }
    }

    public int cantidadCamiones() {
        int contador = 0;
        for (vehiculo v : vehiculos) {
            if (v instanceof camion) {
                contador++;
            }
        }
        return contador;
    }
    public vehiculo masEconomico(int pesoKg) {
        vehiculo mejor = null; // Ojo: tipado como Vehiculo
        double menorTarifa = Double.MAX_VALUE;

        for (vehiculo v : vehiculos) {
            if (v.getCapacidadKg() >= pesoKg) {
                if (v.tarifaPorKm() < menorTarifa) {
                    menorTarifa = v.tarifaPorKm();
                    mejor = v;
                }
            }
        }
        return mejor;
    }
    public double totalSeguros() {
        double suma = 0;
        for (vehiculo v : vehiculos) {
            if (v instanceof asegurable) {
                suma += ((asegurable) v).valorSeguro();
            }
        }
        return suma;
    }
}