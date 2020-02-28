package awakelab.ejecutable;

import awakelab.electrodomestico.Electrodomestico;
import awakelab.electrodomestico.Lavadora;
import awakelab.electrodomestico.Televisor;

class UtilidadesMain {

    /**
     * Crea un a lista de electrodomesticos con datos ingresados
     * 
     * @return la lista creada con los datos.
     */
    public static Electrodomestico[] crearLista() {

        Electrodomestico[] lista = new Electrodomestico[10];

        lista[0] = new Electrodomestico();
        lista[1] = new Lavadora();
        lista[2] = new Televisor();
        lista[3] = new Electrodomestico(190, 80);
        lista[4] = new Lavadora(190, 80);
        lista[5] = new Televisor(190, 80);
        lista[6] = new Electrodomestico(180, 20, "ROJO", 'B');
        lista[7] = new Lavadora(180, 20, "GRIS", 'A', 10);
        lista[8] = new Televisor(180, 20, "NEGRO", 'C', 33, true);
        lista[9] = new Lavadora(90, 90, "MORADO", 'G', 8);

        return lista;
    }

    /**
     * Calcula y muestra por pantalla los precios finales de cada tipo de electro
     * domesticos
     * 
     * @param lista se ingresa la lista de electrodomesticos que se desea calcular
     */
    public static void mostrarPreciosFinales(Electrodomestico[] lista) {

        int precioFinalElectrodomesticos = 0;
        int precioFinalLavadoras = 0;
        int precioFinalTelevisores = 0;

        for (Electrodomestico e : lista) {

            if (e instanceof Televisor)
                precioFinalTelevisores += e.precioFinal();
            else if (e instanceof Lavadora)
                precioFinalLavadoras += e.precioFinal();

            precioFinalElectrodomesticos += e.precioFinal();
        }

        System.out.printf(String.format("%-32s %d %n", "Precio Final Lavadora", precioFinalLavadoras));
        System.out.printf(String.format("%-32s %d %n", "Precio Final Televisor", precioFinalTelevisores));
        System.out.printf(String.format("%-32s %d %n", "Precio Final Electrodomesticos", precioFinalElectrodomesticos));
    }

    /**
     * Muestra por pantalla el detalle de cada uno de los electrodomesticos
     * 
     * @param lista
     */
    public static void mostrarElectrodomesticos(Electrodomestico[] lista) {

        System.out.println(String.format("%-18s %-7s %-13s %-8s %-8s %s", "TIPO", "COLOR", "TIPO CONSUMO", "PESO",
                "CARGA", "PRECIO FINAL"));
        for (Electrodomestico e : lista) {
            if (e instanceof Lavadora)
                System.out.println(e.toString());
        }
        System.out.println("");
        System.out.println(String.format("%-18s %-7s %-13s %-6s %-11s %-6s %s", "TIPO", "COLOR", "TIPO CONSUMO", "PESO",
                "RESOLUCION", "TDT", "PRECIO FINAL"));
        for (Electrodomestico e : lista) {
            if (e instanceof Televisor)
                System.out.println(e.toString());
        }
        System.out.println("");
        System.out.println(
                String.format("%-18s %-7s %-13s %-6s %s", "TIPO", "COLOR", "TIPO CONSUMO", "PESO", "PRECIO FINAL"));
        for (Electrodomestico e : lista) {
            if (!(e instanceof Lavadora || e instanceof Televisor))
                System.out.println(e.toString());
        }
    }

}
