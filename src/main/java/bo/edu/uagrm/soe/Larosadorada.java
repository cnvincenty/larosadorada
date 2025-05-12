package bo.edu.uagrm.soe;

import java.util.ArrayList;
import java.util.List;

public class Larosadorada {

    public static List<Item> items = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("La Rosa Dorada");

        items.add(new Item("Chaleco de destreza +5", 10, 20));
        items.add(new Item("Brie envejecido", 2, 0));
        items.add(new Item("Elixir de la mangosta", 5, 7));
        items.add(new Item("Sulfuras, Mano de Ragnaros", 0, 80));
        items.add(new Item("Pases de backstage para un concierto de TAFKAL80ETC", 15, 20));
        items.add(new Item("Pastel de maná conjurado", 3, 6));

        actualizarCalidad();

        System.out.println(items);
    }

    public static void actualizarCalidad() {
        for (int i = 0; i < items.size(); i++) {
            if ((!"Brie envejecido".equals(items.get(i).getNombre()))
                    && !"Pases de backstage para un concierto de TAFKAL80ETC".equals(items.get(i).getNombre())) {
                if (items.get(i).getCalidad() > 0) {
                    if (!"Sulfuras, Mano de Ragnaros".equals(items.get(i).getNombre())) {
                        items.get(i).setCalidad(items.get(i).getCalidad() - 1);
                    }
                }
            } else {
                if (items.get(i).getCalidad() < 50) {
                    items.get(i).setCalidad(items.get(i).getCalidad() + 1);

                    if ("Pases de backstage para un concierto de TAFKAL80ETC".equals(items.get(i).getNombre())) {
                        if (items.get(i).getVenderEn() < 11) {
                            if (items.get(i).getCalidad() < 50) {
                                items.get(i).setCalidad(items.get(i).getCalidad() + 1);
                            }
                        }

                        if (items.get(i).getVenderEn() < 6) {
                            if (items.get(i).getCalidad() < 50) {
                                items.get(i).setCalidad(items.get(i).getCalidad() + 1);
                            }
                        }
                    }
                }
            }

            if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getNombre())) {
                items.get(i).setVenderEn(items.get(i).getVenderEn() - 1);
            }

            if (items.get(i).getVenderEn() < 0) {
                if (!"Brie envejecido".equals(items.get(i).getNombre())) {
                    if (!"Pases de backstage para un concierto de TAFKAL80ETC".equals(items.get(i).getNombre())) {
                        if (items.get(i).getCalidad() > 0) {
                            if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getNombre())) {
                                items.get(i).setCalidad(items.get(i).getCalidad() - 1);
                            }
                        }
                    } else {
                        items.get(i).setCalidad(items.get(i).getCalidad() - items.get(i).getCalidad());
                    }
                } else {
                    if (items.get(i).getCalidad() < 50) {
                        items.get(i).setCalidad(items.get(i).getCalidad() + 1);
                    }
                }
            }

            if (items.get(i).getNombre().equals("Pastel de maná conjurado")) {
                if (items.get(i).getCalidad() > 0) {
                    items.get(i).setCalidad(items.get(i).getCalidad() - 1);
                    if (items.get(i).getVenderEn() < 0) {
                        items.get(i).setCalidad(items.get(i).getCalidad() - 1);
                    }
                }
            }
        }
    }
}
