/**
 * Clase Lavadora, hija de Superclase Electrodomestico
 */
package electrodomestico;

/**
 * @author toballatorre
 *
 */
public class Televisor extends Electrodomestico {

    // ========== CONSTANTES ==========

    protected final float RESOLUCION_POR_DEFECTO = 20f; // pulgadas
    protected final boolean SINTONIZADOR_POR_DEFECTO = false;

    // ========== ATRIBUTOS ==========

    private float resolucion; // pulgadas
    private boolean sintonizadorTDT; // Si incluye TDT: Televisión Digital Terrestre

    // ========== GET IS ==========

    /**
     * Get resolucion
     * 
     * @return the resolucion
     */
    public float getResolucion() {
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
    public Televisor(int precio, int peso, String color, char consumoElectrico, float resolucion,
            boolean sintonizadorTDT) {
        super(precio, peso, color, consumoElectrico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // ========== METODO IMPLEMENTADO ==========

    /**
     * Si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un
     * 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €.
     * 
     * @param precioBase precio ingresado para calcular el valor final segun las
     *                   condiciones.
     */
    @Override
    public int precioFinal(int precioBase) {

        if (sintonizadorTDT) {
            if (resolucion > 40)
                return Math.round((super.precioFinal(precioBase) * 1.30f)) + 50;
            else
                return super.precioFinal(precioBase) + 50;
        } else {
            if (resolucion > 40)
                return Math.round((super.precioFinal(precioBase) * 1.30f));
            else
                return super.precioFinal(precioBase);

        }
    }
}
