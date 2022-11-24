/*
 * 
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int [][] num = new int [6][10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int filaMax = 0;
        int columnaMax = 0;
        int filaMin = 0;
        int columnaMin = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                num[i][j] = (int)(Math.random()*1001);
                if (num[i][j] > maximo){
                    maximo = num[i][j];
                    filaMax = i;
                    columnaMax = j;
                } else if (num[i][j] < minimo) {
                    minimo = num[i][j];
                    filaMin = i;
                    columnaMin = j;
                }
            }
        }
        System.out.print("       ");
        for(int i = 0; i < 10; i++) {
          System.out.print("  Columna" + i);
        }
        for (int i = 0; i < 6; i++) {
            System.out.print("\nFila " + i);
            for (int j = 0; j < 10; j++) {
                System.out.printf("%9d ", num[i][j]);
            }
        }
        System.out.println("\nMáximo: " + maximo + " posicion: (Fila: " + filaMax + ", Columna: " + columnaMax + ")");
        System.out.println("Mínimo: " + minimo + " posicion: (Fila: " + filaMin + ", Columna: " + columnaMin + ")");
    }
}
