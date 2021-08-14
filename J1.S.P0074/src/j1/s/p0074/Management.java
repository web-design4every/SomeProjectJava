/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0074;

/**
 *
 * @author Admin
 */
public class Management implements InterfaceMatrix{
    Validate v = new Validate();
    private int[][] inputMatrix(int n) {
        System.out.print("Enter Row Matrix "+n+": ");
        int row = v.checkInt();
        System.out.print("Enter Colum Matrix "+n+": ");
        int col = v.checkInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Matrix" + n + "[" + (i + 1) + "]" + "[" + (j + 1) + "]:");
                matrix[i][j] = v.checkInt();;
            }
        }
        return matrix;
    }
   
    @Override
    public int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        System.out.println("\n----- Result -----");
        displayMatrix(matrix1);
        System.out.println("+");
        displayMatrix(matrix2);
        System.out.println("=");
        int row = matrix1.length;
        int col = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int[][] c = new int[row][col];
        if (col != col2 || row != row2) {
            System.out.println("Can't addition");
        }else{
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                c[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print("[" + c[i][j] + "]");
            }
            System.out.println();
        }
        }
        return c;
    }

    @Override
    public int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        System.out.println("\n----- Result -----");
        displayMatrix(matrix1);
        System.out.println("-");
        displayMatrix(matrix2);
        System.out.println("=");
        int row = matrix1.length;
        int col = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int[][] c = new int[row][col];
        if (col != col2 || row != row2) {
            System.out.println("Can't subtraction");
        }else{
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                c[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print("[" + c[i][j] + "]");
            }
            System.out.println();
        }
        }
        return c;
    }

    @Override
    public int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        displayMatrix(matrix1);
        System.out.println("*");
        displayMatrix(matrix2);
        System.out.println("=");
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        int[][] c = new int[row1][col2];
        if (col1 != row2) {
            System.out.println("Can't multiple");
        }else{
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                c[i][j] = 0;
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    c[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        displayMatrix(c);
        }
        return c;
    }
    public void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }
    
    public void menu() {
        int[][] matrix1;
        int[][] matrix2;
        int[][] c;
        while (true) {
            System.out.println("\n1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = v.checkInput(1, 4);
            switch (choice) {
                case 1:
                    System.out.println("\n----- Addition ------");
                    matrix1 = inputMatrix(1);
                    matrix2 = inputMatrix(2);
                    c = additionMatrix(matrix1, matrix2);
                    break;
                case 2:
                    System.out.println("\n----- Subtraction ------");
                    matrix1 = inputMatrix(1);
                    matrix2 = inputMatrix(2);
                    c = subtractionMatrix(matrix1, matrix2);
                    break;
                case 3:
                    System.out.println("\n----- Multiplication ------");
                    matrix1 = inputMatrix(1);
                    matrix2 = inputMatrix(2);
                    c = multiplicationMatrix(matrix1, matrix2);
                    break;
                case 4:
                    return;
            }
        }
    }
    
}
