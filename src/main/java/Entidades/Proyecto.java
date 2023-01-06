package Entidades;

public class Proyecto {
    private String nombre;
    private Tarea[] tareas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarea[] getTareas() {
        return tareas;
    }

    public void setTareas(Tarea[] tareas) {
        this.tareas = tareas;
    }

    public Proyecto(String nombre, Tarea[]tareas){
        this.nombre = nombre;
        this.tareas = tareas;
    }
}
