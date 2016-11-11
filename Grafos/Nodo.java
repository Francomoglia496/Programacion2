package Programacion2.Grafos;

import java.awt.*;
import java.util.LinkedList;

/**
 * Created by francomoglia on 11/10/16.
 */
public class Nodo {

    //  ATRIBUTOS DE MIS NODOS 
    private int value;
    private String valueChar;
    private LinkedList<Nodo> vecinos = new LinkedList<Nodo>();
    private Arista costos;

    public Nodo (int value){
        this.value = value;
    }

    public Nodo (String valueChar){
        this.valueChar = valueChar;
    }

    public Arista getCostos() {
        return costos;
    }

    public void setCostos(Arista costos) {
        this.costos = costos;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getValueChar() {
        return valueChar;
    }

    public void setValueChar(String valueChar) {
        this.valueChar = valueChar;
    }

    public LinkedList<Nodo> getVecinos() {
        return vecinos;
    }

    public void setVecinos(LinkedList<Nodo> vecinos) {
        this.vecinos = vecinos;
    }

    @Override
    public String toString() {

        if (this.valueChar == null){
            return "Nodo{" + "value= " + value + "}";
        }else {
            return "Nodo{" +
                    "valueChar='" + valueChar + '\'' +
                    '}';
        }
    }
}
