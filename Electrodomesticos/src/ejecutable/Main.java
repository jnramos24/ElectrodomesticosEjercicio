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

        IPrecioCalculable[] electrodomesticos = crearLista();
        
        mostrarPreciosFinales(electrodomesticos);
        
        mostrarElectrodomesticos(electrodomesticos);

    }
    
    /**
     * Crea un a lista de electrodomesticos con datos ingresados
     * 
     * @return la lista creada con los datos.
     */
    public static IPrecioCalculable[] crearLista() {
        
        IPrecioCalculable[] lista = new IPrecioCalculable[10];
        
        lista[0] = new Electrodomestico();
        lista[1] = new Lavadora();
        lista[2] = new Televisor();
        lista[3] = new Electrodomestico(50, 5);
        lista[4] = new Lavadora(150, 50);
        lista[5] = new Televisor(80, 15);
        lista[6] = new Electrodomestico(180, 20, "ROJO", 'B');
        lista[7] = new Lavadora(200, 60, "GRIS", 'A', 10);
        lista[8] = new Televisor(125, 12, "NEGRO", 'C', 33, true);
        lista[9] = new Lavadora(90, 90, "MORADO", 'G', 8);
        
        return lista;
    }
    
    /**
     * Calcula y muestra por pantalla los precios finales de cada tipo de electro domesticos
     * 
     * @param lista se ingresa la lista de electrodomesticos que se desea calcular
     */
    public static void mostrarPreciosFinales(IPrecioCalculable[] lista) {
        
        int precioFinalElectrodomesticos = 0;
        int precioFinalLavadoras = 0;
        int precioFinalTelevisores = 0;
        
        for (IPrecioCalculable e : lista) {
            
            if (e instanceof Televisor)
                precioFinalTelevisores += e.precioFinal();
            else if (e instanceof Lavadora)
                precioFinalLavadoras += e.precioFinal();
            
            precioFinalElectrodomesticos += e.precioFinal();
        }
        
        System.out.printf(String.format("%-32s %d %n", "Precio Final Lavadora", precioFinalLavadoras));
        System.out.printf(String.format("%-32s %d %n", "Precio Final Televisor", precioFinalTelevisores));
        System.out.printf(String.format("%-32s %d %n", "Precio Final Electrodomesticos", precioFinalElectrodomesticos));
        System.out.println("");
    }

    /**
     * Muestra por pantalla el detalle de cada uno de los electrodomesticos
     * 
     * @param lista
     */
    public static void mostrarElectrodomesticos(IPrecioCalculable[] lista) {
        
        System.out.println(String.format("%-18s %-7s %-13s %-8s %-8s %s", "TIPO", "COLOR", "TIPO CONSUMO", "PESO", "CARGA", "PRECIO FINAL"));
        for (IPrecioCalculable e : lista) {
            if (e instanceof Lavadora)
                System.out.println(e.toString());
        }
        System.out.println("");
        System.out.println(String.format("%-18s %-7s %-13s %-6s %-11s %-6s %s", "TIPO", "COLOR", "TIPO CONSUMO", "PESO", "RESOLUCION", "TDT", "PRECIO FINAL"));
        for (IPrecioCalculable e : lista) {
            if (e instanceof Televisor)
                System.out.println(e.toString());
        }
        System.out.println("");
        System.out.println(String.format("%-18s %-7s %-13s %-6s %s", "TIPO", "COLOR", "TIPO CONSUMO", "PESO", "PRECIO FINAL"));
        for (IPrecioCalculable e : lista) {
            if (!(e instanceof Lavadora || e instanceof Televisor))
                System.out.println(e.toString());
        }
    }
}
