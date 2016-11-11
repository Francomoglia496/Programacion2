package Programacion2.Arboles;

import java.util.Scanner;

/**
 * Created by francomoglia on 11/1/16.
 */
public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Arbol a = new Arbol(new Nodo(sc.nextInt()));

        for (int i = 0; i < 5; i++) {
            a.addNodo(new Nodo(sc.nextInt()));
        }

        a.BFSArbol(a.getRaiz());
    }
}
