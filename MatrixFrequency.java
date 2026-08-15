package Assignments.A62;

import java.util.Scanner;

public class MatrixFrequency {
    public static int CountFrequency(int Arr[][], int iRow, int iCol, int iNo) {
        int iCount = 0;

        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                if (Arr[i][j] == iNo) {
                    iCount++;
                }
            }
        }

        return iCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iNo = sc.nextInt();
        int iRow = sc.nextInt();
        int iCol = sc.nextInt();

        int Arr[][] = new int[iRow][iCol];
        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                Arr[i][j] = sc.nextInt();
            }
        }

        int iRet = CountFrequency(Arr, iRow, iCol, iNo);
        System.out.println("Output : " + iRet);

        sc.close();
    }
}