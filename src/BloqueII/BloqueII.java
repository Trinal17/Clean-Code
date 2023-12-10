/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BloqueII;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class BloqueII {

    static boolean longitudCorrecta = false;
    static boolean tieneMay = false;
    static boolean tieneMin = false;
    static boolean tieneCharRaro = false;
    static boolean tieneNumero = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    //2. Deben ser cortas
    //MAL
    public static boolean isValidPwd(String password) {

        // Tiene entre 8 y 20 caracteres
        if (password.length() >= 8 && password.length() <= 20) {
            longitudCorrecta = true;
        }

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMay = true;
            }
            if (Character.isLowerCase(c)) {
                tieneMin = true;
            }
            if (Character.isDigit(c)) {
                tieneNumero = true;
            }
            if (c == '$' || c == '%' || c == '_' || c == '*') {
                tieneCharRaro = true;
            }
        }

        return (longitudCorrecta && tieneMay && tieneMin
                && tieneNumero && tieneCharRaro);
    }

    //BIEN
    public static boolean comprobarMayus(String password) {

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                tieneMay = true;
            }
        }

        return tieneMay;
    }
    //Se crean tantas funciones como tantos if haya en isValidPwd
    
    //3. No abusar de Switch/If
    
    public static void pintaMenu(){       
        Scanner sc = new Scanner(System.in);        
        int opcion=0;
        int operando1,operando2;        
        do{                        
            System.out.println("Introduzca una opción válida: ");
            opcion = sc.nextInt();
            operando1 = 3;
            operando2 = 7;
                switch (opcion){
                    case 1:
                        System.out.println("El resultado de la suma es: "+(operando1+operando2));
                        break;
                    case 2:
                        System.out.println("El resultado de la resta es: "+(operando1-operando2));
                        break;
                    case 3:
                        System.out.println("El resultado de la multiplicación es: "+(operando1*operando2));
                        break;
                    case 4:
                        System.out.println("El resutaldo de la división es: "+(operando1/operando2));
                        break;
                    case 5:
                        System.out.println("El resto es: "+(operando1%operando2));
                        break;
                }                                        
        }while (opcion>0);
    }    
    
    //4. Numeros de argumentos
    
    //MAL
    public static int sumarMal(int a,int b,int c,int d){
        int total = a + b + c + d;
        return total;
    }
    
    //BIEN
    public static int sumarBien(int a,int b){
        int total = a + b;
        return total;
    }
    
    //6. No Generar Side Effects
    
    //MAL    
    static int variableGlobal = 10;

    public static void generarSideEffect(String[] args) {
        System.out.println("Valor inicial de la variable global: " + variableGlobal);

        modificarVariableGlobal(5);

        System.out.println("Valor después del efecto colateral: " + variableGlobal);
    }

    static void modificarVariableGlobal(int valor) {
        variableGlobal += valor;
    }
    
    //BIEN
    public static void solucionarSideEffect(String[] args) {
        System.out.println("Valor inicial de la variable global: " + variableGlobal);

        int nuevoValor = calcularNuevoValor(5);
        System.out.println("Valor después del efecto colateral: " + nuevoValor);
    }

    static int calcularNuevoValor(int valor) {
        return variableGlobal + valor;
    }
    
    //7. No Repetir Codigo
    
    //MAL
    public static void repetirCodigo(){
        int a = 5;
        int b = 3;

        int suma1 = a + b;
        System.out.println("Suma 1: " + suma1);

        int resta1 = a - b;
        System.out.println("Resta 1: " + resta1);

        int x = 8;
        int y = 2;

        int suma2 = x + y;
        System.out.println("Suma 2: " + suma2);

        int resta2 = x - y;
        System.out.println("Resta 2: " + resta2);
    }
    
    //BIEN
    public static void evitarRepetirCodigo(){
        int a = 5;
        int b = 3;

        realizarOperaciones(a, b);

        int x = 8;
        int y = 2;

        realizarOperaciones(x, y);
    }
    static void realizarOperaciones(int num1, int num2) {
        int suma = num1 + num2;
        System.out.println("Suma: " + suma);

        int resta = num1 - num2;
        System.out.println("Resta: " + resta);
    }    
    
}
