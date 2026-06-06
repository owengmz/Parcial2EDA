package parcial2eda;

import java.util.ArrayList;

/**
 *
 * @author Maxi, Alan, Heber
 */
public class Sala {

    private String nombre;
    private String piedra;

    public Sala (String nombre) {
        this.nombre = nombre;
        this.piedra = null;
    }

    public static ArrayList<Sala> invocarSala () {
        ArrayList<Sala> salascreadas = new ArrayList<>();
        Sala s1 = new Sala("Entrada");
        Sala s2 = new Sala("calobozo");
        Sala s3 = new Sala("sotano");
        Sala s4 = new Sala("Salida");
        salascreadas.add(s1);
        salascreadas.add(s2);
        salascreadas.add(s3);
        salascreadas.add(s4);
        return salascreadas;
    }
    
    public static Sala buscador(ArrayList<Sala> salas, String sala){
        for (Sala s : salas) {

        if (s.getNombre().equalsIgnoreCase(sala)) {
            return s; // ¡Encontrada! Devolvemos la sala inmediatamente y el método termina
        }
    }
        System.out.println("Error sala no encontrada (mal escrita)");
        return null;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }





    public String getPiedra () {
        return piedra;
    }

    public void setPiedra (String piedra) {
        this.piedra = piedra;
    }


    @Override
    public String toString () {
        return "Esta en la Sala " + nombre;
    }
}
// LO QUE FALTA 
//MENU INTERACTIVO USAR SCANER 
//CREAR EL JUGADOR EN EL MAIN 
//LLAMAR METODOS DEL JUGADOR MOVERJUGADOR Y SUMAR PUNTOS
//OPCION DE RETROCEDER EN EL MENU CON SCANER 

