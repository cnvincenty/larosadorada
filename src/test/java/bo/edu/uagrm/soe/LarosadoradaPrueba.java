package bo.edu.uagrm.soe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class LarosadoradaPrueba {
    @Test
    public void testNormalItemDecrementCalidad() {
        // Contexto
        Larosadorada.items = new ArrayList<>();
        int entradaCalidad = 20;
        Item item = new Item("Chaleco de destreza +5", 10, entradaCalidad);

        Larosadorada.items.add(item);
        Larosadorada.actualizarCalidad();

        int esperadaCalidad = entradaCalidad - 1;

        assertEquals(esperadaCalidad, item.getCalidad());
    }

    @Test
    public void testNormalItemDoubleDecrementCalidad() {
        // Contexto
        Larosadorada.items = new ArrayList<>();
        int entradaCalidad = 20;
        Item item = new Item("Chaleco de destreza +5", 0, entradaCalidad);

        Larosadorada.items.add(item);
        Larosadorada.actualizarCalidad();

        int esperadaCalidad = entradaCalidad - 2;

        assertEquals(esperadaCalidad, item.getCalidad());
    }

    @Test
    public void testNormalItemZeroCalidad() {
        // Contexto
        Larosadorada.items = new ArrayList<>();
        int entradaCalidad = 0;
        Item item = new Item("Chaleco de destreza +5", 0, entradaCalidad);

        Larosadorada.items.add(item);
        Larosadorada.actualizarCalidad();

        int esperadaCalidad = 0;

        assertEquals(esperadaCalidad, item.getCalidad());
    }

    @Test
    public void testItemSufurasLegendary() {
        // Contexto
        Larosadorada.items = new ArrayList<>();
        int entradaCalidad = 80;
        Item item = new Item("Sulfuras, Hand of Ragnaros", 15, entradaCalidad);

        Larosadorada.items.add(item);
        Larosadorada.actualizarCalidad();

        int esperadaCalidad = 80;

        assertEquals(esperadaCalidad, item.getCalidad());
    }

    @Test
    public void testItemNoMayor50() {
        // Contexto
        Larosadorada.items = new ArrayList<>();
        int entradaCalidad = 50;
        Item item = new Item("Aged Brie", 20, entradaCalidad);

        Larosadorada.items.add(item);
        Larosadorada.actualizarCalidad();

        int esperadaCalidad = 50;

        assertEquals(esperadaCalidad, item.getCalidad());
    }

    @Test
    public void testbackstageIncrementsCalidad() {
        // Contexto
        Larosadorada.items = new ArrayList<>();
        int entradaCalidad = 20;
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, entradaCalidad);

        Larosadorada.items.add(item);
        Larosadorada.actualizarCalidad();

        int esperadaCalidad = entradaCalidad + 1;

        assertEquals(esperadaCalidad, item.getCalidad());
    }

    @Test
    public void testbackstageDoubleIncrementCalidad() {
        // Contexto
        Larosadorada.items = new ArrayList<>();
        int entradaCalidad = 20;
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, entradaCalidad);

        Larosadorada.items.add(item);
        Larosadorada.actualizarCalidad();

        int esperadaCalidad = entradaCalidad + 2;

        assertEquals(esperadaCalidad, item.getCalidad());
    }

    @Test
    public void testBackstageTripleIncrementCalidad() {
        // Contexto
        Larosadorada.items = new ArrayList<>();
        int entradaCalidad = 20;
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, entradaCalidad);

        Larosadorada.items.add(item);
        Larosadorada.actualizarCalidad();

        int esperadaCalidad = entradaCalidad + 3;

        assertEquals(esperadaCalidad, item.getCalidad());
    }

    @Test
    public void testBackstageZeroCalidad() {
        // Contexto
        Larosadorada.items = new ArrayList<>();
        int entradaCalidad = 20;
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, entradaCalidad);

        Larosadorada.items.add(item);
        Larosadorada.actualizarCalidad();

        int esperadaCalidad = 0;

        assertEquals(esperadaCalidad, item.getCalidad());
    }
}
