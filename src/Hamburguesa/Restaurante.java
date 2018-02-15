/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hamburguesa;

/**
 *
 * @author Avalo
 */
public abstract class Restaurante {
    public Hamburguesa OrdenarHamburguesa(String Tipo){
        System.out.println("//-------------------COMIENZA PREPARACION----------------------------//");
        Hamburguesa hamburguesa;
        hamburguesa = CrearHamburguesa(Tipo);
        if(hamburguesa!=null){
            hamburguesa.Preparar_Orden();
        }        
        System.out.println("//-------------------------TERMINA PREPARACION-----------------------//");
        return hamburguesa;
    }
    
    protected abstract Hamburguesa CrearHamburguesa(String Tipo);
}
