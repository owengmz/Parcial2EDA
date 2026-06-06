package parcial2eda;

/**
 *
 * @author Maxi, Alan, Heber
 */
public class Jugador {

    private String nombre;
    private int puntaje;
    private Sala salaActual;
    private Sala salaAnterior;

    public Jugador (String nombre, Sala salaActual) {
        this.nombre = nombre;
        this.puntaje = 0;
        this.salaActual = salaActual;
        this.salaAnterior = null;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje () {
        return puntaje;
    }

    public void setPuntaje (int puntaje) {
        this.puntaje = puntaje;
    }

    public Sala getSalaActual () {
        return salaActual;
    }

    public void setSalaActual (Sala salaActual) {
        this.salaActual = salaActual;
    }

    public Sala getSalaAnterior () {
        return salaAnterior;
    }

    public void setSalaAnterior (Sala salaAnterior) {
        this.salaAnterior = salaAnterior;
    }

    public void moverJugador (Sala destino) {
        //      guardamos donde estaba el jugador despues lo movemos al destino
        salaAnterior = salaActual;
        salaActual = destino;
    }

    public void retroceder () {
        if (salaAnterior != null) {
            salaActual = salaAnterior;
            salaAnterior = null;
        }
        else {
            System.out.println("No se puede retroceder");
        }
    }

    public void sumarPuntos (int puntos) {
        puntaje = puntos + puntaje;
    }
}
// LO QUE FALTA 
//MENU INTERACTIVO USAR SCANER 
//CREAR EL JUGADOR EN EL MAIN 
//LLAMAR METODOS DEL JUGADOR MOVERJUGADOR Y SUMAR PUNTOS
//OPCION DE RETROCEDER EN EL MENU CON SCANER 
