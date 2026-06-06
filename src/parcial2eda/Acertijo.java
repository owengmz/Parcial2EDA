package parcial2eda;

import java.util.ArrayList;

/**
 *
 * @author Maxi, Alan, Heber
 */
public class Acertijo {

    private int puntaje;
    private String pregunta;
    private String respuesta;
//    private boolean condicion; no la estamos usando 

    public Acertijo (int puntaje, String pregunta, String respuesta) {
        this.puntaje = puntaje;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public int getPuntaje () {
        return puntaje;
    }

    public void setPuntaje (int puntaje) {
        this.puntaje = puntaje;
    }

    public String getPregunta () {
        return pregunta;
    }

    public void setPregunta (String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta () {
        return respuesta;
    }

    public void setRespuesta (String respuesta) {
        this.respuesta = respuesta;
    }

    public static ArrayList<Acertijo> invocarAcertijo () {
        ArrayList<Acertijo> misAcertijos = new ArrayList<>();
        Acertijo a1 = new Acertijo(10,
            "Cuanto más grande es, menos se ve. ¿Qué es?", "oscuridad");
        Acertijo a2 = new Acertijo(15,
            "Vuelo sin alas, lloro sin ojos. ¿Qué soy?", "nube");
        Acertijo a3 = new Acertijo(20,
            "Tengo agujeros, pero igual puedo retener liquido ¿Qué soy?",
            "esponja");
        Acertijo a4 = new Acertijo(25,
            "Siempre estoy en el pasado, pero me creas en el presente y nunca me vas a poder cambiar en el futuro. ¿Qué soy?",
            "recuerdo");
        Acertijo a5 = new Acertijo(30,
            "Te pertenezco por completo, pero la gente que conoces lo usa mas que vos. ¿Qué soy?",
            "nombre");
        Acertijo a6 = new Acertijo(35,
            "Cuanto mas lavo, mas sucio soy. ¿Qué soy?", "esponja");
        Acertijo a7 = new Acertijo(40,
            "Si me nombras, ya no existo, me rompo. ¿Qué soy?", "silencio");
        Acertijo a8 = new Acertijo(45,
            "Tengo llaves pero no abro puertas, tengo notas pero no escribo ninguan carta. ¿Qué soy?",
            "piano");
        Acertijo a9 = new Acertijo(50,
            "Corro todo el dia pero no tengo piernas, y tengo boca pero no hablo. ¿Qué soy?",
            "rio");
        Acertijo a10 = new Acertijo(55,
            "Si me tenes, me queres compartir. Si me compartis, ya no me tenes. ¿Qué soy?",
            "secreto");
        misAcertijos.add(a1);
        misAcertijos.add(a2);
        misAcertijos.add(a3);
        misAcertijos.add(a4);
        misAcertijos.add(a5);
        misAcertijos.add(a6);
        misAcertijos.add(a7);
        misAcertijos.add(a8);
        misAcertijos.add(a9);
        misAcertijos.add(a10);
        return misAcertijos;
    }

    public static ArrayList<String> invocarResErroneas () {
        ArrayList<String> misrespuestasmalas = new ArrayList<>();
        String r1 = "silencio";
        String r2 = "viento";
        String r3 = "colador";
        String r4 = "sueno";
        String r5 = "telefono";
        String r6 = "agua";
        String r7 = "secreto";
        String r8 = "candado";
        String r9 = "viento";
        String r10 = "chiste";
        misrespuestasmalas.add(r1);
        misrespuestasmalas.add(r2);
        misrespuestasmalas.add(r3);
        misrespuestasmalas.add(r4);
        misrespuestasmalas.add(r5);
        misrespuestasmalas.add(r6);
        misrespuestasmalas.add(r7);
        misrespuestasmalas.add(r8);
        misrespuestasmalas.add(r9);
        misrespuestasmalas.add(r10);
        return misrespuestasmalas;
    }
}
// LO QUE FALTA 
//MENU INTERACTIVO USAR SCANER 
//CREAR EL JUGADOR EN EL MAIN 
//LLAMAR METODOS DEL JUGADOR MOVERJUGADOR Y SUMAR PUNTOS
//OPCION DE RETROCEDER EN EL MENU CON SCANER 
