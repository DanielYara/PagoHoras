/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagohoras;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class PagoHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = null; 
        double h = 0;
        int t = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del trabajador: ");
        nombre = teclado.next();
        
        System.out.println("Ingrese el valor de la hora: ");
        h = teclado.nextDouble();
        
        System.out.println("Ingrese el número de horas trabajadas: ");
        t = teclado.nextInt();
        
        calcularSalario(t, h);
        
        System.out.println("La cantidad de dinero a pagarle al Sr. " + nombre + " es: " + calcularSalario(t, h));
       
}
    public static double calcularSalario(int t, double h){
        double totalSalario = 0;  
        if(t <= 40){
            totalSalario = t*h;
        } 
        else if(t > 40){
            if((t - 40) <= 8){
                totalSalario = (40*h) + ((t % 40)*(2*h));
            } else {
                int d = t/40;
                int a = t % 40;
                //if(d > 1){
                totalSalario = (40*h) + ((8*2*h) + ((d-1)*40*3*h) + ((a-8)*3*h));
            //} else{
                //totalSalario = (40*h) + ((8*2*h) + ((a-8)*3*h));   
                //}
            }
                }
        return totalSalario;
}
}
