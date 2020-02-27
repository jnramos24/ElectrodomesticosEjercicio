/**
 * Crea un array de Electrodomésticos de 10 posiciones.
 * 
 *      - Asigna a cada posición un objeto de las clases anteriores con los 
 *      valores que desees.
 *      
 *      - Ahora, recorre este array y ejecuta el método precioFinal (). 
 *      
 *      - Deberás mostrar el precio de cada clase, es decir, el precio de todas
 *      las televisiones, por un lado, el de las lavadoras por otro 
 *      y la suma de los Electrodomésticos
 *      (puedes crear objetos Electrodoméstico, pero recuerda que Televisión y
 *      Lavadora también son electrodomésticos).
 *      Recuerda el uso operador instanceof.  
 */
package ejecutable;

import electrodomestico.*;

/**
 * @author toballatorre
 *
 */
public class Main {
    public static void main(String[] args) {

        IPrecioCalculable[] electrodomesticos = new IPrecioCalculable[10];

        int total = 0;

        for (IPrecioCalculable e : electrodomesticos) {
            System.out.println(e.toString());
            total += e.precioFinal();
        }
        System.out.println(total);

    }

}
