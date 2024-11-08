package ui;

import model.Controller;

import java.util.Scanner;

public class Executable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.println("Bienvenido al sistema de multiplicación de matrices de la Universidad ICESI.");
        System.out.println("Por favor dime de qué tamaño serán tus matrices cuadradas");
        int size = scanner.nextInt();

        int[][] values1 = new int[size][size];
        int[][] values2 = new int[size][size];

        // Solicitar valores para la primera matriz
        System.out.println("¡Muy bien! Para empezar, necesito que me digas cómo está conformada la primera matriz.");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Digita el número de la posición " + (i + 1) + "," + (j + 1) + " de la primera matriz:\n ");
                values1[i][j] = scanner.nextInt();
            }
        }

        // Solicitar valores para la segunda matriz
        System.out.println("Nos falta saber cómo está conformada la segunda matriz.");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Digita el número de la posición " + (i + 1) + "," + (j + 1) + " de la segunda matriz:\n> ");
                values2[i][j] = scanner.nextInt();
            }
        }

        // Multiplicar las matrices usando el controlador
        int[][] resultMatrix = controller.multiplyMatrices(values1, values2);

        // Mostrar el resultado al usuario
        System.out.println("¡Excelente! El resultado de la multiplicación de las matrices es:");
        controller.printMatrix(resultMatrix);
        
        scanner.close();
    }
}
