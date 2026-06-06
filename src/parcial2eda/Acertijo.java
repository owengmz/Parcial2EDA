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
    private String respuestamal;
//    private boolean condicion; no la estamos usando 

    public Acertijo (int puntaje, String pregunta, String respuestacorrecta, String respuestaincorrecta) {
        this.puntaje = puntaje;
        this.pregunta = pregunta;
        this.respuesta = respuestacorrecta;
        this.respuestamal = respuestaincorrecta;
    }

    public String getRespuestamal () {
        return respuestamal;
    }

    public void setRespuestamal (String respuestamal) {
        this.respuestamal = respuestamal;
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
            "Cuanto más grande es, menos se ve. Que es?", "oscuridad",
            "silencio");
        Acertijo a2 = new Acertijo(15,
            "Vuelo sin alas, lloro sin ojos. Que soy?", "nube", "viento");
        Acertijo a3 = new Acertijo(20,
            "Tengo agujeros, pero igual puedo retener liquido. Que soy?",
            "esponja", "colador");
        Acertijo a4 = new Acertijo(25,
            "Siempre estoy en el pasado, pero me creas en el presente y nunca me vas a poder cambiar en el futuro. Que soy?",
            "recuerdo", "sueno");
        Acertijo a5 = new Acertijo(30,
            "Te pertenezco por completo, pero la gente que conoces lo usa mas que vos. Que soy?",
            "nombre", "telefono");
        Acertijo a6 = new Acertijo(35,
            "Cuanto mas lavo, mas sucio soy. Que soy?", "esponja", "agua");
        Acertijo a7 = new Acertijo(40,
            "Si me nombras, ya no existo, me rompo. Que soy?", "silencio",
            "secreto");
        Acertijo a8 = new Acertijo(45,
            "Tengo llaves pero no abro puertas, tengo notas pero no escribo ninguan carta. Que soy?",
            "piano", "candado");
        Acertijo a9 = new Acertijo(50,
            "Corro todo el dia pero no tengo piernas, y tengo boca pero no hablo. Que soy?",
            "rio", "viento");
        Acertijo a10 = new Acertijo(55,
            "Si me tenes, me queres compartir. Si me compartis, ya no me tenes. Que soy?",
            "secreto", "chiste");
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
}
