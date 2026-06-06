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
    public static void main (String[] args) {
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
        System.out.println("--- matriz del grafo ---");
        g1.imprimirGrafo(g1.matrizGrafo);
        // Verificar salas conectadas desde entrada
        System.out.println("--- Puertas desde Entrada ---");
        ArrayList<Sala> puertas = g1.SalasConectadas(s1);
        for (int i = 0; i < puertas.size(); i ++) {
            System.out.println((i + 1) + ". " + puertas.get(i).
                getNombre());
        }
        // Sortear un acertijo y mostrarlo metodo de grafo sortearAcertijo
        // Obtenes las dos listas
        ArrayList<Acertijo> acertijos = Acertijo.invocarAcertijo();
        ArrayList<String> respuestasErroneas = Acertijo.invocarResErroneas();
        // Sorteas un indice random
        int num = (int) (Math.random() * acertijos.size());
        // Agarramos el acertijo y mostramos la pregunta
        Acertijo acertijo = acertijos.get(num);
        System.out.println(acertijo.getPregunta());
        // Decides en que posicion va la correcta
        int posicionCorrecta = (int) (Math.random() * 2);
        if (posicionCorrecta == 0) {
            System.out.println("1 " + acertijo.getRespuesta());
            System.out.println("2 " + respuestasErroneas.get(num));
        }
        else {
            System.out.println("1 " + respuestasErroneas.get(num));
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
            System.out.println("Incorrecto");
        }
    }
//     LO QUE FALTA 
//MENU INTERACTIVO USAR SCANER 
//CREAR EL JUGADOR EN EL MAIN 
//LLAMAR METODOS DEL JUGADOR MOVERJUGADOR Y SUMAR PUNTOS
//OPCION DE RETROCEDER EN EL MENU CON SCANER 
}
// -------------OPCION DE SCANER----------------
//        Scanner scan = new Scanner(System.in);
//        Jugueteria tienda = new Jugueteria();
//        int cantidadStock = 0;
//        String respuesta;
//        while (cantidadStock < 6) {
//            try {
//                System.out.println(
//                    "TIPO De juguete: opcion 1 (Peluche) opcion 2 (Monopatin): ");
//                int tipo = scan.nextInt();
//                scan.nextLine();
//                if (tipo != 1 && tipo != 2) {
//                    throw new Exception("tipo invalido debe ser 1 o 2.");
//                }
//                if (tipo == 1) {
//                    System.out.println("Ingrese tamaño de Peluche");
//                    String tamaño = scan.nextLine();
//                    System.out.println("ingrese precio del Peluche");
//                    double precio = scan.nextDouble();
//                    scan.nextLine();
//                    System.out.println("ingrese cantidad de peluche");
//                    int stock = scan.nextInt();
//                    scan.nextLine();
//                    System.out.println("ingrese nombre del Peluche");
//                    String nombre = scan.nextLine();
//                    Peluche p1 = new Peluche(tamaño, nombre, precio, stock);
//                    tienda.agregarJuguete(p1);
//                    cantidadStock ++;
//                }
//                else if (tipo == 2) {
//                    System.out.println("ingrese motor del monopatin");
//                    boolean motorizado;
//                    motorizado = scan.nextBoolean();
//                    scan.nextLine();
//                    System.out.println("Ingrese nombre de monopatin");
//                    String nombre = scan.nextLine();
//                    System.out.println("ingrese precio del monopatin");
//                    double precio = scan.nextDouble();
//                    scan.nextLine();
//                    System.out.println("ingrese cantidad de monopatin");
//                    int stock = scan.nextInt();
//                    scan.nextLine();
//                    Monopatin m1 = new Monopatin(true, nombre, precio, stock);
//                    tienda.agregarJuguete(m1);
//                    cantidadStock ++;
//                }
//                System.out.println("quieres agregar otro juguete? SI/NO:");
//                respuesta = scan.nextLine();
//                if (respuesta.equalsIgnoreCase("si") || respuesta.
//                    equalsIgnoreCase(
//                        "s")) {
//                }
//                else if (respuesta.equalsIgnoreCase("no") || respuesta.
//                    equalsIgnoreCase("n")) {
//                    break;
//                }
//            }
//            catch (InputMismatchException error) {
//                System.out.println("Erro de Datos");
//                scan.nextLine();
//            }
//            catch (Exception e) {
//                System.out.println("ocurrio un error " + e.getMessage());
//            } finally {
//                System.out.println("en bloque final\n");
//            }
//        }
//        System.out.println("compra total: ");
//        tienda.compraTotal();
//        System.out.println("inventario total");
//        tienda.mostrarInventario();
//    }
