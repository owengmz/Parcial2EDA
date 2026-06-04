//para entregar 
//
//pocisionar jugador 
//elegir donde y moverlo
//interactuar por consola y que haga eso mismo
//meter los acertijos
//
//grabarnos
//
//
////////
package parcial2eda;

/**
 *
 * @author Maxi
 */
public class Parcial2EDA {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        Grafo g1 = new Grafo();
        Sala s1 = new Sala("Entrada");
        Sala s2 = new Sala("calobozo");
        Sala s3 = new Sala("sotano");
        Sala s4 = new Sala("Salida");
        g1.agregarSalas(s1);
        g1.agregarSalas(s2);
        g1.agregarSalas(s3);
        g1.agregarSalas(s4);
        g1.inicializarGrafo();
//        g1.imprimirGrafo(g1.matrizGrafo);
        System.out.println("---------------");
        g1.agregarCamino(s1, s2);
        g1.agregarCamino(s1, s3);
        g1.agregarCamino(s3, s1);
        g1.agregarCamino(s1, s1);
        g1.agregarCamino(s3, s2);
        g1.agregarCamino(s2, s3);
        g1.agregarCamino(s2, s4);
//        g1.imprimirGrafo(g1.matrizGrafo);
    }
}
