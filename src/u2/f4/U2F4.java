/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package u2.f4;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author adis_
 */
public class U2F4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //calcular la distancia de tres lados
        //convertir los segundos en dias
        //evaluar la siguyiente expresion 
        // p**3Q**4-2*p**2<680
        // si cumple condicion mandar mensaje de que si lo hace.
        
        //int x1, y2, x2, y2, x3, y3;
        
        
        Scanner read = new Scanner(System.in);
        
        boolean running = true;
        int userChoose;
        int repeticion;
        do
        {
            System.out.println("BIENVENIDO A MI JUEGO");
            System.out.println("Escoge una opcion\n1. Calulca distancias\n2. Obten segundos a horas\n3. Cumple la condicion");
            userChoose = read.nextInt();
        
        
            switch(userChoose)
            {
                case 1:
                    System.out.print("¿Cuántas distancias vas a calcular? ");
                    int n = read.nextInt();

                    double [] distancias = new double[n];

                    for (int i = 0; i < n; i++) 
                    {
                        System.out.println("Distancia " + i + ":");

                        System.out.print("Ingresa x1: ");
                        double x1 = read.nextDouble();

                        System.out.print("Ingresa y1: ");
                        double y1 = read.nextDouble();

                        System.out.print("Ingresa x2: ");
                        double x2 = read.nextDouble();

                        System.out.print("Ingresa y2: ");
                        double y2 = read.nextDouble();

                        distancias[i] = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                    }

                    System.out.println("Las distancias son");
                    for (int i = 0; i < n; i++)
                    {
                        System.out.println("Distancia " + (i + 1) + "   " + distancias[i]);
                    }  

                    // wanta to play again. yes - do / no- quit. 
                break;

                case 2:

                    final int SECONDS = 3600;


                    System.out.println("Ingresa el tiempo en segundos: ");
                    double segundos = read.nextDouble();

                    //tranform sec into hours.
                            // 1h = 3600 sec
                    double horas = segundos/SECONDS;

                    DecimalFormat df = new DecimalFormat("#0.0000");
                    //imprimir horas.
                    System.out.println("Tus segundos en horas son: "+(df.format(horas)));
                break;

                case 3:
                    final int VALOR = 680;
                    System.out.println("Ingresa el valor 1");
                    double p = read.nextDouble();
                    System.out.println("Ingresa el valor 2");
                    double q = read.nextDouble();

                    //operacion.
                    double operacion = Math.pow(p, 3) + Math.pow(q, 4) - 2 * Math.pow(p, 2);
                    //checker si operacion es menor que VALOR.
                    if (operacion < VALOR)
                    {
                        System.out.println("El valor "+operacion+" es menor que "+VALOR);
                    }
                    else 
                        System.out.println("El valor "+operacion+" es mayor que "+VALOR);
                break;
                
                default:
                    System.out.println("Opcion invalida");
                       
            }
            System.out.println("Deseas jugar otra vez?\n1. Si\n2. No");
            repeticion = read.nextInt();
        }
        while(repeticion == 1);
        if (repeticion != 1) 
        {
            System.out.println("Adios");
        }
        
    }
}

        
    
    

