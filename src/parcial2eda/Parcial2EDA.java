package parcial2eda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maxi, Alan, Heber
 */
public class Parcial2EDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos Salas
        Sala s1 = new Sala("Entrada");
        Sala s2 = new Sala("calobozo");
        Sala s3 = new Sala("sotano");
        Sala s4 = new Sala("Salida");
        // creamos el grafo y agregamos las salas
        Grafo g1 = new Grafo();
        g1.inicializarGrafo();
        g1.agregarSalas(s1);
        g1.agregarSalas(s2);
        g1.agregarSalas(s3);
        g1.agregarSalas(s4);
        // agregamos los caminos segun diagrama
        System.out.println("---------------");
        g1.agregarCamino(s1, s2);
        g1.agregarCamino(s1, s3);
        g1.agregarCamino(s3, s1);
        g1.agregarCamino(s1, s1);
        g1.agregarCamino(s3, s2);
        g1.agregarCamino(s2, s3);
        g1.agregarCamino(s2, s4);
        //  System.out.println("--- matriz del grafo ---");           TEST GRAFO 
        //   g1.imprimirGrafo(g1.matrizGrafo);


        ArrayList<Sala> salas = Sala.invocarSala();
        //scanner para String
        Scanner inicio = new Scanner(System.in);
        //scanner para int
        Scanner inicionumero = new Scanner(System.in);
        System.out.println("Bienvenidos a mi casa......");
        System.out.println("En este momento estan en la entrada bienvenido ");
        System.out.println("Quien eres tu?.....");
        String nombre = inicio.nextLine();
        //Sala salaactual = Sala.buscador(salas, "entrada");
        Jugador j1 = new Jugador(nombre, s1);
        System.out.println("Ahh esta bien.. bienvenido " + nombre + " para tu suerte la entrada esta cerrada, deberas encontrar la salida por otro lado ...");

        // Bucle de informacion mientras no este en la salida
        while (!j1.getSalaActual().getNombre().equalsIgnoreCase("Salida")) {

            System.out.println("\n========================================");
            System.out.println(j1.getSalaActual());
            System.out.println("Puntaje actual: " + j1.getPuntaje());

            // Mostramos los caminos disponibles
            g1.mostrarCaminos(g1, j1);
            ArrayList<Sala> puertas = g1.SalasConectadas(j1.getSalaActual());

            // Pedir selección de puerta
            System.out.println("Tenes estas puertas, estas direcciones, cual desear ir? ");
            int eleccion = inicionumero.nextInt();
            inicionumero.nextLine(); // Limpiar buffer

            //En caso que ponga una opcion distinta de 1 y 2 
            if (eleccion < 1 || eleccion > puertas.size()) {
                System.out.println("Oye te crees gracioso....  eligue bien..");
                continue;
            }

            Sala saladestino = puertas.get(eleccion-1 );
            System.out.println("Vaya... elegiste " + saladestino.getNombre());
            System.out.println("pero no dejare que entre tan facilmente... te tengo una pregunta...");

            Acertijo acertijoaleatorio = g1.sortearAcertijo();
            System.out.println(acertijoaleatorio.getPregunta());
            System.out.println("");
            System.out.println("");
            System.out.println("Nota: escribe 1 o 2 porfavor...");
            System.out.println("1: " + acertijoaleatorio.getRespuesta());
            System.out.println("2: " + acertijoaleatorio.getRespuestamal());

            int resp = inicionumero.nextInt();
            inicionumero.nextLine();
            if (resp == 1) {
                System.out.println("Hm... avanza... ");
                j1.sumarPuntos(acertijoaleatorio.getPuntaje());
                j1.moverJugador(saladestino);
                System.out.println("Vaya no saliste aun sigamos.. ");
            } else {
                System.out.println("Ahhhh... noo no es esa la respuesta ");

                if (j1.getSalaActual().getNombre().equalsIgnoreCase("entrada")) {
                    System.out.println("Para tu suerte no paso nada , quieres hacerlo de nuevo? ");

                } else {
                    System.out.println("Avanza...");
                    j1.retroceder();
                    System.out.println("PERO NO ES LA SALA QUE ELIJISTE JAJAJAJA Veamos como salimos ahora ");
                }
            }

        }
        System.out.println("NNOOOOOOOOOOOOOOOOOOOOOOOOOOOOO!!!!!! ");
        System.out.println("Como pudiste irte de aqui!!!!");
        System.out.println("Felicidades y espero no volver a verte...");
        
        System.out.println("==========================");
        System.out.println("Juego terminado!, felicidades!");
        System.out.println("=========================");
        System.out.println("Jugador: "+ j1.getNombre()+" Puntaje final: "+ j1.getPuntaje());
        inicio.close();
        inicionumero.close();
        

    }
}

//     LO QUE FALTA 
//MENU INTERACTIVO USAR SCANER -> LISTO
//CREAR EL JUGADOR EN EL MAIN -> LISTO 
//LLAMAR METODOS DEL JUGADOR MOVERJUGADOR Y SUMAR PUNTOS -> listo
//OPCION DE RETROCEDER EN EL MENU CON SCANER-> lito
// CREAR LA PIEDRA 
//hacer que haga cosas rotas creado sala camino



        //prueba piloto para ver si se mueve
        /* // Verificar salas conectadas desde entrada
        System.out.println("--- Puertas desde Entrada ---");
        ArrayList<Sala> puertas = g1.SalasConectadas(s1);
        for (int i = 0; i < puertas.size(); i ++) {
            System.out.println((i + 1) + ". " + puertas.get(i).
                getNombre());
        }
        // Sortear un acertijo y mostrarlo metodo de grafo sortearAcertijo
        // Obtenes las dos listas
        ArrayList<Acertijo> acertijos = Acertijo.invocarAcertijo();
        //ArrayList<String> respuestasErroneas = Acertijo.invocarResErroneas();
        // Sorteas un indice random
        int num = (int) (Math.random() * acertijos.size());
        // Agarramos el acertijo y mostramos la pregunta
        Acertijo acertijo = acertijos.get(num);
        System.out.println(acertijo.getPregunta());
        // Decides en que posicion va la correcta
        int posicionCorrecta = (int) (Math.random() * 2);
        if (posicionCorrecta == 0) {
            System.out.println("1 " + acertijo.getRespuesta());
        //    System.out.println("2 " + respuestasErroneas.get(num));
        }
        else {
       //     System.out.println("1 " + respuestasErroneas.get(num));
            System.out.println("2 " + acertijo.getRespuesta());
        }
        // El jugador elige
        Scanner scanner = new Scanner(System.in);
        int eleccion = scanner.nextInt();
        if ((eleccion == 1 && posicionCorrecta == 0) || (eleccion == 2
            && posicionCorrecta == 1)) {
            System.out.println("Correcto +" + acertijo.getPuntaje() + " pts");
            System.out.println("avanzas al siguiente nivel " + s2);
            // HACER QUE AVISE A QUE SALA AVANZAR SIN LLAMARLO DIRECTAMENTE EL SOUT DEVUELVE A SALA 2 CALABOZO 
            // PERO LA IDEA ES QUE DIGA LA SALA A LA QUE VA IR 
        }
        else {
            System.out.println("Incorrecto se quedan en la entrada");
        }*/
