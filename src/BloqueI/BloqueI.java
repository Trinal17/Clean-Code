/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BloqueI;

/**
 *
 * @author javie
 */
public class BloqueI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1. Nombres Significativos
        
        //MAL
        int a = 10;
        int b = 15;
        int suma = a + b;
        System.out.println("La suma total de la cena es de: "+suma);
        
        //BIEN
        int cliente = 10;
        int precio = 15;
        int cena = cliente + precio;
        System.out.println("La suma total de la cena es de: "+cena);
        
        //2. Nombres Pronunciables
        
        //MAL
        String txtdl = "";
        
        //BIEN
        String textoDelLibro = "";
        
        //3. Nombres Localizables
        
        //MAL
        int c = 0;
        int d = 12;
        for (int i = 0; i < 40; i++) {
            c += i;
        }
        System.out.println(c);
        
        //BIEN
        int precioTotal = 0;
        int precioEntrada = 12;
        int entradasTotales = 40;
        
        for (int i = 0; i < entradasTotales; i++) {
            precioTotal += precioEntrada; 
        }
        System.out.println(precioTotal);
        
    }
    
    //4. Nombrar Funciones
    
    //MAL
    private static int alumnosTotales(int alumnos){
        int totalAlumnos = 22;
        int numAlumnos = 0;
        for (int i = 0; i < totalAlumnos; i++) {
            numAlumnos += i;
        }
        
        return numAlumnos;
    }
    
    //BIEN
    private static int sumarTotalAlumnos(int alumnos){
        int totalAlumnos = 22;
        int numAlumnos = 0;
        for (int i = 0; i < totalAlumnos; i++) {
            numAlumnos += i;
        }
        
        return numAlumnos;
    }
    
}
