package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void LlenarMatriz(int[][] matriz, Scanner sc ){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor para ["+ i +"]["+ j +"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    public static void ImprimirMatriz(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas para las matrices: ");
        int filas = sc.nextInt();
        System.out.print("Columnas para las matrices: ");
        int columnas = sc.nextInt();

        int matriz1[][] = new int[filas][columnas];
        int matriz2[][] = new int[filas][columnas];
        int matriz3[][] = new int[filas][columnas];

        System.out.println("Valores para Matriz 1 (esta sera multiplicada por la matriz 2): ");
        LlenarMatriz(matriz1, sc);
        System.out.println("Valores para Matriz 2: ");
        LlenarMatriz(matriz2, sc);
        System.out.println("Valores para Matriz 3(esta sera sumada por el resultado de las anteriores): ");
        LlenarMatriz(matriz3, sc);

        int[][] sumarMatrices = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumarMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < columnas; k++) {
                    resultado[i][j] += sumarMatrices[i][k] * matriz3[k][j];
                }
            }
        }

        System.out.println("Matriz resultante: ");
        ImprimirMatriz(resultado);

        sc.close();
    }
}


