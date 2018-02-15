/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Random;


/**
 *
 * @author ivanl
 */
public class Caja {
    
    Persona cajera;
    
    public void atenderCliente(Persona persona){
        System.out.println("atendiendo persona:" + persona.getNombres( ));
    }
    
    public void pedirMenu(int numeroMenu){
        System.out.println("generando un pedido, es el menu " + numeroMenu + ".....");
    }
    
    public void cobrando(int monton){
        if(new Random().nextBoolean()){
            new CobroEfectivo().cobrar(monton);
        }else{
            new CobroTarjeta().cobrar(monton);
        }
    }
    
    
    
}
