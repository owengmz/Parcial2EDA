/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2eda;

import java.util.ArrayList;

/**
 *
 * @author Maxi
 */
public class Sala {

    private String nombre;
    private int id_sala;
    private String piedra;
    private int contadorsala = 1;

    public Sala (String nombre) {
        this.nombre = nombre;
        this.id_sala = contadorsala;
        this.piedra = null;
        contadorsala ++;
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

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public int getId_sala () {
        return id_sala;
    }

    public void setId_sala (int id_sala) {
        this.id_sala = id_sala;
    }

    public String getPiedra () {
        return piedra;
    }

    public void setPiedra (String piedra) {
        this.piedra = piedra;
    }

    public int getContadorsala () {
        return contadorsala;
    }

    public void setContadorsala (int contadorsala) {
        this.contadorsala = contadorsala;
    }

    @Override
    public String toString () {
        return "Esta en la Sala " + nombre;
    }
}
