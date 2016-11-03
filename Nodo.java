package Programacion2.Arboles;

/**
 * Created by francomoglia on 11/1/16.
 */
public class Nodo {

    /* Declaraciones de variables */
    private int valor;

    private Nodo padre;
    private Nodo hojaIzquierda;
    private Nodo hojaDerecha;

    /* Constructor */
    public Nodo(int valor) {
        this.valor = valor;
    }

    /* Setters y Getters */
    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public Nodo getHojaIzquierda() {
        return hojaIzquierda;
    }

    public void setHojaIzquierda(Nodo hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }

    public Nodo getHojaDerecha() {
        return hojaDerecha;
    }

    public void setHojaDerecha(Nodo hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }

    @Override
    public String toString() {
        return "" + valor;
    }
}

