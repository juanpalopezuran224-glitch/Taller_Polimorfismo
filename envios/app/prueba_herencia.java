/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.app;


import envios.modelo.camion;
import envios.modelo.moto;
import envios.modelo.vehiculo;

public class prueba_herencia {
    public static void main(String[] args) {
        moto m1 = new moto("MZL12A", 20, 150);
        camion c1 = new camion("WFT345", 8000, 2);

        System.out.println(m1.describir());
        System.out.println(c1.describir());
        System.out.println(m1.getPlaca());
        System.out.println((int) c1.getEjes());
        System.out.println(m1 instanceof vehiculo);
    }
}