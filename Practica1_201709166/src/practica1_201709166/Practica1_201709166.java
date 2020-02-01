                    /**//*////***//*****------.ñññ´´´´´´´´´´´´´´´´´´´´------/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201709166;

import java.util.Scanner;

/**
     * @author Benitez
 */
public class Practica1_201709166 {

    
    public static String  j1,j2,j3,j10,j20,j30;
    public static int numero;
    public static void main(String[] args) {
        // TODO code application logic here
        menutextual();
        menu();
        
    }
    public static void menutextual(){
            System.out.println("Bienvenido a Subidas y Bajones\n Escoja una opción: ");
            System.out.println("0. Ingresar jugadores");
            System.out.println("1. Iniciar juego");
            System.out.println("2. Regresar al juego");
            System.out.println("3. Configuración");
            System.out.println("4. Salir");
    }
    public static void menu(){
     Scanner x = new Scanner(System.in);
        int opcion; 
        opcion = x.nextInt();
  
        switch(opcion){
            
             case 0:
                 System.out.println("Jugadores: ");
  
                 if (true) {
                     jugadores();
                     menutextual();
                     menu();
                 }
                 break;
             case 1:
                 System.out.println("Inicia el juego");
                 
                 if (true) {
                     juego();
                     menutextual();
                     menu();
                 }
                 break;
             case 2:
                 System.out.println("Regresar al juego: ");
                 
                 if (true) {
                     menutextual();
                     menu();
                 }
                 break;
             case 3:
                 System.out.println("Configuración: ");
                 
                 if (true) {
                     
                     configuracion();
                 }
                 break;
             case 4:
                 System.out.println("La aplicación a finalizado");
                 System.exit(0);
                 break;
             default:
                 System.out.println("----Solo número entre 0 y 4----\n");
                 menutextual();
                 menu();
                 break;
         }
    }
    
    public static void jugadores(){
        System.out.println("Ingrese la cantidad de jugadores de 2-3: ");
        Scanner a = new Scanner(System.in);
        int jugadores;
        
        jugadores = a.nextInt();
        Scanner b= new Scanner(System.in);
        if (jugadores==1||jugadores==0) {
            System.out.println("No puede jugar una sola persona");
        }else if (jugadores==2) {
            System.out.println("Ingrese el nombre del primer jugador");
            j1=b.nextLine();
            j10="@";
            System.out.println("Ingrese el nombre del segundo jugador");
            j2=b.nextLine();
            j20="#";
        }else if (jugadores==3) {
            System.out.println("Ingrese el nombre del primer jugador");
            j1=b.nextLine();
            j10="@";
            System.out.println("Ingrese el nombre del segundo jugador");
            j2=b.nextLine();
            j20="#";
            System.out.println("Ingrese el nombre del tercer jugador");
            j3=b.nextLine();
            j30="%";
            
        }else if (jugadores>=4) {
            System.out.println("Solo pueden jugar 3 o menos");
            jugadores();
        }else{
            System.out.println("Debe ingresar por lo menos un jugador");
        }

        
        }
    
    public static void juego(){
       
  j1();
        matriz();
        j2();
        matriz();
        j3();
        matriz();
    
    }
    public static void matriz(){
       /* int posicion  = 0;
        int [][]matriz=new int[10][5];
        
        for (int i = 9; i >=0  ; i--) {
            
            for (int j = 0; j <5; j++) {
                matriz[i][j]= posicion;// Asignación posiciones.
                
                System.out.print(" |"+matriz[i][j]+"| ");
                posicion++;
            }
            System.out.println(" ");
            
        }*/
        int n = 10;          // filas 
        int m = 5;           // columnas
            
        int posicion=0;      // contador posiciones
 
        int tablero[][];                       
        tablero = new int[n][m];               
        
        for(int i=n-1; i>=0; i--){             
            if(i%2==0){                       
                for (int j=0; j<m; j++){       
                tablero[i][j]=posicion;              
                posicion ++;
                }
            }else{                             
                for (int j=m-1; j>=0; j--){    
                tablero[i][j]=posicion;                
                posicion++;     
                }
            }  
        }                                      
        
        for(int i=0; i<n; i++){                
            for(int j=0; j<m; j++){
                
                if(tablero[i][j]<10){         
                    System.out.print(" | "+tablero[i][j]+"| ");
                    
                }else{
                    System.out.print(" |"+tablero[i][j]+"| ");
                
                }
            }
            System.out.println("");
            
        }
        
       
              
       
    }
    
    
    
