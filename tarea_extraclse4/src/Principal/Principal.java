/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import paquete_personal.Trabajador;
import paquete_laempresa.Empresa_Privada;

/**
 *
 * @author lenovo
 */
public class Principal {
     public static void main(String[] args) {
         Trabajador trabajadores []= new Trabajador[2];
         trabajadores[0]=new Trabajador("Ana Luisa","Velez Alcivar",30 ,"12903939",100,40,10);
        trabajadores[1]=new Trabajador("Mario Anibal","Vela Narvaez",35 ,"212889",100,50,10);
        Empresa_Privada op= new Empresa_Privada("Soluciones Software","SS's","Loja",200000,12,trabajadores);
         System.out.println(op);
         
         
         
     }
    
}
