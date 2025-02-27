
package estructuraslineales;

/**
 *
 * @author manue
 */
public class NodoD {
    
     private int valor;
     private NodoD siguiente;
     private NodoD anterior;

    public NodoD(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoD getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoD siguiente) {
        this.siguiente = siguiente;
    }

    public NodoD getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoD anterior) {
        this.anterior = anterior;
    }
     
     
    
}
