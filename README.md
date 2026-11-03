1. En el main escribe new Vehiculo ("XYZ999", 50). Copia el error y explica por qué ocurre.   Error copiado: Vehiculo is abstract; cannot be instantiated.   Explicación: Ocurre porque Vehiculo es una clase abstracta, lo que significa que funciona únicamente como un molde general para ser heredado, por lo que Java no permite crear objetos directamente de ella utilizando new.
2. Quita temporalmente tarifaPorKm() de Bicicleta. Copia el error, explícalo y deja el método de nuevo.   Error copiado: Bicicleta is not abstract and does not override abstract method tarifaPorKm() in Vehiculo.   Explicación: Una clase hija concreta está obligada por el compilador a implementar todos los métodos abstractos heredados de su clase padre abstracta, a menos que ella misma se declare como abstracta.
3. Escribe Vehiculo w = c1; e imprime w.getEjes (). Copia el error. Luego corrígelo con instanceof para que imprima 2 sin cambiar el tipo de w.   Error copiado: cannot find symbol: method getEjes().   Corrección con instanceof:Javaif (w instanceof Camion) {
    System.out.println(((Camion) w).getEjes());}
4. Agrega a Vehiculo costoEnvio (double km, boolean urgente): si es urgente cuesta 50% más. Imprime cl.costoEnvio (10, true) y cl.costo Envio (10, false). ¿Es sobrecarga o sobrescritura? ¿Por qué?   Respuesta: Es un caso de sobrecarga.   ¿Por qué?: Ocurre dentro de la misma clase Vehiculo al tener múltiples métodos con el mismo nombre (costoEnvio), pero diferenciándose en la cantidad y tipo de sus parámetros (uno recibe un double y el otro recibe un double y un boolean).
5. En Bicicleta borra el @Override y cambia el nombre del método a describr. Muestra la flota. ¿Qué cambió en la salida, por qué compiló y qué habría pasado con @Override? Déjalo como estaba.   Respuesta: Al quitar @Override y cambiar el nombre a describr, Java ya no lo considera una sobrescritura válida, sino un método nuevo y diferente. Por lo tanto, al recorrer la flota con polimorfismo, el sistema invocará el método describir() heredado del padre Vehiculo en vez del método propio de la bicicleta. Compiló porque sintácticamente es válido crear un método con un nombre nuevo, pero si se hubiera dejado la anotación @Override junto con el nombre mal escrito (describr), el compilador habría arrojado un error inmediato indicando que el método no coincide con ninguno del tipo superior.
6. Predice la salida sin ejecutar. Luego compruébala.   Código a evaluar:JavaVehiculo v = new Moto("AAA11A", 20, 100);
System.out.println(v.describir());
System.out.println(v.costoEnvio(10));
System.out.println(v instanceof Asegurable);
System.out.println(v instanceof Camion);
Asegurable a = new Bodega("Bodega Norte", 50);
System.out.println(a.valorSeguro());
Salida predicha:PlaintextAAA11A (20 kg), moto de 100 cc
12000.0
true
false
100000.0

1. ¿Por qué Bicicleta funcionó en mostrar() y en mas Economico() sin cambiar una sola línea de Flota?
Gracias al principio de polimorfismo, la clase Flota opera con una lista de tipo genérico Vehiculo. Como la clase Bicicleta hereda de Vehiculo, el sistema la reconoce de forma automática como un vehículo válido, permitiendo que los métodos de la flota la procesen sin necesidad de modificar el código existente.
2. ¿Por qué Vehiculo es abstracta y Moto no? ¿Qué pasaría si Moto también lo fuera?
Vehiculo es una clase abstracta porque representa un concepto general y abstracto del cual no se crean objetos directos en la realidad; en cambio, Moto es un objeto concreto que sí se puede instanciar. Si Moto también fuera abstracta, el sistema no permitiría crear objetos de tipo moto usando new Moto(...), exigiendo la creación de clases hijas concretas.
3. ¿Por qué Bodega implementa Asegurable pero no hereda de Vehiculo?
Porque una bodega cumple con la capacidad operativa de "poder ser asegurada" (Asegurable), pero bajo ningún concepto cumple con la premisa de que "es un" vehículo (Vehiculo). Las interfaces definen capacidades transversales, mientras que la herencia define identidades y jerarquías estrictas.
4. ¿Qué diferencia hay entre super(placa, capacidadKg) y super.describir()?
super(...) se emplea obligatoriamente en la primera línea del constructor de la clase hija para invocar al constructor de la clase padre. En cambio, super.describir() se invoca dentro de un método sobrescrito de la clase hija para reutilizar la lógica original que tenía el método del padre y complementarla.
5. Cierre del curso: explica con tus palabras qué es la POO y señala en tu código del taller un ejemplo de cada pilar: abstracción, encapsulamiento, herencia y polimorfismo.
La Programación Orientada a Objetos (POO) es una forma de programar en la que resolvemos problemas creando objetos que tienen datos (atributos) y comportamientos (métodos), los cuales trabajan y colaboran en equipo.
