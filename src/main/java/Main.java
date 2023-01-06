import Entidades.Programador;
import Entidades.Proyecto;
import Entidades.Tarea;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        proceso();
    }
    private static void proceso(){
        Programador programador = crearProgramador();
        float promedioTiempoEjecucionByProyecto = getpromedioTiempoEjecucionByProyecto(programador.getProyecto());
        System.out.println("Identificacion del Programador: "+programador.getIdentificacion());
        System.out.println("Nombre del Programador: "+programador.getNombre());
        System.out.println("Proyecto: "+programador.getProyecto().getNombre());
        System.out.println("Tareas: ");
        final int[] i = {1};
        Arrays.stream(programador.getProyecto().getTareas()).forEach(tarea->{
            System.out.println(i[0] +" - "+ tarea.getNombre()+ " Tiempo de ejecucion: "+tarea.getTiempoEjecucion());
            i[0]++;
        });
        System.out.println("El promedio en Horas del proyecto "+programador.getProyecto().getNombre()+ "Es de :"+promedioTiempoEjecucionByProyecto);
    }
    private static Programador crearProgramador(){
        Scanner sc = new Scanner(System.in);
        String identificacion,nombre, nombreProyecto;
        int cantidadTareas;
        System.out.print("Ingrese su identificacion:");
        identificacion = sc.nextLine();
        System.out.print("Ingrese su nombre:");
        nombre = sc.nextLine();
        //Programador programador = new Programador(identificacion,nombre);
        System.out.print("Ingrese el nombre del proyecto:");
        nombreProyecto = sc.nextLine();
        System.out.print("Ingrese cantidad de tareas: ");
        cantidadTareas = sc.nextInt();
        Tarea tareas[] = new Tarea[cantidadTareas];
        insertarTareas(tareas);
        /*
        for (final Tarea tarea : tareas) {
            System.out.println(tarea.getNombre() + " " + tarea.getTiempoEjecucion());
        }*/
        return new Programador(identificacion,nombre, new Proyecto(nombreProyecto,tareas));

    }
    private static void insertarTareas(Tarea[] tareas){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < tareas.length; i++){
            String nombreTarea;
            float tiempoEjecucion;
            System.out.print("Ingrese el nombre de la tarea "+ (i+1) +":");
            nombreTarea = sc.nextLine();
            System.out.print("Ingrese el tiempo de ejecucion:");
            tiempoEjecucion = sc.nextFloat();
            sc.nextLine();
            tareas[i] = new Tarea(nombreTarea,tiempoEjecucion);
        }

    }
    private static float getpromedioTiempoEjecucionByProyecto(Proyecto proyecto){
        float suma = 0f;
        for(Tarea tarea : proyecto.getTareas()){
            suma += tarea.getTiempoEjecucion();
        }
        return suma / proyecto.getTareas().length;
    }
}
