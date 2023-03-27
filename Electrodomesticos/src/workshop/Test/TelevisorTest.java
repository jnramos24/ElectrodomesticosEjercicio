package workshop.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import workshop.Entidades.Televisor;

class TelevisorTest {
    Televisor televisor;

    @BeforeEach
    void setUp() throws Exception {
        televisor = new Televisor();
    }

    @Test
    void testPrecioFinal() {
        Televisor[] televisores = new Televisor[3];

        televisores[0] = new Televisor();
        televisores[1] = new Televisor(190, 80);
        televisores[2] = new Televisor(180, 20, "NEGRO", 'C', 33, true);

        int precioFinal = televisores[0].precioFinal();
        assertEquals(120, precioFinal);

        precioFinal = televisores[1].precioFinal();
        assertEquals(300, precioFinal);

        precioFinal = televisores[2].precioFinal();
        assertEquals(340, precioFinal);
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
