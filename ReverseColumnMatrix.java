package Assignments.A63;

import java.util.Scanner;

public class ReverseColumnMatrix {
    public static void ReverseCol(int Arr[][], int iRow, int iCol) {
        for (int j = 0; j < iCol; j++) {
            int start = 0;
            int end = iRow - 1;
            while (start < end) {
                int temp = Arr[start][j];
                Arr[start][j] = Arr[end][j];
                Arr[end][j] = temp;
                start++;
                end--;
            }
        }

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
        ReverseCol(Arr, iRow, iCol);

        sc.close();
    }
}