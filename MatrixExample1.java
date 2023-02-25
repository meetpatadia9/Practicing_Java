/*
 !              PRINTING RxC [DYNAMIC] ARRAY/MATRIC
*/

import java.util.Scanner;

public class MatrixExample1 {
    
    public static void printRxCmatrix(int row, int column) {

        int num = 1;
        int mtrix[][] = new int[row][column];
        
        //writing values
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                mtrix[i][j] = num;
                num++;
            }
        }
        System.out.println();

        //printing matrix
        System.out.println(row + "x" + column + " Matrix:");
        for (int i = 0; i < mtrix.length; i++) {         //row
            for(int j=0; j < mtrix[0].length; j++) {     //col
                System.out.print(mtrix[i][j] + " ");
            }
            System.out.println();   //new line
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter number of Rows: ");
        Scanner scan1 = new Scanner(System.in);
        int row = scan1.nextInt();        

        System.out.print("Enter number of Columns: ");
        Scanner scan2 = new Scanner(System.in);
        int column = scan2.nextInt();    
        
        printRxCmatrix(row, column);

        scan1.close();
        scan2.close();
    }
}
