/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.modelo;



public class camion extends vehiculo implements asegurable {
    private int ejes;

    public camion(String placa, int capacidadKg, int ejes) {
        super(placa, capacidadKg);
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    @Override
    public String describir() {
        return super.describir() + ", camion de " + ejes + " ejes";
    }
    @Override
    public double tarifaPorKm() {
        return 3000 + 1000 * ejes;
    }
    @Override
    public double valorSeguro() {
        return 400000 * ejes;
        
}  
    public double costoEnvio(double km, boolean urgente) {
        double costoBase = super.costoEnvio(km);
        if (urgente) {
            return costoBase * 1.50;
        }
        return costoBase;
    }
} 
    
 

