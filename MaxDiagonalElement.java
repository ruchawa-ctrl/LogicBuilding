package Assignments.A62;

import java.util.Scanner;

public class MaxDiagonalElement {
    public static int MaxDiagonal(int Arr[][], int iRow, int iCol) {
        int iMax = Integer.MIN_VALUE;

        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                // Primary diagonal (i == j) or Secondary diagonal (i + j == iCol - 1)
                if (i == j || i + j == iCol - 1) {
                    if (Arr[i][j] > iMax) {
                        iMax = Arr[i][j];
                    }
                }
            }
        }

        return iMax;
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

        int iRet = MaxDiagonal(Arr, iRow, iCol);
        System.out.println("Output : " + iRet);

        sc.close();
    }
}