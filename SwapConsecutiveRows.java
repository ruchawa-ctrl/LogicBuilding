package Assignments.A62;

import java.util.Scanner;

public class SwapConsecutiveRows {
    public static void SwapRows(int Arr[][], int iRow, int iCol) {
        for (int i = 0; i < iRow - 1; i += 2) {
            for (int j = 0; j < iCol; j++) {
                int temp = Arr[i][j];
                Arr[i][j] = Arr[i + 1][j];
                Arr[i + 1][j] = temp;
            }
        }

        // Display updated matrix
        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
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
        SwapRows(Arr, iRow, iCol);

        sc.close();
    }
}