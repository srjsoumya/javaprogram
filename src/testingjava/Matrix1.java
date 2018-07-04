package testingjava;

import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] no = new int[3][3];
        int cnt = 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(" Give " + cnt++ + " input to the matrix :");
                no[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Input Matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(no[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Output Matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    System.out.print(0 + " ");
                } else
                    System.out.print(no[i][j] + " ");
            }
            System.out.println();
        }

    }
}
