/*
 * 
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables
        int [][] num = new int [4][5];
        int fila;
        int columna;
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaTotal = 0;
        // Input
        for (fila = 0; fila < 4; fila++) {
            for (columna = 0; columna < 5; columna++) {
                System.out.print("Fila " + fila + ", columna " + columna + ": ");
                num[fila][columna] = sc.nextInt();
            }
        }
        System.out.println();
        // Suma las filas
        for (fila = 0; fila < 4; fila++) {
            sumaFila = 0;
            for (columna = 0; columna < 5; columna++) {
                System.out.printf("%7d   ", num[fila][columna]);
                sumaFila += num[fila][columna];
            }
            System.out.printf("|%7d\n", sumaFila);
        }

        // Suma las columnas
        for(columna = 0; columna < 5; columna++) {
            System.out.print("----------");
        }
        System.out.println("-----------");

        for (columna = 0; columna < 5; columna++) {
            sumaColumna = 0;
            for (fila = 0; fila < 4; fila++) {
                sumaColumna += num[fila][columna];
            }
            sumaTotal += sumaColumna;
            System.out.printf("%7d   ", sumaColumna);
        }
        System.out.println("|  SUMA TOTAL = " + sumaTotal);
        sc.close();
    }
}
