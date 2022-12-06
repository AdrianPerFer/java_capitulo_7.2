public class Ejercicio9 {
    public static void main(String args[]) {
        int [][] array = new int [5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int)(Math.random()*(20-1+1)+1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int [][] arrayAux = new int [5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
               arrayAux[array.length - 1 - j][i] = array[i][j];
            }
        }
        ////////////////////////
        ////////////////////////
        for (int i = 0; i < arrayAux.length; i++) {
            for (int j = 0; j < arrayAux.length; j++) {
                System.out.printf("%3d", arrayAux[i][j]);
            }
            System.out.println();
        }
    }
}