/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hamburguesa;

import java.util.ArrayList;

/**
 *
 * @author Avalo
 */
public abstract class Hamburguesa {
    String Region;
    String Nombre;
    String Pan;
    String Salsa;
    String Carne;
    ArrayList Extras = new ArrayList();
    
    void Preparar_Orden(){
        System.out.println("Region -> "+ Region);
        System.out.println("Orden -> " + Nombre);
        System.out.println("Se cocina la carne " + Carne);
        System.out.println("Se toma el pan " + Pan);
        System.out.println("Se coloca en el pan la " + Carne);
        System.out.println("Se agrega la salsa " + Salsa);
        for (int i = 0; i < Extras.size(); i++) {
            System.out.println("Se agrega " + Extras.get(i));
        }
    }
    
}
