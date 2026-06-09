package parcial2eda;

import java.util.ArrayList;

/**
 *
 * @author Maxi, Alan, Heber
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

    public Sala getSala () {
        return sala;
    }

    public void setSala (Sala sala) {
        this.sala = sala;
    }

    public int getArco () {
        return arco;
    }

    public void setArco (int arco) {
        this.arco = arco;
    }

    public ArrayList<Acertijo> getAcertijo () {
        return acertijo;
    }

    public void setAcertijo (ArrayList<Acertijo> acertijo) {
        this.acertijo = acertijo;
    }

    public Integer[][] getMatrizGrafo () {
        return matrizGrafo;
    }

    public void setMatrizGrafo (Integer[][] matrizGrafo) {
        this.matrizGrafo = matrizGrafo;
    }

    public ArrayList<Sala> getSalas () {
        return salas;
    }

    public void setSalas (ArrayList<Sala> salas) {
        this.salas = salas;
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

    // pedimos como parametro una matriz pero la matriz ya esta incorporado al grafo creo que no iria
    public void imprimirGrafo () {
        for (int i = 0; i < matrizGrafo.length; i ++) {
            for (int j = 0; j < matrizGrafo.length; j ++) {
                System.out.print(matrizGrafo[i][j] + "\t");
            }
            System.out.println();
        }
    }
//  agregamos metodo para sortear Acertijo 
// creamos un objeto acertijos invocamos el acertijo
    // elejimos un acertijo random con Math y recorremos el acertijo
    // retornamos el acertijo con su indice 

    public Acertijo sortearAcertijo () {
        ArrayList<Acertijo> acertijos = Acertijo.invocarAcertijo();
        int indice = (int) (Math.random() * acertijos.size());
        return acertijos.get(indice);
    }
    // creamos una lista vacia donde guardamos las salas a las que se pueda ir
    // si el jugador esta en la entrada el index of va devolver 0 por que va estar en la posicion 0 de mi array 
    // ese indice sera el valor de la fila que vamos a leer en la matriz
    // recorremos las 4 columnas de esa misma fila 
    // preguntamos si el indice (fila) y la columna j (que recorremos) es igual a 1 entonces se agregue a mi arraylist conectadas
    // por ultimo devolvemos la lista sala2 y sala 3 que es la puerta que esta habilitada en mi entrada

    public ArrayList<Sala> SalasConectadas (Sala salaActual) {
        ArrayList<Sala> conectadas = new ArrayList<>();
        int indice = salas.indexOf(salaActual);
        for (int j = 0; j < matrizGrafo.length; j ++) {
            if (matrizGrafo[indice][j] == 1) {
                conectadas.add(salas.get(j));
            }
        }
        return conectadas;
    }

    public static void mostrarCaminos (Grafo g1, Jugador j1) {
        ArrayList<Sala> opciones = g1.SalasConectadas(j1.getSalaActual());
        System.out.println("\n Elije: ");
        if (opciones.isEmpty()) {
            System.out.println(
                "No hay salidas desde esta sala.");
            return;
        }
        for (int i = 0; i < opciones.size(); i ++) {
            System.out.println((i + 1) + ". Ir a: " + opciones.get(i).
                getNombre());
        }
    }

    public void agradarGrafo () {
        int nuevotamanio = salas.size() + 1;
        Integer[][] nuevaMatriz = new Integer[nuevotamanio][nuevotamanio];
        for (int i = 0; i < nuevotamanio; i ++) {
            for (int j = 0; j < nuevotamanio; j ++) {
                //copio los arcos ya creados  
                if (i < matrizGrafo.length && j < matrizGrafo.length) {
                    nuevaMatriz[i][j] = matrizGrafo[i][j];
                }
                else {
                    nuevaMatriz[i][j] = 0;
                }
            }
        }
        this.matrizGrafo = nuevaMatriz;
    }

    public void salaEspecial (Sala nuevaSala) {
        agradarGrafo();
        agregarSalas(nuevaSala);
    }

    @Override
    public String toString () {
        return "Grafo{" + "sala=" + sala + ", arco=" + arco + ", acertijo="
            + acertijo + ", matrizGrafo=" + matrizGrafo + '}';
    }
}
