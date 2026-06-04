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

import java.util.ArrayList;

/**
 *
 * @author Maxi
 */
public class Grafo {

    private Sala sala;
    private int arco;
    private ArrayList<Acertijo> acertijo;
    public Integer matrizGrafo[][];
    ArrayList<Sala> salas = new ArrayList<>();

    public Grafo () {
        matrizGrafo = new Integer[4][4];
    }

    public void inicializarGrafo () {
        for (int i = 0; i < matrizGrafo.length; i ++) {
            for (int j = 0; j < matrizGrafo.length; j ++) {
                matrizGrafo[i][j] = 0;
            }
        }
        System.out.println("Se a creado Grafo ");
    }

    public void agregarSalas (Sala sala) {
        salas.add(sala);
    }

    public void agregarCamino (Sala origen, Sala destino) {
        int indiceOrigen = salas.indexOf(origen);
        int indiceDestino = salas.indexOf(destino);
        matrizGrafo[indiceOrigen][indiceDestino] = 1;
    }

    public void imprimirGrafo (Integer[][] matriz) {
        for (int i = 0; i < matrizGrafo.length; i ++) {
            for (int j = 0; j < matrizGrafo.length; j ++) {
                System.out.print(matrizGrafo[i][j] + "\t");
            }
            System.out.println();
        }
    }

    @Override
    public String toString () {
        return "Grafo{" + "sala=" + sala + ", arco=" + arco + ", acertijo="
            + acertijo + ", matrizGrafo=" + matrizGrafo + '}';
    }
}
