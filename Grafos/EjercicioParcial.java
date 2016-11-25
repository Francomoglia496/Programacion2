package Programacion2.Grafos.backtracking;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by francomoglia on 11/25/16.
 */
public class EjercicioParcial {

    public static void main(String[] args) {

        String[][] matriz = new String[3][3];

        matriz[0][0] = "I";
        matriz[0][1] = ".";
        matriz[0][2] = ".";

        matriz[1][0] = ".";
        matriz[1][1] = "#";
        matriz[1][2] = ".";

        matriz[2][0] = ".";
        matriz[2][1] = ".";
        matriz[2][2] = "S";


        backtracking(matriz, 0, 0);


    }
    public static void backtracking(String[][] matriz, int posX, int posY){

        Set<String> visitados = new HashSet<String>();


        if (matriz[posX][posY].equals("S")){
            System.out.println("Salida encontrada en posicion: [" + posX + "][" + posY + "]");
            System.exit(0);
        }else {

            //Si no se encuentra la salida se comienza la busqueda
            //PRIMERO VAMOS POR LA DERECHA
            if ((posY + 1 < matriz.length) && !matriz[posX][posY + 1].equals("#") && !visitados.contains(matriz[posX][posY + 1])){
                System.out.print("Derecha, ");
                visitados.add(matriz[posX][posY]);
                backtracking(matriz, posX, posY + 1); // Me muevo a la derecha
            }
            if ((posX + 1 < matriz.length) && !matriz[posX + 1][posY].equals("#") && !visitados.contains(matriz[posX + 1][posY])){
                System.out.print("Abajo, ");
                visitados.add(matriz[posX][posY]);
                backtracking(matriz, posX + 1, posY); // Me muevo hacia abajo
            }
            if ((posY - 1 < matriz.length) && !matriz[posX][posY - 1].equals("#") && !visitados.contains(matriz[posX][posY - 1])){
                System.out.print("Izquierda, ");
                visitados.add(matriz[posX][posY]);
                backtracking(matriz, posX, posY - 1); // Me muevo hacia la izquierda
            }
            if ((posY + 1 < matriz.length) && !matriz[posX - 1][posY].equals("#") && !visitados.contains(matriz[posX - 1][posY])){
                System.out.println("Arriba, ");
                visitados.add(matriz[posX][posY]);
                backtracking(matriz, posX - 1, posY); // Me muevo hacia arriba
            }



        }




    }
}
