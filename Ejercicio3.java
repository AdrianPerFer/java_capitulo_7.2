/*
 * 
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
public class Ejercicio3 {
    public static void main(String[] args) {
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
                int random = (int)(Math.random()*(1000-100)+100);
                num[fila][columna] = random;
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
    }
}
