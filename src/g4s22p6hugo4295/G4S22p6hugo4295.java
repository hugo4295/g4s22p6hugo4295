/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s22p6hugo4295;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author hugo4295
 */
public class G4S22p6hugo4295 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
        lista.forEach(contenido -> {
            System.out.println("El valor contenido es " + contenido);
        });
        
        lista.add("G");
        lista.add("H");
        
        System.out.println("\n segunda forma de trabajar recorridos de listas \n");
        
        for(String contenido1 : lista){
            System.out.println("El valor contenido es "+ contenido1);
        }
        
        lista.add("victor");
        lista.add("esta es una linea muy larga");
        lista.add("hugo");
        lista.add("segunda linea muy larga sin problemas de almacenamiento");
        
        System.out.println("\n tercer forma de trabajar recorridos de listas \n");
        
        lista.stream().forEach(contenido2 -> {
            System.out.println("el valor contenido es " + contenido2);
        });

    }
    
}
