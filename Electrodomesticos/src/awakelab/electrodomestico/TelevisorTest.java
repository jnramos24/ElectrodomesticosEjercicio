package awakelab.electrodomestico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TelevisorTest {
    Televisor televisor;

    @BeforeEach
    void setUp() throws Exception {
        televisor = new Televisor();
    }

    @Test
    void testPrecioFinal() {
        int precioFinal = televisor.precioFinal();
        assertEquals(120, precioFinal);
    }

    @Test
    void testGetResolucion() {
        assertEquals(20, televisor.getResolucion());
    }

    @Test
    void testIsSintonizadorTDT() {
        assertEquals(false, televisor.isSintonizadorTDT());
    }

    @Test
    void testGetPrecio() {
        assertEquals(100, televisor.getPrecio());
    }

    @Test
    void testSetPrecio() {
        int precio = 250;
        televisor.setPrecio(precio);
        assertEquals(precio, televisor.getPrecio());
    }

    @Test
    void testGetColor() {
        assertEquals("BLANCO", televisor.getColor());
    }

    @Test
    void testSetColor() {
        String color = "NEGRO";
        televisor.setColor(color);
        assertEquals(color, televisor.getColor());

    }

    @Test
    void testGetConsumoElectrico() {
        assertEquals('F', televisor.getConsumoElectrico());
    }

    @Test
    void testSetConsumoElectrico() {
        char consumo = 'A';
        televisor.setConsumoElectrico(consumo);
        assertEquals(consumo, televisor.getConsumoElectrico());
    }

    @Test
    void testGetPeso() {
        assertEquals(5, televisor.getPeso());
    }

    @Test
    void testSetPeso() {
        int peso = 20;
        televisor.setPeso(peso);
        assertEquals(peso, televisor.getPeso());
    }

}
