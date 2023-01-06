package Entidades;

public class Tarea {
    private String nombre;
    private float tiempoEjecucion;
    public Tarea(String nombre, float tiempoEjecucion){
        this.nombre = nombre;
        this.tiempoEjecucion = tiempoEjecucion;
    }
    //<editor-fold collapse="" desc="Getters y Setters">
        public String getNombre() {
        return nombre;
    }

        public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        public float getTiempoEjecucion() {
        return tiempoEjecucion;
    }

        public void setTiempoEjecucion(float tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion;
    }
    //</editor-fold>
}
