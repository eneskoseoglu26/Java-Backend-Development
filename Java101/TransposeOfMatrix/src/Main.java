import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrix, transpose;
        int row, column;
        Scanner input = new Scanner(System.in);

        System.out.print("Number of rows : ");
        row = input.nextInt();

        System.out.print("Number of columns : ");
        column = input.nextInt();

        matrix = new int[row][column];

        System.out.println("Enter the elements of Matrix");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }

        printMatrix(matrix);

        transpose = transposeOfMatrix(matrix);
        printMatrix(transpose);

    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("\nMatrix :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeOfMatrix(int matrix[][]) {
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

}
