
package principal;

/**
 *
 * @author jairo
 */
public class ClasePrincipal {
    
    public static void main(String arg[]){
        
        imprimirMensajes("Mi primer programa");
        
    }
    
    /**
     * @author Jairo Seoanes
     * @param msg - contiene la cadena de texto que se imprime en la consola
     */
    public static void imprimirMensajes(String msg){
        System.out.print("1."+msg+"--");
        System.out.println("2."+msg );
        System.out.printf("%d. %s%n", 3, msg);
    }
    
}
