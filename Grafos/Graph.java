package Programacion2.Grafos;

import java.util.*;

/**
 * Created by francomoglia on 11/8/16.
 */
public class Graph<T> {

    //      ATRIBUTO DEL GRAFO
    private ArrayList<Node<T>> nodeList;



    /*
        AGREGA LOS NODOS AL GRAFO COMO PARTE DE UN ArrayList CON LA FUNCION add
    */
    public void addNodeToGraph(Node<T> n) {
        nodeList.add(n);
    }



    /*  ESTE METODO RECIBE DOS NODOS, EL NODO DE PARTIDA, Y EL DE DESTINO (FROM, TO)
        LO QUE HACE ESTE METODO ES ---->
        DEL nodeList (ATRIBUTO DE GRAPH) LLAMA AL METODO GET, Y LO QUE PIDE OBTENER ES
        DE nodeList QUE ES UN ArrayList, PIDE EL INDICE DEL NODO "FROM", ENTONCES LO QUE
        EN REALIDAD OBTIENE ES A TRAVES DEL INDICE EL NODO QUE SE PASO COMO PRIMER
        PARAMETRO, UNA VEZ OBTENIDO ESE NODO "FROM", DE ESE NODO SE LLAMA AL METODO
        getAdjList() PARA OBTENER TODOS SUS NODOS VECINOS, Y DE AHI SE LLAMA AL METODO add
        PARA AGREGAR EL NODO "TO" A LA LISTA DE VECINOS DE ESE NODO "FROM"
    */
    public void addEdge(Node<T> fromNode, Node<T> toNode) {
        nodeList.get(nodeList.indexOf(fromNode)).getAdjList().add(toNode);
    }


    /*  RECIBE EL NODO DESDE EL CUAL VA A COMENZAR
        CREA EL SET, PARA MARCAR LUEGO LOS VISITADOS
        MUESTRA EL VALOR DE ESE PRIMER NODO Y LUEGO
        LLAMA AL METODO DFSUtil
    */
    public void DFS(Node<T> start) {
        Set<Node<T>> visitedSet = new HashSet<Node<T>>();
        System.out.println("Starting DFS from -> " + start.toString());
        DFSUtil(start, visitedSet);
    }


    /*  RECIBE UN NODO INICIAL Y UN SET, MUESTRA EL PRIMER NODO QUE RECIBE EL METODO
        Y LO AGREGA A LA TABLA DEL SET PARA INDICAR QUE YA FUE VISITADO
        LUEGO, RECORRE TODOS LOS NODOS QUE FORMEN PARTE DE LA ARRAYLIST DE ADJUNTOS
         O "VECINOS" DE ESE NODO, SI ESTOS NODOS NO LOS HE RECORRIDO LOS AGREGO AL SET
        PARA MARCARLOS COMO VISITADOS
    */
    public void DFSUtil(Node<T> vertex, Set<Node<T>> visitedSet) {
        System.out.println("Visited: " + vertex.toString());
        visitedSet.add(vertex);
        for (Node<T> n : vertex.getAdjList()) {
            if (!visitedSet.contains(n)) {
                //SI EL NODO NO ESTA DENTRO DEL SET, LLAMA A LA RECURSION
                //PARA QUE SE AGREGUE
                DFSUtil(n, visitedSet);
            }
        }
    }

    public void BFS(Node<T> start) {

        //CREA LA TABLA DEL SET PARA LOS VISITADOS
        Set<Node<T>> visitedSet = new HashSet<Node<T>>();

        //CREA UNA COLA PARA AGREGAR NODOS
        Queue<Node<T>> nodeQueue = new LinkedList<Node<T>>();


        /*  LLAMA AL METODO ADD, DE LA INTERFACE QUEUE
            EL CUAL RECIBE COMO PARAMETRO EL NODO START, ES DECIR,
            EL NODO DESDE EL CUAL SE COMIENZA LA COLA
        */
        nodeQueue.add(start);


        //BUCLE ---> SI LA COLA ESTA VACIA, NO SE HACE NADA
        while(!nodeQueue.isEmpty()) {

            /*  AGREGA EL NODO AL SET DE VISITADOS
                EL METODO PEEK LO QUE HACE ES RECUPERAR EL VALOR DEL NODO SIN BORRARLO
                PARA DE ESE MODO AGREGARLO AL SET
            */
            visitedSet.add(nodeQueue.peek());

            /*  CREA UNA LinkedList DE NODOS DE ALGUN TIPO (GENERIC) Y A ESA
                LinkedList LO QUE LE AGREGA ES...
                LLAMA A LA FUNCION Peek DE LA LISTA DE NODOS, Y DE ESE NODO QUE
                SACA LLAMA AL GETTER DE SU AdjList LA CUAL ES, OTRA LinkedList DE NODOS
            */
            LinkedList<Node<T>> adjListOfNode = nodeQueue.peek().getAdjList();



            //MUESTRA EL NODO VISITADO Y LUEGO LO ELIMINA DE LA COLA
            System.out.println("Visited: " + nodeQueue.poll());


            /*
                RECORRE TODA LA LinkedList DEL NODO, SI ALGUN NODO NO ESTA
                EN LA LISTA DE VISITADOS Y NO ESTA EN LA COLA, SE LO AGREGA A LA COLA
            */
            for (Node<T> n : adjListOfNode) {
                if (!visitedSet.contains(n) && !nodeQueue.contains(n)) {
                    nodeQueue.add(n);
                }
            }
        }



    }

}
