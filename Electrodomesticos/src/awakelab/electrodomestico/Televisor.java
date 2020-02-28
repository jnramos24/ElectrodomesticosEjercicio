/**
 * Clase Lavadora, hija de Superclase Electrodomestico
 */
package awakelab.electrodomestico;

/**
 * @author toballatorre
 *
 */
public class Televisor extends Electrodomestico {

    // ========== CONSTANTES ==========

    protected final int RESOLUCION_POR_DEFECTO = 20; // pulgadas
    protected final boolean SINTONIZADOR_POR_DEFECTO = false;

    // ========== ATRIBUTOS ==========

    private int resolucion; // pulgadas
    private boolean sintonizadorTDT; // Si incluye TDT: Televisión Digital Terrestre

    // ========== CONSTRUCTORES ==========

    /**
     * Constructor con valores por defecto
     */
    public Televisor() {
        super();
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_POR_DEFECTO;
    }

    /**
     * Constructor con parametros de precio en euros y peso en kg, lo demas por
     * defecto.
     * 
     * @param precio
     * @param peso
     */
    public Televisor(int precio, int peso) {
        super(precio, peso);
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_POR_DEFECTO;
    }

    /**
     * Constructor con todos los parametros de sus atributos: precio en euros, peso
     * en kg, color, consumo electrico, resolucion en pulgadas y si tiene
     * sintonizador TDT
     * 
     * @param precio           euros
     * @param peso             kg
     * @param color
     * @param consumoElectrico
     * @param resolucion       pulgadas
     * @param sintonizadorTDT  true o false
     */
    public Televisor(int precio, int peso, String color, char consumoElectrico, int resolucion,
            boolean sintonizadorTDT) {
        super(precio, peso, color, consumoElectrico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // ========== GET IS ==========

    /**
     * Get resolucion
     * 
     * @return the resolucion
     */
    public int getResolucion() {
        return resolucion;
    }

    /**
     * Is sintonizadorTDT
     * 
     * @return the sintonizadorTDT
     */
    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    // ========== TO STRING ==========

    /**
     * Muestra de manera formateada las caracterisitcas del Televisor
     * 
     */
    @Override
    public String toString() {

        return String.format("%-18s %-7s %12s %5dkg %9d'' %6b €%d", "Televisor", getColor(), getConsumoElectrico(),
                getPeso(), getResolucion(), isSintonizadorTDT(), precioFinal());

    }

    // ========== METODO IMPLEMENTADO ==========

    /**
     * Si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un
     * 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €.
     * 
     * 
     */
    @Override
    public int precioFinal() {

        if (sintonizadorTDT) {
            if (resolucion > 40)
                return Math.round((super.precioFinal() * 1.30f)) + 50;
            else
                return super.precioFinal() + 50;
        } else {
            if (resolucion > 40)
                return Math.round((super.precioFinal() * 1.30f));
            else
                return super.precioFinal();

        }
    }
}
