import java.util.Scanner;
import java.util.Stack;
public class Menu {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Stack<VersionArchivo> versiones = new Stack<>();
        Metodos m = new Metodos();
        boolean continuar = true;
        System.out.println("BIENVENIDO.");
        while (continuar) {
            System.out.println("Qué desea realizar:");
            System.out.println("1. Crear nueva versión.");
            System.out.println("2. Volver a la versión anterior.");
            System.out.println("3. Consultar versión actual. ");
            System.out.println("4. Mostrar todas las versiones disponibles.");
            System.out.println("5. Salir.");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    versiones=m.crearVersion(versiones, sc);
                    break;
                case 2:
                    versiones=m.eliminarVersion(versiones);
                    break;
                case 3:
                    m.versionActual(versiones);
                    break;
                case 4:
                    m.mostrarVesiones(versiones);
                    break;
                case 5:
                    System.out.println("Hasta luego.");
                    continuar=false;
                    break;
                default:
                    System.out.println("Opción invalida. ");
                    break;
            }
        }
    }
}