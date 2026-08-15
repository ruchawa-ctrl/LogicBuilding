package Assignments.A63;

import java.util.Scanner;

public class ReverseRowMatrix {
    public static void ReverseRow(int Arr[][], int iRow, int iCol) {
        for (int i = 0; i < iRow; i++) {
            int start = 0;
            int end = iCol - 1;
            while (start < end) {
                int temp = Arr[i][start];
                Arr[i][start] = Arr[i][end];
                Arr[i][end] = temp;
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
        ReverseRow(Arr, iRow, iCol);

        sc.close();
    }
}