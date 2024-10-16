package casopractico;

public class PilaTarea {
    
    public class PilaDeTareas {
    private Tarea[] pilaAlta;
    private Tarea[] pilaMedia;
    private Tarea[] pilaBaja;
    private int topeAlta;
    private int topeMedia;
    private int topeBaja;
    private final int MAX = 10; // Tamaño máximo de cada pila

    public PilaDeTareas() {
        pilaAlta = new Tarea[MAX];
        pilaMedia = new Tarea[MAX];
        pilaBaja = new Tarea[MAX];
        topeAlta = -1;
        topeMedia = -1;
        topeBaja = -1;
    }

    // Agregar tarea en función de la prioridad
    public void agregar(Tarea tarea) {
        switch (tarea.getPrioridad()) {
            case "Alta":
                if (topeAlta < MAX - 1) {
                    pilaAlta[++topeAlta] = tarea;
                } else {
                    System.out.println("Pila de Alta prioridad llena.");
                }
                break;
            case "Media":
                if (topeMedia < MAX - 1) {
                    pilaMedia[++topeMedia] = tarea;
                } else {
                    System.out.println("Pila de Media prioridad llena.");
                }
                break;
            case "Baja":
                if (topeBaja < MAX - 1) {
                    pilaBaja[++topeBaja] = tarea;
                } else {
                    System.out.println("Pila de Baja prioridad llena.");
                }
                break;
        }
    }

    // Eliminar tarea (desapilar) según prioridad
    public Tarea eliminar() {
        if (topeAlta >= 0) {
            return pilaAlta[topeAlta--]; // Desapilar de alta prioridad
        } else if (topeMedia >= 0) {
            return pilaMedia[topeMedia--]; // Desapilar de media prioridad
        } else if (topeBaja >= 0) {
            return pilaBaja[topeBaja--]; // Desapilar de baja prioridad
        } else {
            System.out.println("Todas las pilas están vacías.");
            return null;
        }
    }

    // Mostrar todas las tareas
    public String mostrar() {
        StringBuilder lista = new StringBuilder("Tareas de Alta prioridad:\n");
        for (int i = topeAlta; i >= 0; i--) {
            lista.append(pilaAlta[i]).append("\n");
        }

        lista.append("Tareas de Media prioridad:\n");
        for (int i = topeMedia; i >= 0; i--) {
            lista.append(pilaMedia[i]).append("\n");
        }

        lista.append("Tareas de Baja prioridad:\n");
        for (int i = topeBaja; i >= 0; i--) {
            lista.append(pilaBaja[i]).append("\n");
        }

        return lista.toString();
    }
}
    
}
