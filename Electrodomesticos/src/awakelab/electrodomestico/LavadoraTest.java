package awakelab.electrodomestico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LavadoraTest {
    Lavadora lavadora;

    @BeforeEach
    void setUp() throws Exception {
        lavadora = new Lavadora();
    }

    @Test
    void testPrecioFinal() {
        int precioFinal = lavadora.precioFinal();
        assertEquals(120, precioFinal);
    }

    @Test
    void testGetCarga() {
        assertEquals(5, lavadora.getCarga());
    }

    @Test
    void testGetPrecio() {
        assertEquals(100, lavadora.getPrecio());
    }

    @Test
    void testSetPrecio() {
       int precio = 34;
       lavadora.setPrecio(precio);
       assertEquals(precio, lavadora.getPrecio());
    }

    @Test
    void testGetColor() {
        assertEquals("BLANCO", lavadora.getColor());
    }

    @Test
    void testSetColor() {
        String color = "ROJO";
        lavadora.setColor(color);
        assertEquals(color, lavadora.getColor());
    }

    @Test
    void testGetConsumoElectrico() {
        assertEquals('F', lavadora.getConsumoElectrico());
    }

    @Test
    void testSetConsumoElectrico() {
        char consumo = 'A';
        lavadora.setConsumoElectrico(consumo);
        assertEquals(consumo, lavadora.getConsumoElectrico());
    }

    @Test
    void testGetPeso() {
        assertEquals(5, lavadora.getPeso());
    }

    @Test
    void testSetPeso() {
        int peso = 20;
        lavadora.setPeso(peso);
        assertEquals(peso, lavadora.getPeso());
    }

}
