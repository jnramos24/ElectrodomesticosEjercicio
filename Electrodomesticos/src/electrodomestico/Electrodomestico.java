/**
 * Superclase Electrodomestico que implementa IPrecioCalculable
 */
package electrodomestico;

/**
 * @author toballatorre
 *
 */
public class Electrodomestico implements IPrecioCalculable {

    // ========== CONSTANTES ==========

    protected final String[] COLOR = { "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" };
    protected final int PESO_POR_DEFECTO = 5; // Kg
    protected final int PRECIO_POR_DEFECTO = 100;
    protected final char[] CLASIFICACION_CONSUMO = { 'A', 'B', 'C', 'D', 'E', 'F' };

    // ========== ATRIBUTOS HEREDABLES==========
    private int precio; // euros
    private String color;
    private char consumoElectrico; // Entre A - Z
    private int peso; // Kg

    // ========== CONSTRUCTORES ==========

    /**
     * Constructor con valores por defectoConstructor por defecto
     */
    public Electrodomestico() {
        this.color = COLOR[0];
        this.consumoElectrico = CLASIFICACION_CONSUMO[5];
        this.precio = PRECIO_POR_DEFECTO;
        this.peso = PESO_POR_DEFECTO;
    }

    /**
     * Constructor con parametros de precio en euros y peso en kg
     * 
     * @param precio en euros
     * @param peso   kg
     */
    public Electrodomestico(int precio, int peso) {
        this();
        this.precio = precio;
        this.peso = peso;
    }

    /**
     * Constructor con todos los parametros de sus atributos: precio en euros, peso
     * en kg, color y consumo electrico
     * 
     * @param precio           en euros
     * @param peso             kg
     * @param color
     * @param consumoElectrico
     */
    public Electrodomestico(int precio, int peso, String color, char consumoElectrico) {
        this(precio, peso);
        this.color = comprobarColor(color);
        this.consumoElectrico = comprobarConsumoEnergetico(consumoElectrico);
    }

    // ========== GET SET ===========

    // ----------- GET CONSTANTES ----------

    /**
     * Get COLOR
     * 
     * @return the COLOR
     */
    public String[] getCOLOR() {
        return COLOR;
    }

    /**
     * GET PRECIO_BASE
     * 
     * @return the PRECIO_BASE
     */
    public int getPRECIO_POR_DEFECTO() {
        return PRECIO_POR_DEFECTO;
    }

    /**
     * GET PESO_POR_DEFECTO
     * 
     * @return the PESO_POR_DEFECTO
     */
    public int getPESO_POR_DEFECTO() {
        return PESO_POR_DEFECTO;
    }

    /**
     * GET CLASIFICACION_CONSUMO
     * 
     * @return the CLASIFICACION_CONSUMO
     */
    public char[] getCLASIFICACION_CONSUMO() {
        return CLASIFICACION_CONSUMO;
    }

    // ---------- GET SET ATRIBUTOS -----------

    /**
     * Get precio
     * 
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Set precio
     * 
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Get color
     * 
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set color
     * 
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get consumoElectrico
     * 
     * @return the consumoElectrico
     */
    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    /**
     * Set consumoElectrico
     * 
     * @param consumoElectrico the consumoElectrico to set
     */
    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    /**
     * Get peso
     * 
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Set peso
     * 
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    // ========== TO STRING ==========

    /**
     * Muestra de manera formateada las caracterisitcas del Electrodomestico
     * 
     * @param String formateado
     */
    @Override
    public String toString() {
        
        return String.format("%-18s %-7s %2s %5d %5d", "Electrodomestico", getColor(), getConsumoElectrico(), getPeso(),
                precioFinal());
    }

    // =========== METODOS ===========

    /**
     * Comprueba que la letra es correcta, sino es correcta usara la letra por
     * defecto.
     * 
     * @param letra a comprobar
     * @return la letra por defecto o la correctamente ingresada
     */
    private char comprobarConsumoEnergetico(char letra) {
        for (char c : CLASIFICACION_CONSUMO) {
            if (letra == c)
                return letra;
        }
        return CLASIFICACION_CONSUMO[5];
    }

    /**
     * Comprueba que el color es correcto, sino lo es usa el color por defecto.
     * 
     * @param color a comprobar
     * @return el color pot defecto "BLANCO"
     */
    private String comprobarColor(String color) {
        for (String s : COLOR) {
            if (s.equals(color))
                return color;
        }
        return COLOR[0];
    }

    // ========== METODO IMPLEMENTADO ==========
    
    /**
     * Según el consumo energético, aumentara su precio, y según su tamaño también.
     * ETRA     PRECIO
     * A        100 €
     * B        80 €
     * C        60 €
     * D        50 €
     * E        30 €
     * F        10 € 
     * 
     * TAMAÑO                   PRECIO 
     * Entre 0 y 19 kg          10 €
     * Entre 20 y 49 kg         50 €
     * Entre 50 y 79 kg         80 € 
     * Mayor que 80 kg          100 € 
     * 
     * @param el precio base para calcular el precio final
     * @return el precio final segun las condiciones
     */
    @Override
    public int precioFinal() {
        int precioConsumo = 0;
        int precioTamano = 0;

        // Comprueba el precio a base del consumo electrico
        if (consumoElectrico == 'A')
            precioConsumo = 100;
        else if (consumoElectrico == 'B')
            precioConsumo = 80;
        else if (consumoElectrico == 'C')
            precioConsumo = 60;
        else if (consumoElectrico == 'D')
            precioConsumo = 50;
        else if (consumoElectrico == 'E')
            precioConsumo = 30;
        else if (consumoElectrico == 'F')
            precioConsumo = 10;

        if (peso >= 0 && peso < 20)
            precioTamano = 10;
        else if (peso >= 20 && peso < 50)
            precioTamano = 50;
        else if (peso >= 50 && peso < 80)
            precioTamano = 80;
        else if (peso >= 80)
            precioTamano = 100;

        return precio + precioConsumo + precioTamano;
    }

}
