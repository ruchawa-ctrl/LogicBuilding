package Assignments.A63;

import java.util.Scanner;

public class IdentityMatrixCheck {
    public static boolean ChkIdentity(int Arr[][], int iRow, int iCol) {
        if (iRow != iCol) {
            return false;
        }

        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                if (i == j) {
                    if (Arr[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (Arr[i][j] != 0) {
                        return false;
                    }
                }
            }
        }

        return true;
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

        boolean bRet = ChkIdentity(Arr, iRow, iCol);
        if (bRet) {
            System.out.println("Output : True");
        } else {
            System.out.println("Output : False");
        }

        sc.close();
    }
}