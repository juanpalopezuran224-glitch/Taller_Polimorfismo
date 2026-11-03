/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.modelo;


public class bicicleta extends vehiculo {

    public bicicleta(String placa, int capacidadKg) {
        super(placa, capacidadKg);
    }

    @Override
    public String describir() {
        return super.describir() + ", bicicleta electrica";
    }

    @Override
    public double tarifaPorKm() {
        return 600;
    }
}
