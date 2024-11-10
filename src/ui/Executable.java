package ui;

import model.Controller;

import java.util.Scanner;

public class Executable {
    private Scanner scanner;
    private Controller controller;

    Executable(){
        scanner = new Scanner(System.in);
        controller = new Controller();
    }

    public static void main(String[] args) {
       Executable myApp = new Executable();
       myApp.run();
       
    }

    public void run(){
        ///Este metodo run es como el menu de la aplicacion. Me parece que es bueno crearlo siempre.
        System.out.println("Bienvenido al sistema de multiplicación de matrices de la Universidad ICESI.");

        boolean flag = true;

        while(flag){
            System.out.println("Ingresa una de las siguientes opciones:\n" + 
            "1. Multiplicar matrices.\n" + 
            "2. Exit\n");

            int option = scanner.nextInt();

            switch(option){
                case 1: 
                    multiplyMatrices();
                    break;

                case 2: 
                    flag = false;
                    break;
                
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
            
        }


        scanner.close();

    }



    ///Este metodo es el que le pide la informacion al usuario para las multiplicaciones.
    public void multiplyMatrices(){

        System.out.println("Por favor dime de qué tamaño serán tus matrices cuadradas");
        int size = scanner.nextInt();

        ///En esta linea le mando el tamaño de las matrices al metodo de la controladora que le 
        /// va a crear sus objetos Matriz, que van a tener las matrices definidas.
        controller.createMatrices(size);

        // Solicitar valores para la primera matriz
        System.out.println("¡Muy bien! Para empezar, necesito que me digas cómo está conformada la primera matriz.");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Digita el número de la posición " + (i + 1) + "," + (j + 1) + " de la primera matriz:\n");
                int number = scanner.nextInt(); //Pido el numero y lo guardo en una variable.
                controller.fillMatrix1(i,j,number); //Llamo al metodo en la controladora que me llena los objetos matriz que ya cree.
            }
        }

        // Solicitar valores para la segunda matriz
        System.out.println("Nos falta saber cómo está conformada la segunda matriz.");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Digita el número de la posición " + (i + 1) + "," + (j + 1) + " de la segunda matriz:\n");
                int number = scanner.nextInt(); //Se hace lo mismo para llenar la segunda matriz.
                controller.fillMatrix2(i,j,number);
            }
        }

        // Mostrar el resultado al usuario
        System.out.println("¡Excelente! El resultado de la multiplicación de las matrices es:");
        System.out.println(controller.printMatrix(controller.multiplyMatrices()));
        
    }
}
