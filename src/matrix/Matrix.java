package matrix;

import java.util.Scanner;

public class Matrix {
    static int[][] read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = sc.nextInt();
        System.out.println("Enter column: ");
        int col = sc.nextInt();

        int[][] mat = new int[row][col];
        System.out.println("Enter " + row * col + " elements");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Enter element: " + "(" + i + ", " + j + ")");
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return mat;
    }

    static void display(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}


