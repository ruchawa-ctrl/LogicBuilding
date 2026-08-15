package Assignments.A63;

import java.util.Scanner;

public class SparseMatrixCheck {
    public static boolean ChkSparse(int Arr[][], int iRow, int iCol) {
        int zeroCount = 0;
        int totalElements = iRow * iCol;

        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                if (Arr[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        return zeroCount > (totalElements / 2);
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

        boolean bRet = ChkSparse(Arr, iRow, iCol);
        if (bRet) {
            System.out.println("Output : True");
        } else {
            System.out.println("Output : False");
        }

        sc.close();
    }
}