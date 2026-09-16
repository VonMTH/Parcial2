import java.util.Scanner;
import java.util.Stack;
public class Metodos {

    public Stack<VersionArchivo> crearVersion(Stack<VersionArchivo> versiones, Scanner sc){
        boolean continuar=true;
        while(continuar){
            System.out.println("Crear versión: 1.para Si.");
            int opt = sc.nextInt();
            sc.nextLine();
            if(opt == 1){
                VersionArchivo v = new VersionArchivo();
                System.out.println("Ingrese el número de la versión");
                v.setNumeroVersion(sc.nextDouble());
                sc.nextLine();
                System.out.println("Ingrese el nombre del archivo: ");
                v.setNombreArchivo(sc.nextLine());
                System.out.println("Ingrese la fecha: ");
                v.setFecha(sc.nextLine());
                System.out.println("Ingrese una descripción: ");
                v.setDescripcion(sc.nextLine());
                versiones.push(v);
            }else{
                continuar=false;
            }
        }
        return versiones;
    }

    public Stack<VersionArchivo> eliminarVersion(Stack<VersionArchivo> versiones){
        if(!versiones.isEmpty()){
            VersionArchivo v = versiones.pop();
            System.out.println("Se eliminó el numero de versión" + v.getNumeroVersion());
        }
        return versiones;
    }

    public void versionActual (Stack<VersionArchivo> versiones){
        VersionArchivo v = versiones.peek();
        System.out.println("La versión actual es: " + v.getNumeroVersion());
        System.out.println("Nombre: " + v.getNombreArchivo());
        System.out.println("Fecha: " + v.getFecha());
        System.out.println("Descripción: " + v.getDescripcion());
    }

    public void mostrarVesiones (Stack<VersionArchivo> versiones){
        for (VersionArchivo v : versiones) {
            System.out.println("La versión actual es: " + v.getNumeroVersion());
            System.out.println("Nombre: " + v.getNombreArchivo());
            System.out.println("Fecha: " + v.getFecha());
            System.out.println("Descripción: " + v.getDescripcion());
            System.out.println("-------------------------------------------------");
        }
    }
}