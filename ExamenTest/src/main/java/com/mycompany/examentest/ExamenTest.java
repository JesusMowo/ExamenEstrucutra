package com.mycompany.examentest;

import java.util.Scanner;

public class ExamenTest {
//      EJERCICIO 1
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
//      FIN DE EJERCICIO 1
//      EJERCICIO 2
    public static void LlenarMatrizConFuncion(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) {
            int potenciaX = (int) Math.pow(i, 4);  // Calculamos X^4
            int potenciaY = (int) Math.pow(j, 3);  // Calculamos Y^3
            matriz[i][j] = (23 * potenciaX * 20 * potenciaY) - 3;
            }
        }
    }
//      FIN DE EJERCICIO 2
    
    
//      EJERCICIO 3
    public static boolean esMatrizIdentidad(int[][] matriz) {

        if (matriz.length != matriz[0].length) {
            return false; 
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j && matriz[i][j] != 1) { 
                    return false;
                } else if (i != j && matriz[i][j] != 0) { 
                    return false;
                }
            }
        }
        return true; 
    }

//      FIN DE EJERCICIO 3
    
//      EJERCICIO 4
    
    public static boolean esTriangularInferior(int[][] matriz) {

        if (matriz.length != matriz[0].length) {
            return false;
        }

        for (int i = 1; i < matriz.length; i++) { 
            for (int j = 0; j < i; j++) { 
                if (matriz[i][j] != 0) {
                    return false; 
                }
            }
        }
        return true;
    }
    
//    FIN DE EJERCICIO 4
    public static void main(String[] args) {
        
//      TODO ESTO ES  EJERCICIO 1

        Scanner sc = new Scanner(System.in);
        
//      COMENTAR HASTA FIN EJERCICIO 1 PARA SOLO CORRER CADA EJERCICIO POR SEPARADO (NO COMENTAR EL SC PO Q OBVIO SE DAÑA TODO)
//      DE IGUAL FORMA HACER CON LOS DEMAS EJERCICIOS ESTAN MARCADOS DE ESA FORMA UWU
//      EN ESE EJERCICIO EN EL ENCABEZADO HAY UN ERROR PORQUE LA FORMULA QUE DA "M_RESULTADO = (M_1 * M_2) + M_3." ES DISTINTO A LO QUE PIDE
//      SUME PRIMERO Y LUEGO MULTIPLIQUE PORQUE ESO FUE LO QUE LEI PERO LUEGO ME DI CUENTA, CREO QUE SI AFECTA EL RESULTADO PORQUE NO HAY DISTRIBUTIVA PERO LO ACLARO POR LAS DUDAS

        System.out.println("Suma dos matrices y luego multiplicalas :3");
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
        
//      FIN DE EJERCICIO 1


//      EJERCICIO 2
        System.out.println("ingrese datos para la matriz con formato de una funcion que no pienso escribir aqui ajja");
        System.out.print("Filas para la matriz: ");
        int filasEje2 = sc.nextInt();
        System.out.print("Columnas para la matriz: ");
        int columnasEje2 = sc.nextInt();
        int[][] matrizEje2 = new int[filasEje2][columnasEje2];
        LlenarMatrizConFuncion(matrizEje2);
        System.out.println("Matriz generada: ");
        ImprimirMatriz(matrizEje2);
        
//      FIN DE EJERCICIO 2

//      EJERCICIO 3 UWU
        System.out.println("esta valida si es identidad o no");
        System.out.print("Filas para la matriz: ");
        int filasEje3 = sc.nextInt();
        System.out.print("Columnas para la matriz: ");
        int columnasEje3 = sc.nextInt();
        int[][] matrizEje3 = new int[filasEje3][columnasEje3];
        LlenarMatriz(matrizEje3, sc);
        System.out.println("Matriz ingresada: ");
        ImprimirMatriz(matrizEje3);

        if (esMatrizIdentidad(matrizEje3)) {
            System.out.println("La matriz es identidad");
        } else {
            System.out.println("La matriz no es identidad");
        }

////      FIN DE EJERCICIO 3 UWU

//      EJERCICIO 4
        System.out.println("esta es para ver si es triangular inferior :3");
        System.out.print("Filas para la matriz: ");
        int filasEje4 = sc.nextInt();
        System.out.print("Columnas para la matriz: ");
        int columnasEje4 = sc.nextInt();
        int[][] matrizEje4 = new int[filasEje4][columnasEje4];
        LlenarMatriz(matrizEje4, sc);
        System.out.println("Matriz ingresada:");
        ImprimirMatriz(matrizEje4);
        if (esTriangularInferior(matrizEje4)) {
            System.out.println("La matriz es triangular inferior");
        }
        else {
            System.out.println("La matriz no es triangular inferior");
        }
//      FIN DE EJERCICIO 4
//      SALUDOS PROFE
    }
}


