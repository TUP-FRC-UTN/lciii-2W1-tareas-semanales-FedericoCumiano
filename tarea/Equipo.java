package ejercicio_equipo;

public class Equipo {
    private String nombre;
    private int puntos;
    private int part_ganados;
    private int part_empatados;
    private int part_perdidos;
    private int goles_realizados;
    private int goles_recibidos;
    private int posicion;

    public Equipo(String nombre, int puntos, int part_ganados, int part_empatados, int part_perdidos, int goles_realizados, int goles_recibidos, int posicion) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.part_ganados = part_ganados;
        this.part_empatados = part_empatados;
        this.part_perdidos = part_perdidos;
        this.goles_realizados = goles_realizados;
        this.goles_recibidos = goles_recibidos;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPart_ganados() {
        return part_ganados;
    }

    public void setPart_ganados(int part_ganados) {
        this.part_ganados = part_ganados;
    }

    public int getPart_empatados() {
        return part_empatados;
    }

    public void setPart_empatados(int part_empatados) {
        this.part_empatados = part_empatados;
    }

    public int getPart_perdidos() {
        return part_perdidos;
    }

    public void setPart_perdidos(int part_perdidos) {
        this.part_perdidos = part_perdidos;
    }

    public int getGoles_realizados() {
        return goles_realizados;
    }

    public void setGoles_realizados(int goles_realizados) {
        this.goles_realizados = goles_realizados;
    }

    public int getGoles_recibidos() {
        return goles_recibidos;
    }

    public void setGoles_recibidos(int goles_recibidos) {
        this.goles_recibidos = goles_recibidos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", puntos=" + puntos + ", part_ganados=" + part_ganados + ", part_empatados=" + part_empatados + ", part_perdidos=" + part_perdidos + ", goles_realizados=" + goles_realizados + ", goles_recibidos=" + goles_recibidos + ", posicion=" + posicion + '}';
    }
}


