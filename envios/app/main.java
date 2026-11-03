/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.app;

import envios.modelo.bicicleta;
import envios.modelo.bodega;
import envios.modelo.camion;
import envios.modelo.flota;
import envios.modelo.moto;
import envios.modelo.asegurable;

import java.util.ArrayList;

public class  main {
    public static void main(String[] args) {
        moto m1 = new moto("MZL12A", 20, 150);
        camion c1 = new camion("WFT345", 8000, 2);
        moto m2 = new moto("KJH78B", 25, 200);

        flota flota = new flota("Envios Caldas");

        flota.agregar(m1);
        flota.agregar(c1);
        flota.agregar(m2);

        System.out.println(m1.costoEnvio(12));
        System.out.println((int) c1.costoEnvio(12));
        System.out.println(flota.totalSeguros());
        
        ArrayList<asegurable> asegurables = new ArrayList<>();
        asegurables.add(c1);
        asegurables.add(new bodega("Bodega Chipre", 300));

        bicicleta b1 = new bicicleta("BIC001", 10);
        flota.agregar(b1);
        flota.mostrar();
        
        double sumaAsegurables = 0;
        for (asegurable a : asegurables) {
            System.out.println((int) a.valorSeguro());
            sumaAsegurables += a.valorSeguro();
        }
        System.out.println(sumaAsegurables);
        
        System.out.println(flota.masEconomico(8) != null ? flota.masEconomico(8).getPlaca() : "null");
        System.out.println(flota.masEconomico(22) != null ? flota.masEconomico(22).getPlaca() : "null");
        System.out.println(flota.masEconomico(500) != null ? flota.masEconomico(500).getPlaca() : "null");
        System.out.println(flota.masEconomico(9000) != null ? flota.masEconomico(9000).getPlaca() : "null");
    }
}