/**
 * Clase Lavadora, hija de Superclase Electrodomestico
 */
package electrodomestico;

/**
 * @author toballatorre
 *
 */
public class Lavadora extends Electrodomestico {

    // ========== CONSTANTE ==========

    protected final int CARGA_POR_DEFECTO = 5; // kg

    // ========== ATRIBUTOS ==========

    private int carga; // kg
    
    // ========== GET ==========
    
    public int getCarga() {
        return carga;
    }
    
    // ========== TO STRING ==========
    
    /**
     * Muestra de manera formateada las caracterisitcas de la Lavadora
     * 
     */
    @Override
    public String toString() {
        
        return String.format("%-18s %-7s %12s %5dkg %6dkg €%d", "Lavadora", getColor(), getConsumoElectrico(), getPeso(),
                getCarga(), precioFinal());
    }

    // ========== CONSTRUCTORES ===========
    
    /**
     * Constructor con valores por defecto
     */
    public Lavadora() {
        super();
        this.carga = CARGA_POR_DEFECTO;
    }

    /**
     * Constructor con parametros de precio en euros y peso en kg, lo demas por
     * defecto.
     * 
     * @param precio en euros
     * @param peso   kg
     */
    public Lavadora(int precio, int peso) {
        super(precio, peso);
        this.carga = CARGA_POR_DEFECTO;
    }

    /**
     * Constructor con todos los parametros de sus atributos: precio en euros, peso
     * en kg, color, consumo electrico y carga kg
     * 
     * @param precio           euros
     * @param peso             kg
     * @param color
     * @param consumoElectrico
     * @param carga            kg
     */
    public Lavadora(int precio, int peso, String color, char consumoElectrico, int carga) {
        super(precio, peso, color, consumoElectrico);
        this.carga = carga;
    }

    // ========== METODO IMPLEMENTADO ==========
    
    /**
     * Si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no
     * se incrementara el precio
     * 
     * @return el precio final de la super clase con la adicion de precio segun
     *         corresponda la condicion
     */
    @Override
    public int precioFinal() {

        if (carga > 30)
            return super.precioFinal() + 50;
        else
            return super.precioFinal();
    }

}
