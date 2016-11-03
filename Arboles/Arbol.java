package Programacion2.Arboles;

/**
 * Created by francomoglia on 11/1/16.
 */
public class Arbol {

    /* Atributos */
    private Nodo raiz;

    /* Contructores */
    public Arbol( int valor ) {
        this.raiz = new Nodo(valor);
    }

    public Arbol( Nodo raiz ) {
        this.raiz = raiz;
    }

    /* Setters y Getters */
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }


    private void addNodo( Nodo nodo, Nodo raiz ) {
        /* 2.- Partiendo de la raíz preguntamos: Nodo == null ( o no existe ) ? */
        if ( raiz == null ) {
            /*
             * 3.- En caso afirmativo X pasa a ocupar el lugar del nodo y ya
             * hemos ingresado nuestro primer dato.
             * ==== EDITO =====
             * Muchas gracias a @Espectro por la corrección de esta línea
             */
            this.setRaiz(nodo);
        }
        else {
            /* 4.- En caso negativo preguntamos: X < Nodo */
            if ( nodo.getValor() <= raiz.getValor() ) {
                /*
                 * 5.- En caso de ser menor pasamos al Nodo de la IZQUIERDA del
                 * que acabamos de preguntar y repetimos desde el paso 2
                 * partiendo del Nodo al que acabamos de visitar
                 */
                if (raiz.getHojaIzquierda() == null) {
                    raiz.setHojaIzquierda(nodo);
                }
                else {
                    addNodo( nodo , raiz.getHojaIzquierda() );
                }
            }
            else {
                /*
                 * 6.- En caso de ser mayor pasamos al Nodo de la DERECHA y tal
                 * cual hicimos con el caso anterior repetimos desde el paso 2
                 * partiendo de este nuevo Nodo.
                 */
                if (raiz.getHojaDerecha() == null) {
                    raiz.setHojaDerecha(nodo);
                }
                else {
                    addNodo( nodo, raiz.getHojaDerecha() );
                }
            }
        }
    }

    //HAY DOS METODOS addNodo PORQUE COMO UNO ES PRIVADO, EL OTRO ACTUA COMO UN SETTER
    public void addNodo( Nodo nodo ) {
        this.addNodo( nodo , this.raiz );
    }


    /******************************************************************************
    * LA PALABRA CLAVE "SYNCHRONIZED" SE UTILIZA PARA ESPECIFICAR QUE EL METODO   *
    * SOLO PUEDE SER UTILIZADO POR UN HILO (THREAD) A LA VEZ.                     *
     * ****************************************************************************
    * */

    //RECORRIDOS
    public synchronized void recorridoPreorden()
    {
        ayudantePreorden(raiz);
    }


    //METODO RECURSIVO PARA RECORRIDO PRE-ORDEN
    //    **********************************
    //    *   EMPEZAR RECORRIDO PRE-ORDEN  *
    //    **********************************
    private void ayudantePreorden(Nodo nodo)
    {
        if (nodo == null)
            return;

        System.out.print(nodo.getValor() + " "); // MOSTRAR VALOR DEL NODO
        ayudantePreorden(nodo.getHojaIzquierda()); //RECORRE HOJA IZQUIERDA
        ayudantePreorden(nodo.getHojaDerecha()); //RECORRE HOJA DERECHA
    }
    //    *********************************
    //    *   EMPEZAR RECORRIDO IN-ORDEN  *
    //    *********************************
    public synchronized void recorridoInorden()
    {
        ayudanteInorden(this.getRaiz());
    }

    // METODO RECURSIVO PARA EL RECORRIDO IN-ORDEN

    private void ayudanteInorden(Nodo nodo)
    {
        if (nodo == null)
            return;

        ayudanteInorden(nodo.getHojaIzquierda());
        System.out.print(nodo.getValor() + " ");
        ayudanteInorden(nodo.getHojaDerecha());
    }

    //    **********************************
    //    *   EMPEZAR RECORRIDO POS-ORDEN  *
    //    **********************************
    public synchronized void recorridoPosorden()
    {
        ayudantePosorden(this.getRaiz());
    }

    //METODO RECURSIVO PARA RECORRIDO POS-ORDEN

    private void ayudantePosorden(Nodo nodo)
    {
        if (nodo == null)
            return;

        ayudantePosorden(nodo.getHojaIzquierda());
        ayudantePosorden(nodo.getHojaDerecha());
        System.out.print(nodo.getValor() + " ");
    }
}

