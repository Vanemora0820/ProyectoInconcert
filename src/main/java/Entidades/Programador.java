package Entidades;

public class Programador {
    private String identificacion;
    private String nombre;
    private Proyecto proyecto;

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Programador(String identificacion, String nombre, Proyecto proyecto){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.proyecto = proyecto;
    }

}
