package bo.edu.uagrm.soe;

public class Item {
    public String nombre;
    public int venderEn;
    public int calidad;

    public Item(String nombre, int venderEn, int calidad) {
        this.setNombre(nombre);
        this.setVenderEn(venderEn);
        this.setCalidad(calidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVenderEn() {
        return venderEn;
    }

    public void setVenderEn(int venderEn) {
        this.venderEn = venderEn;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nombre='" + nombre + '\'' +
                ", venderEn=" + venderEn +
                ", calidad=" + calidad +
                '}';
    }
}
