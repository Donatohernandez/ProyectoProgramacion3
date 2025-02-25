
package estructuraslineales;

/**
 *
 * @author manue
 */
public class LES {
    
    private Nodo inicial;
    private int tam;
    
    /**
     * este metodo verifica si la lista está (true) vacía o no (false)
     * @return  true si "inicial# es nulo, false en caso de que haya al menos un 
     * nodo en "inicial"
     */
    public boolean isEmpty(){
        if (inicial == null) {
            return true;
        }
        return false;
    }
    
    public int size(){
        return tam;
    }
    
    /**
     * Añade elementos al principio de la lista 
     * @return 
     */
    public boolean addFirst(Nodo nN){
        if (this.isEmpty()) {
            inicial = nN;
            tam ++;
            return true;
        }else if (size() > 0){
            nN.setSiguiente(inicial);
            inicial = nN;
            tam ++;
            return true;
        }
        return false;
    }
    
    public void imprimirListaConsola(){
        Nodo nActual = inicial;
        while (nActual != null) {
            System.out.print(nActual.getValor() + "--> ");           
                nActual = nActual.getSiguiente();
        }
    }
    
    public boolean removeLast(){
        if (size() == 1) {
            inicial = null;
            tam = 0;
            return true;
        } else if (size() > 1) {
            Nodo nAux = inicial;
            while (nAux.getSiguiente().getSiguiente() != null) {
                nAux = nAux.getSiguiente();
            }
            nAux.setSiguiente(null);
            tam --;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean removeFirst(){
        if (size() == 1) {
            inicial = null;
            tam = 0;
            return true;
        } else if (size() > 1) {
            inicial = inicial.getSiguiente();
            tam --;
            return true;
        } else {
            return false;
        }
    }
    
    
    
    
    
    
}
