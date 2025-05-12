package bo.edu.uagrm.soe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class LarosadoradaNuevoItemPrueba {

    @Test
    public void pruebaDecrementoConjuradoCalidad() {
        Larosadorada.items = new ArrayList<>();
        int entradaCalidad = 20;
        Item item = new Item("Pastel de maná conjurado", 15, entradaCalidad);

        Larosadorada.items.add(item);
        Larosadorada.actualizarCalidad();

        int esperadaCalidad = entradaCalidad - 2;

        assertEquals(esperadaCalidad, item.getCalidad());
    }

    @Test
    public void pruebaConjuradoNoCeroCalidad() {
        Larosadorada.items = new ArrayList<>();
        int entradaCalidad = 0;
        Item item = new Item("Pastel de maná conjurado", 15, entradaCalidad);

        Larosadorada.items.add(item);
        Larosadorada.actualizarCalidad();

        int esperadaCalidad = 0;

        assertEquals(esperadaCalidad, item.getCalidad());
    }

    @Test
    public void pruebaAlternativaConjuradaNoCeroCalidad() {
        Larosadorada.items = new ArrayList<>();
        int entradaCalidad = 1;
        Item item = new Item("Pastel de maná conjurado", 15, entradaCalidad);

        Larosadorada.items.add(item);
        Larosadorada.actualizarCalidad();

        int esperadaCalidad = 0;

        assertEquals(esperadaCalidad, item.getCalidad());
    }

    @Test
    public void PruebaCalidadConjuradaAlvenderCero() {
        Larosadorada.items = new ArrayList<>();
        int entradaCalidad = 10;
        Item item = new Item("Pastel de maná conjurado", 0, entradaCalidad);

        Larosadorada.items.add(item);
        Larosadorada.actualizarCalidad();

        int esperadaCalidad = entradaCalidad - 4;

        assertEquals(esperadaCalidad, item.getCalidad());
    }

    @Test
    public void PruebaCalidadConjuradaAlternativoAlvenderCero() {
        Larosadorada.items = new ArrayList<>();
        int entradaCalidad = 3;
        Item item = new Item("Pastel de maná conjurado", 0, entradaCalidad);

        Larosadorada.items.add(item);
        Larosadorada.actualizarCalidad();

        int esperadaCalidad = 0;

        assertEquals(esperadaCalidad, item.getCalidad());
    }
}