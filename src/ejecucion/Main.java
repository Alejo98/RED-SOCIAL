package ejecucion;




import java.io.*;
import java.util.*;
import Lectura.Lectura;
import UI.UI;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Camilo
 */
public class Main {

    
    //public static void main(String[] args){
        
    //}
    
    public static void main(String[] args) throws FileNotFoundException {
     UI ui = new UI();
     Scanner lectura  = new Scanner(System.in);
     boolean ok1=true;
     boolean indicador = true;
     do{
        try{
            while(indicador==true){
                System.out.println("desea continuar (Digita 1 Para continuar y 2 para salir)");
                int continua=lectura.nextInt();
                if (continua ==1){
                    ui.menu();
                    indicador=true;
                }
                else if(continua==2)
                    indicador=false;
                else if((continua!=1)||(continua!=2))
                    throw new IllegalArgumentException("DIGITE 1 PARA CONTINUAR Y 2 PARA SALIR");
            }
        }catch(NumberFormatException ex){
            System.out.println("DIGITE 1 PARA CONTINUAR Y 2 PARA SALIR");
            ok1=false;
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            ok1=false;
        }catch(InputMismatchException ex){
            System.out.println("DIGITE UN NUMERO");
            ok1=false;
        }
     }while(ok1==false);
   } 
}
        