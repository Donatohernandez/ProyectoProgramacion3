
package estructuraslineales;

/**
 *
 * @author manue
 */
public class EstructurasLineales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LES l1 = new LES();
        
        
        Nodo n2 = new Nodo(2);
        l1.addFirst(n2);
        l1.addFirst(new Nodo(0));
        l1.addFirst(new Nodo(6));
//        System.out.println("¿La lista está vacia?: " + l1.isEmpty());
//        System.out.println("El tamaño de la lista es: " + l1.size());
        

        l1.imprimirListaConsola();
        
    }
    
}
