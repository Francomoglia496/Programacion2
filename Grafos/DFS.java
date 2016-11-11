package Programacion2.Grafos;

import java.util.Scanner;

/**
 * Created by francomoglia on 11/8/16.
 */
public class DFS {

    public static void main(String[] args) {

        Grafo g = new Grafo(); 

        Nodo node0 = new Nodo("A");
        Nodo node1 = new Nodo("B");
        Nodo node2 = new Nodo("C");
        Nodo node3 = new Nodo("D");

        g.agregarNodoGrafo(node0);
        g.agregarNodoGrafo(node1);
        g.agregarNodoGrafo(node2);
        g.agregarNodoGrafo(node3);

        g.definirVecinos(node0, node1);
        g.definirVecinos(node2, node3);

        g.agregarAristas(node0, node1, 5);

        System.out.println(g.obtenerCosto(node0,node3));





        /*Nodo node0 = new Nodo("A");
        Nodo node1 = new Nodo("B");
        Nodo node2 = new Nodo("C");
        Nodo node3 = new Nodo("D");
        Nodo node4 = new Nodo("E");
        Nodo node5 = new Nodo("F");
        Nodo node6 = new Nodo("G");
        Nodo node7 = new Nodo("H");

        g.agregarNodoGrafo(node0);
        g.agregarNodoGrafo(node1);
        g.agregarNodoGrafo(node2);
        g.agregarNodoGrafo(node3);
        g.agregarNodoGrafo(node4);
        g.agregarNodoGrafo(node5);
        g.agregarNodoGrafo(node6);
        g.agregarNodoGrafo(node7);

        g.definirVecinos(node0, node1);
        g.definirVecinos(node0, node2);
        g.definirVecinos(node0, node3);
        g.definirVecinos(node1, node4);
        g.definirVecinos(node1, node5);
        g.definirVecinos(node2, node4);
        g.definirVecinos(node2, node5);
        g.definirVecinos(node3, node5);
        g.definirVecinos(node4, node6);
        g.definirVecinos(node4, node7);
        g.definirVecinos(node5, node6);
        g.definirVecinos(node5, node7);

        int[][] matrizAdyacencia = new int[8][8];

        g.matrizAdyacencia(matrizAdyacencia, g);

        g.mostrarMatrizAdyacencia(matrizAdyacencia);*/


        /*Nodo node0 = new Nodo(1);
        Nodo node1 = new Nodo(2);
        Nodo node2 = new Nodo(3);
        Nodo node3 = new Nodo(4);
        Nodo node4 = new Nodo(5);

        g.agregarNodoGrafo(node0);
        g.agregarNodoGrafo(node1);
        g.agregarNodoGrafo(node2);
        g.agregarNodoGrafo(node3);
        g.agregarNodoGrafo(node4);

        g.definirVecinos(node0, node1);
        g.definirVecinos(node1, node2);
        g.definirVecinos(node3, node4);


        int[][] matrizAdyacencia = new int[g.getNodeList().size()][g.getNodeList().size()];

        g.matrizAdyacencia(matrizAdyacencia, g);
        g.mostrarMatrizAdyacencia(matrizAdyacencia);

        int[][] matriz = new int[g.getNodeList().size()][g.getNodeList().size()];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < g.getNodeList().size(); i++) {
            for (int j = 0; j < g.getNodeList().size(); j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        g.grafoDeMatriz(matriz);

        g.DFS(g.getNodeList().get(0));

        System.out.println(g.getNodeList().get(0).getVecinos());
        System.out.println(g.getNodeList().get(1).getVecinos());
        System.out.println(g.getNodeList().get(2).getVecinos());
        System.out.println(g.getNodeList().get(3).getVecinos());
        System.out.println(g.getNodeList().get(4).getVecinos());*/
    }

}
