package Assignments.A62;

import java.util.Scanner;

public class ColumnAddition {
    public static void AddColumn(int Arr[][], int iRow, int iCol) {
        for (int j = 0; j < iCol; j++) {
            int iSum = 0;
            for (int i = 0; i < iRow; i++) {
                iSum += Arr[i][j];
            }
            System.out.print(iSum + " ");
        }
        System.out.println();
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

        System.out.print("Output : ");
        AddColumn(Arr, iRow, iCol);

        sc.close();
    }
}