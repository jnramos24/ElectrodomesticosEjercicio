package awakelab.electrodomestico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElectrodomesticoTest {
    Electrodomestico electrodomestico;

    @BeforeEach
    void setUp() throws Exception {
        electrodomestico = new Electrodomestico();
    }

    @Test
    void testGetPrecio() {
        assertEquals(100, electrodomestico.getPrecio());
    }

    @Test
    void testSetPrecio() {
        int precio = 40;
        electrodomestico.setPrecio(precio);
        assertEquals(precio, electrodomestico.getPrecio());
    }

    @Test
    void testGetColor() {
        assertEquals("BLANCO", electrodomestico.getColor());
    }

    @Test
    void testSetColor() {
        String color = "NEGRO";
        electrodomestico.setColor(color);
        assertEquals(color, electrodomestico.getColor());
    }

    @Test
    void testGetConsumoElectrico() {
        assertEquals('F', electrodomestico.getConsumoElectrico());
    }

    @Test
    void testSetConsumoElectrico() {
        char consumo = 'B';
        electrodomestico.setConsumoElectrico(consumo);
        assertEquals(consumo, electrodomestico.getConsumoElectrico());
    }

    @Test
    void testGetPeso() {
        assertEquals(5, electrodomestico.getPeso());
    }

    @Test
    void testSetPeso() {
        int peso = 30;
        electrodomestico.setPeso(peso);
        assertEquals(peso, electrodomestico.getPeso());
    }

    @Test
    void testPrecioFinal() {
        int precioFinal = electrodomestico.precioFinal();
        assertEquals(120, precioFinal);
    }

}
