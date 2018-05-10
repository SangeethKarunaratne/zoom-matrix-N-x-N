import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class zoomMatrix{

    static int[][] newMatrix;

    public static void main(String[] args) {

        int inputMatrixLength = 3;//change this according to the size of input N - N matrix

        int outputMatrixLength =inputMatrixLength*2;

        Scanner sc = new Scanner(System.in);

        int input=0;
        do{

            int[][] matrix = new int[inputMatrixLength][inputMatrixLength];//create new matrix N * N / 2d int array

            int N = matrix.length;
            File inputfile = new File("zoom.txt");//input obtained from 2d array in file

            try {
                Scanner scanner = new Scanner(inputfile);


                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {

                        matrix[i][j] = scanner.nextInt();//add values to array from file

                    }
                }
                scanner.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(zoomMatrix.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("Enter - 1 Zoom / 0 Exit ");
            System.out.println();

            input = sc.nextInt();

            if(input ==0){

                System.exit(0);

            }

            newMatrix = new int[outputMatrixLength][outputMatrixLength];// dimension of the output 2d array ( 2 x input array )
          
            int column = 0;
            int row = 0;
            for (int i = 0; i < matrix.length; i++) {

                for (int j = 0; j < matrix.length; j++) {

                    for (int x = 0; x < 2; x++) {

                        column = 0;

                        for (int y = 0; y < inputMatrixLength; y++) {

                            newMatrix[row][column] = matrix[i][j + y];
                            column++;
                            newMatrix[row][column] = matrix[i][j + y];
                            column++;

                        }

                        row++;
                    }

                    break;
                }
            }

            //writing the newly created array to file
            File file = new File("zoom.txt");

            try {
                PrintWriter pw = new PrintWriter(file);

                for (int i = 0; i < newMatrix.length; i++) {// 0 1
                    
                    for (int j = 0; j < newMatrix.length; j++) {// 0 1

                        pw.print(newMatrix[i][j] + " ");

                    }
                    pw.println();
                }
                
                pw.close();
            } catch (Exception e) {

                e.printStackTrace();
            }

            print(newMatrix);
            System.out.println();

            inputMatrixLength = inputMatrixLength*2;
            outputMatrixLength =outputMatrixLength*2;

        }while(input !=0);
        
    }


    public static void print(int[][] a) {
        int M = a.length;
        int N = a[0].length;
        System.out.println();
        System.out.println(M + " " + N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%9d ", a[i][j]);
            }
            System.out.println();
        }
    }

}
