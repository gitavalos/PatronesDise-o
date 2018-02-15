/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author grama
 */
public class CobroEfectivo extends Cobro{

    @Override
    void recibirMedioPago(int monto) {
        System.out.println("Se han recibido " + monto + " quetzales en efectivo.");
    }

    @Override
    void registrarPago() {
        System.out.println("Se ha ingresado el efectivo a la caja.");
    }
    
    
    
}
