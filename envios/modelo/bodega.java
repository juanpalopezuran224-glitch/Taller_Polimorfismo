/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.modelo;


public class bodega implements asegurable {
    private String nombre;
    private int metros;

    public bodega(String nombre, int metros) {
        this.nombre = nombre;
        this.metros = metros;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMetros() {
        return metros;
    }

    @Override
    public double valorSeguro() {
        return metros * 2000;
    
    }
    
}