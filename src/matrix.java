import java.util.Random;
    public class matrix {
        public static void main(String[] args) {
            System.out.println("----------MATRIX OPERATIONS----------");
            Random rnd = new Random();
            int[][] array = new int[4][4];
            System.out.println("  First Matrix:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(" [ ");
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = rnd.nextInt(30)+1;
                    System.out.print(" " + array[i][j] + " ");
                }
                System.out.print(" ] ");
                System.out.println();
            }
            System.out.println("-------------------------");
            System.out.println("Transpose of First Matrix:");
            int[][] transpose = new int[4][4];
            for (int i = 0; i < array.length; i++) {
                System.out.print(" [ ");
                for (int j = 0; j < array.length; j++) {
                    transpose[i][j] = array[j][i];
                    System.out.print(" "+ transpose[i][j] + " ");
                }
                System.out.print("]");
                System.out.println();
            }
            System.out.println("-------------------------");
            Random rnd2 = new Random();
            int[][] array2 = new int[4][4];
            System.out.println("  Second Matrix:");
            for (int i = 0; i < array2.length; i++) {
                System.out.print(" [ ");
                for (int j = 0; j < array2.length; j++) {
                    array2[i][j] = rnd2.nextInt(30)+1;
                    System.out.print(" " + array2[i][j] + " ");
                }
                System.out.print(" ] ");
                System.out.println();
            }
            System.out.println("--------------------------");
            System.out.println("Transpose of Second Matrix:");
            int[][] transpose2 = new int[4][4];
            for (int i = 0; i < array2.length; i++) {
                System.out.print(" [ ");
                for (int j = 0; j < array2.length; j++) {
                    transpose2[i][j] = array2[j][i];
                    System.out.print(" "+ transpose2[i][j] + " ");
                }
                System.out.print(" ] ");
                System.out.println();

            }
            System.out.println("------------------------");

            System.out.println("  Summation:");
            int[][] sum = new int[4][4];
            for(int i=0;i<array.length;i++){
                System.out.print(" [ ");
                for(int j=0; j<array.length;j++){
                    sum[i][j] = array[i][j]+array2[i][j];
                    System.out.print(" " + sum[i][j] + " ");
                }
                System.out.print(" ] ");
                System.out.println();
            }
            System.out.println("----------------------");

            System.out.println("  Subtraction:");
            int[][] subt = new int[4][4];
            for(int i=0;i<array.length;i++){
                System.out.print(" [ ");
                for(int j=0;j<array.length;j++){
                    subt[i][j] = array[i][j]-array2[i][j];
                    System.out.print(" " + subt[i][j] + " ");
                }
                System.out.print(" ] ");
                System.out.println();
            }
            System.out.println("-------------------------");

            System.out.println("  Multiplication:");
            int[][] multp = new int[4][4];
            for(int i=0;i<array.length;i++){
                System.out.print(" [ ");
                for(int j=0;j<array.length;j++){
                    multp[i][j]=0;
                    for(int k=0;k<array.length;k++){
                        multp[i][j]+=array[i][k]*array2[k][j];
                    }
                    System.out.print(" " + multp[i][j] + " ");
                }
                System.out.print(" ] ");
                System.out.println();
            }
            System.out.println("--------------------------");

        }
    }