    public static void j1(){
        
        
        Scanner x = new Scanner(System.in);
        
        System.out.println("Inicia el turno de: "+j1);
        System.out.println("Con la ficha "+j10);
        numero = (int) (Math.random() * 12) + 1;
        System.out.println("El dado indica "+numero);
        
        //System.out.println("A "+j1+" le corresponde moverse "+numero+" espacios");
        
            Scanner waitForKeypress = new Scanner(System.in);
            System.out.println("Presione enter para continuar");
            
            waitForKeypress.nextLine();
           System.out.println("A "+j1+" le corresponde moverse "+numero+" espacios");
        
       
        /*if (!true) {
            nuevon=x.nextInt();
            System.out.println("El numero con que jugara es: "+ nuevon);
            System.out.println("A "+j1+" le corresponde moverse "+nuevon+" espacios");
            matriz();
            System.exit(0);
        }else{
            Scanner waitForKeypress = new Scanner(System.in);
            System.out.println("Presione enter para continuar");
            waitForKeypress.nextLine();
            System.out.println("A "+j1+" le corresponde moverse "+numero+" espacios");
            matriz();
            System.exit(0);
        }
        
        if (true) {
            
            nuevon=x.nextInt();
            System.out.println("El numero con que jugara es: "+ nuevon);
            System.out.println("A "+j1+" le corresponde moverse "+nuevon+" espacios");
            matriz();
            System.exit(0);
        }*/

          /*Scanner waitForKeypress = new Scanner(System.in);
        System.out.println("Presione enter para continuar");
            waitForKeypress.nextLine(); */
        
                   
        //waitForKeypress.nextLine();  
    
     
            //System.out.println("Debe escoger unicamente numeros del 1 al 12");
            //System.out.println("¿Qué número del 1 al 12 desea jugar?");
            /*nuevon=x.nextInt();
            System.out.println("El numero con que jugara es: "+ nuevon);
            System.out.println("A "+j1+" le corresponde moverse "+nuevon+" espacios");
            matriz();*/
        
        
            //System.out.println("0. No, deseo cambiarlo");
           // System.out.println("1. Si, continuemos");
            
           
           
        /*
            matriz();*/
    }
    
    public static void j2(){
        Scanner x = new Scanner(System.in);
        
        System.out.println("Inicia el turno de: "+j2);
        System.out.println("Con la ficha "+j20);
        numero = (int) (Math.random() * 12) + 1;
        System.out.println("El dado indica "+numero);
        
        //System.out.println("A "+j1+" le corresponde moverse "+numero+" espacios");
        
            Scanner waitForKeypress = new Scanner(System.in);
            System.out.println("Presione enter para continuar");
            waitForKeypress.nextLine();
            System.out.println("A "+j1+" le corresponde moverse "+numero+" espacios");
    }
    
    public static void j3(){
        Scanner x = new Scanner(System.in);
        
        System.out.println("Inicia el turno de: "+j3);
        System.out.println("Con la ficha "+j30);
        numero = (int) (Math.random() * 12) + 1;
        System.out.println("El dado indica "+numero);
        
        //System.out.println("A "+j1+" le corresponde moverse "+numero+" espacios");
        
            Scanner waitForKeypress = new Scanner(System.in);
            System.out.println("Presione enter para continuar");
            waitForKeypress.nextLine();
            System.out.println("A "+j1+" le corresponde moverse "+numero+" espacios");
    }
    
    public static void configuracion(){
        System.out.println("Bienvenido a Configuraciones ");
            System.out.println("0. Subida");
            System.out.println("1. Bajada");
            System.out.println("2. Regresar");
            
            Scanner x = new Scanner(System.in);
        int opcion; 
        opcion = x.nextInt();
  
        switch(opcion){
            
             case 0:
                 System.out.println("Subida");
  
                 if (true) {
                     
                     menutextual();
                     menu();
                 }
                 break;
             case 1:
                 System.out.println("Bajada");
                 
                 if (true) {
                     
                     menutextual();
                     menu();
                 }
                 break;
             case 2:
                 System.out.println("Regresar");
                 
                 if (true) {
                     menutextual();
                     menu();
                 }
                 break;
             
             default:
                 System.out.println("----Solo número entre 0 y 2----\n");
                 menutextual();
                 menu();
                 break;
                 /*perdon para la otra practica investigare mas :(*/
        }
    }
    }
    

    
    
    
    
    
    
    
    
    