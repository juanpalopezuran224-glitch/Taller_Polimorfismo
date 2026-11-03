/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envios.app;

import envios.modelo.*;

public class prueba_retos {
    public static void main(String[] args) {
   
        camion c1 = new camion("WFT345", 8000, 2);
        vehiculo w = c1; 
        
 
     if (w instanceof camion) {
    System.out.println("--- Resultado Reto 3 ---");
    System.out.println(((camion) w).getEjes()); 
}


        
        System.out.println("--- Resultados Reto 4 ---");
        System.out.println(c1.costoEnvio(10, true));  
        System.out.println(c1.costoEnvio(10, false)); 
       
        System.out.println("--- Resultados Reto 6 ---");
        vehic_prueba();
    }

    public static void vehic_prueba() {
        vehiculo v = new moto("AAA11A", 20, 100);
        System.out.println(v.describir());
        System.out.println(v.costoEnvio(10));
        System.out.println(v instanceof asegurable);
        System.out.println(v instanceof camion);

        asegurable a = new bodega("Bodega Norte", 50);
        System.out.println(a.valorSeguro());
    }
}    

