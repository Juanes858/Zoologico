package Zoologico;

import Clases.Aguila;
import Clases.Delfin;
import Clases.Garza;
import Clases.Jirafa;
import Clases.Leon;
import Clases.Morsa;
import Clases.Pato;
import Clases.Pinguino;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estuam
 */
public class main {
    public static void main(String[] args) {
        ArrayList<Aguila> aguilas = new ArrayList();
        ArrayList<Delfin> delfines = new ArrayList();
        ArrayList<Garza> garzas = new ArrayList();
        ArrayList<Jirafa> jirafas = new ArrayList();
        ArrayList<Leon> leones = new ArrayList();
        ArrayList<Morsa> morsas = new ArrayList();
        ArrayList<Pato> patos = new ArrayList();
        ArrayList<Pinguino> pinguinos = new ArrayList();
        
        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;
        Scanner sc = new Scanner(System.in);
        
        while(opcion != 4){            
            System.out.println("\n=================================================");
            System.out.println("Bienvenido a nuestro zoologico creado en un hermoso IDE \nque mi querido <3 profesor me obligo a hacer");
            System.out.println("Por favor elija una opcion de lo que desee hacer");
            System.out.println("=================================================");
            System.out.println("1. Para elejir un animal Terrestre"
                + "\n2. Para elejir un animal Aereo"
                + "\n3. Para elejir un animal Acuatico"
                + "\n4. Para salir de este maravilloso programa que me obligaron a CREAR C:");
            opcion = sc.nextInt();
            switch(opcion)
            {
                case 1:
                   System.out.println("\nElija un animal"
                           + "\n1.Jirafa"
                           + "\n2.Leon");
                   opcion2 = sc.nextInt();
                   switch(opcion2)
                   {
                       case 1:
                           System.out.println("\n¿que desea hacer?"
                                   + "\n1. Guardar animal"
                                   + "\n2. Mostrar datos del animal");
                           opcion3 = sc.nextInt();
                           Jirafa jf = new Jirafa();
                          if (opcion3 == 1){
                               jf.Guardar();
                               jirafas.add(jf);
                           }if (opcion3 == 2){
                               for(Jirafa jfO: jirafas){
                                    jfO.mostrarDatos();
                                }
                           }
                           break;
                       case 2:
                           System.out.println("\n¿que desea hacer?"
                                   + "\n1. Guardar animal"
                                   + "\n2. Mostrar datos del animal");
                           opcion3 = sc.nextInt();
                           Leon leon = new Leon();
                           if (opcion3 == 1){
                               leon.Guardar();
                               leones.add(leon);
                           }if (opcion3 == 2){
                               for(Leon leonO: leones){
                                    leonO.mostrarDatos();
                                }
                           }
                           break;                   
                   }
                   break;
                case 2:
                    System.out.println("\nElija un animal"
                           + "\n1.Pato"
                           + "\n2.Aguila"
                           + "\n3.Garza");
                   opcion2 = sc.nextInt();
                   switch(opcion2){
                       case 1:
                           System.out.println("\n¿que desea hacer?"
                                   + "\n1. Guardar animal"
                                   + "\n2. Mostrar datos del animal");
                           opcion3 = sc.nextInt();
                           Pato pato = new Pato();
                           if (opcion3 == 1){
                               pato.Guardar();
                               patos.add(pato);
                           }if (opcion3 == 2){
                               for(Pato patoO: patos){
                                   patoO.mostrarDatos();
                               }
                           }
                           break;
                       case 2:
                           System.out.println("\n¿que desea hacer?"
                                   + "\n1. Guardar animal"
                                   + "\n2. Mostrar datos del animal");
                           opcion3 = sc.nextInt();
                           Aguila aguila = new Aguila();
                           if (opcion3 == 1){
                               aguila.Guardar();
                               aguilas.add(aguila);
                           }if (opcion3 == 2){
                               for(Aguila aguilaO: aguilas){
                                    aguilaO.mostrarDatos();
                                }
                           }
                           break;
                        case 3:
                        System.out.println("\n¿que desea hacer?"
                                   + "\n1. Guardar animal"
                                   + "\n2. Mostrar datos del animal");
                        opcion3 = sc.nextInt();
                           Garza garza = new Garza();
                           if (opcion3 == 1){
                               garza.Guardar();
                               garzas.add(garza);
                           }if (opcion3 == 2){
                               for(Garza garzaO: garzas){
                                    garzaO.mostrarDatos();
                                }
                           }
                           break;
                        default:
                            System.out.println("La opcion digitada NO es Valida!!!");
                            break;
                   }
                   break;
                case 3:
                    System.out.println("\nElija un animal"
                           + "\n1.Delfin"
                           + "\n2.Morsa"
                           + "\n3.Pinguino");
                   opcion2 = sc.nextInt();
                   switch(opcion2){
                       case 1:
                           System.out.println("\n¿que desea hacer?"
                                   + "\n1. Guardar animal"
                                   + "\n2. Mostrar datos del animal");
                           opcion3 = sc.nextInt();
                           Delfin delfin = new Delfin();
                           if (opcion3 == 1){
                               delfin.Guardar();
                               delfines.add(delfin);
                           }if (opcion3 == 2){
                               for(Delfin delfinO: delfines){
                                    delfinO.mostrarDatos();
                               }
                           }
                           break;
                       case 2:
                           System.out.println("\n¿que desea hacer?"
                                   + "\n1. Guardar animal"
                                   + "\n2. Mostrar datos del animal");
                           opcion3 = sc.nextInt();
                           Morsa morsa = new Morsa();
                           if (opcion3 == 1){
                               morsa.Guardar();
                               morsas.add(morsa);
                           }if (opcion3 == 2){
                               for(Morsa morsaO: morsas){
                                   morsaO.mostrarDatos();
                               }
                           }
                           break;
                        case 3:
                           System.out.println("\n¿que desea hacer?"
                                   + "\n1. Guardar animal"
                                   + "\n2. Mostrar datos del animal");
                           opcion3 = sc.nextInt();
                           Pinguino pinguino = new Pinguino();
                           if (opcion3 == 1){
                               pinguino.Guardar();
                               pinguinos.add(pinguino);
                           }if (opcion3 == 2){
                               for(Pinguino pinguinoO:pinguinos){
                                    pinguinoO.mostrarDatos();
                               }
                           }
                           break;
                        default:
                            System.out.println("La opcion digitada NO es Valida!!!");
                            break;
                   }
                   break;
                default:
                        System.out.println("La opcion digitada NO es Valida!!!");
                   break;
            }
        }
        System.out.println("\nHa salido con exito del programa.....");
    }
}
