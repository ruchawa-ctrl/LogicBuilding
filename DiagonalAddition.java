package Assignments.A62;

import java.util.Scanner;

public class DiagonalAddition {
    public static int AddDiagonal(int Arr[][], int iRow, int iCol) {
        int iSum = 0;
        int minDimension = Math.min(iRow, iCol);

        for (int i = 0; i < minDimension; i++) {
            iSum += Arr[i][i];
        }

        return iSum;
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

        int iRet = AddDiagonal(Arr, iRow, iCol);
        System.out.println("Output : " + iRet);

        sc.close();
    }
}