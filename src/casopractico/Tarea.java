package casopractico;

public class Tarea {
    private String nombre;
    private String prioridad; // Alto, Media, Bajo

    public Tarea(String nombre, String prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return "Tarea: " + nombre + " [Prioridad: " + prioridad + "]";
    }
}


