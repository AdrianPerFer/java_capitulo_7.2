/*
 * Realiza un programa que calcule la estatura media, mínima y máxima en
 * centímetros de personas de diferentes países. El array que contiene los
 * nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
 * “Australia”}. Los datos sobre las estaturas se deben simular mediante un
 * array de 4 filas por 10 columnas con números aleatorios generados al azar entre
 * 140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
 * los países se deben mostrar utilizando el array de países (no se pueden escribir
 * directamente).
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        String [] pais = {"España", "Rusia", "Japón", "Australia"};
        int [][] numero = new int [4][10];
        int fila;
        int columna;
        System.out.printf("%55sMED MIN MAX\n", "");
        for (fila = 0; fila < 4; fila++) {
            System.out.printf("%-10s: " , pais[fila]);
            int minimo = Integer.MAX_VALUE;
            int maximo = Integer.MIN_VALUE;
            int sumaTotal = 0;
            int media;
            int contador = 0;
            for (columna = 0; columna < 10; columna++) {
                numero[fila][columna] = (int)(Math.random()*(210 - 140) + 140);
                System.out.print(numero[fila][columna] + " ");
                if (numero[fila][columna] > maximo){
                    maximo = numero[fila][columna];
                } else if (numero[fila][columna] < minimo) {
                    minimo = numero[fila][columna];
                }  
                sumaTotal += numero[fila][columna];
                contador++;
            }
            System.out.print(" | ");
            media = sumaTotal / contador;
            System.out.println(media + " " + minimo + " " + maximo);
        }
    }
}

