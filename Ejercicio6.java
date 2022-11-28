/*
 * 
 * Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int [][] num = new int [6][10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int filaMax = 0;
        int columnaMax = 0;
        int filaMin = 0;
        int columnaMin = 0;
        boolean esRepetido;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                do{
                    num[i][j] = (int)(Math.random()*1001);
                    esRepetido = false;
                    for (int j2 = 0; j2 < (i * 10) + j; j2++) {
                        if (num[i][j] == num[j2/10][j2%10]){
                            esRepetido = true;
                            break;
                        }
                    }
                    if (num[i][j] > maximo){
                        maximo = num[i][j];
                        filaMax = i;
                        columnaMax = j;
                    } else if (num[i][j] < minimo) {
                        minimo = num[i][j];
                        filaMin = i;
                        columnaMin = j;
                    }
                } while(esRepetido);
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
