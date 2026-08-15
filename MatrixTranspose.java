package Assignments.A63;

import java.util.Scanner;

public class MatrixTranspose {
    public static void Transpose(int Arr[][], int iRow, int iCol) {
        for (int j = 0; j < iCol; j++) {
            for (int i = 0; i < iRow; i++) {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iRow = sc.nextInt();
        int iCol = sc.nextInt();

        int Arr[][] = new int[iRow][iCol];
        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                Arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Output :");
        Transpose(Arr, iRow, iCol);

        sc.close();
    }
}
