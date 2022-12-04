
/**
 *
 * @author EMERSON
 */
public class Nodo {

    private int vertice;
    private int pesoA;
    private Nodo siguiente;

    public Nodo(int v, int a) {
        this.vertice = v;
        this.pesoA = a;
        this.siguiente = null;
    }

    public int getVertice() {
        return vertice;
    }

    public void setVertice(int vertice) {
        this.vertice = vertice;
    }

    public int getPesoA() {
        return pesoA;
    }

    public void setPesoA(int pesoA) {
        this.pesoA = pesoA;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
