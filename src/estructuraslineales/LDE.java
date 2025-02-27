
package estructuraslineales;

/**
 *
 * @author manue
 */
public class LDE {
    
    private NodoD inicial;
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
    
    
    
    
    
    
}
