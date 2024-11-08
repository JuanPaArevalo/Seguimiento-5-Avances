package model;

import model.Matrix;

public class Controller {
    public int[][] createMatrix(int size, int[][] values) {
        Matrix matrix = new Matrix(size);
        matrix.setMatrixValues(values);
        return matrix.getData();
    }

    public int[][] multiplyMatrices(int[][] values1, int[][] values2) {
        int size = values1.length;

        // Crear matrices usando los valores proporcionados
        Matrix matrix1 = new Matrix(size);
        Matrix matrix2 = new Matrix(size);
        matrix1.setMatrixValues(values1);
        matrix2.setMatrixValues(values2);

        // Realizar la multiplicación y devolver el resultado
        return matrix1.multiply(matrix2);
    }

    public void printMatrix(int[][] matrixData) {
        for (int i = 0; i < matrixData.length; i++) {
            for (int j = 0; j < matrixData[i].length; j++) {
                System.out.print(matrixData[i][j] + " ");
            }
            System.out.println();
        }
    }
}
