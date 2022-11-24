/*
 * 
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int [][] num = new int [10][10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int filaMax = 0;
        int columnaMax = 0;
        int filaMin = 0;
        int columnaMin = 0;
        int sumaTotal = 0;
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    num[i][j] = (int)(Math.random()*(101)+200);
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
        for(int i = 0; i < 10; i++) {
          System.out.print("  Columna" + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("\nFila " + i);
            for (int j = 0; j < 10; j++) {
                System.out.printf("%9d ", num[i][j]);
            }
        }
        System.out.println("\nMáximo: " + maximo + " posicion: (Fila: " + filaMax + ", Columna: " + columnaMax + ")");
        System.out.println("Mínimo: " + minimo + " posicion: (Fila: " + filaMin + ", Columna: " + columnaMin + ")");
        System.out.println("Media: " + (sumaTotal / contador));
    }
}
