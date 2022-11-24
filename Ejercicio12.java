/*
 * 
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        int [][] num = new int [9][9];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int filaMax = 0;
        int columnaMax = 0;
        int filaMin = 0;
        int columnaMin = 0;
        int sumaTotal = 0;
        int contador = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j == 8) {
                    num[i][j] = (int)(Math.random()*(401)+500);
                    if (num[i][j] > maximo){
                        sumaTotal += num[i][j];
                        contador++;
                        maximo = num[i][j];
                        filaMax = i;
                        columnaMax = j;
                    } else if (num[i][j] < minimo) {
                        sumaTotal += num[i][j];
                        contador++;
                        minimo = num[i][j];
                        filaMin = i;
                        columnaMin = j;
                    }  
                }
            }
        }
        System.out.print("       ");
        for(int i = 0; i < 9; i++) {
          System.out.print("  Columna" + i);
        }
        for (int i = 0; i < 9; i++) {
            System.out.print("\nFila " + i);
            for (int j = 0; j < 9; j++) {
                System.out.printf("%9d ", num[i][j]);
            }
        }
        System.out.println("\nMáximo: " + maximo + " posicion: (Fila: " + filaMax + ", Columna: " + columnaMax + ")");
        System.out.println("Mínimo: " + minimo + " posicion: (Fila: " + filaMin + ", Columna: " + columnaMin + ")");
        System.out.println("Media: " + (sumaTotal / contador));
    }
}
