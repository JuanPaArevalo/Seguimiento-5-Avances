package model;

public class Matrix {
    private int size;
    private int[][] data;

    public Matrix(int size) {
        this.size = size;
        this.data = new int[size][size];
    }

    public void setMatrixValues(int[][] values) {
        if (values.length == size && values[0].length == size) {
            this.data = values;
        } else {
            System.out.println("Error: Las dimensiones de los valores no coinciden con el tamaño de la matriz.");
        }
    }

    public int[][] multiply(Matrix other) {
        if (this.size != other.size) {
            System.out.println("Error: Las matrices deben ser de la misma dimensión.");
            return null;
        }

        int[][] result = new int[size][size];

        // Algoritmo para la multiplicación de matrices
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = 0;
                for (int k = 0; k < size; k++) {
                    result[i][j] += this.data[k][i] * other.data[j][k]; //k / j
                }                           //i / k
            }
        }
        
        return result;
    }

    public int[][] getData() {
        return data;
    }
}
