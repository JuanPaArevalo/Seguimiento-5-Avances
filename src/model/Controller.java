package model;

import model.Matrix;

public class Controller {

    private Matrix matrix1;
    private Matrix matrix2;

    public Controller(){

    }


    public void createMatrices(int size){
        matrix1 = new Matrix(size);
        matrix2 = new Matrix(size);
    }

    public void fillMatrix1(int i, int j, int number){
        matrix1.setMatrixValues(i, j, number);
    }

    public void fillMatrix2(int i, int j, int number){
        matrix2.setMatrixValues(i, j, number);
    }

    public Matrix geMatrix1(){
        return matrix1;
    }

    public Matrix geMatrix2(){
        return matrix2;
    }

    public int[][] multiplyMatrices(){
        return matrix1.multiply(matrix2);
    }

    ///En la unica clase que usted puede imprimirle algo al usuario es en la clase Executable.
    public String printMatrix(int[][] matrixData) {
        String message = "";

        for (int i = 0; i < matrixData.length; i++) {
            for (int j = 0; j < matrixData[i].length; j++) {

                message+= "[" + matrixData[i][j] + "]";
            }

            message += "\n";
        }

        return message;
    }


    public void resetMatrices(){
        matrix1 = null;
        matrix2 = null;
    }
}
