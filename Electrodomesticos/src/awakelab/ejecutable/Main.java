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
package awakelab.ejecutable;

import awakelab.electrodomestico.*;
import awakelab.ejecutable.UtilidadesMain;

/**
 * @author toballatorre
 *
 */
public class Main {

    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = UtilidadesMain.crearLista();

        UtilidadesMain.mostrarElectrodomesticos(electrodomesticos);

        System.out.println("");
        UtilidadesMain.mostrarPreciosFinales(electrodomesticos);

    }
}
