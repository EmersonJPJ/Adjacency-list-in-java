
import java.util.Scanner;

/**
 *
 * @author EMERSON
 */
public class Principal {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = 0;
        Grafo g = new Grafo(20);
        do {
            menu();
            System.out.println("Ingrese la opcion deseada: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    agregarArista(g);
                    break;
                case 2:
                    eliminarArista(g);
                    break;
                case 3:
                    mostrarG(g);
                    break;
                case 4:
                    getLisAd(g);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error! Opcion invalida");
            }
        } while (op != 5);

    }

    public static void menu() {
        System.out.println("1.Agregar arista");
        System.out.println("2.Eliminar arista");
        System.out.println("3.Mostrar grafo");
        System.out.println("4.Mostrar vertices.");
        System.out.println("5.Salir");

    }

    public static void agregarArista(Grafo g) {
        System.out.println("Ingrese el valor del v1 y v2: ");
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        System.out.println("Ingrese el peso de la arista: ");
        int peso = sc.nextInt();
        g.insertarArista(v1, v2, peso);
    }

    public static void eliminarArista(Grafo g) {
        System.out.println("Ingrese el valor del v1 y v2: ");
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        if (g.existeArista(v1, v2)) {
            g.eliminarArista(v1, v2);
        } else {
            System.out.println("Arista no existe, no se puede eliminar");
        }
    }

    public static void mostrarG(Grafo g) {
        g.mostrarGrafo();
    }

    public static void getLisAd(Grafo g) {
        System.out.println("Ingrese el valor del vertice: ");
        int v = sc.nextInt();
        if (g.listaAdyVacia(v)) {
            System.out.println("Lista vacia...");
        } else {
            Nodo aux = g.getPrimerAd(v);
            System.out.println("Lista: ");
            while (aux != null) {
                System.out.println(" " + aux.getVertice());
                aux = g.sigAdy(aux);

            }
            System.out.println();
        }
    }
}
