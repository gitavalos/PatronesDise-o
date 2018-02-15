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
public class CobroTarjeta extends Cobro{
    
    @Override
    void recibirMedioPago(int monto) {
        System.out.println("El cliente nos ha entregado su tarjeta.");
    }

    @Override
    void registrarPago() {
        System.out.println("Se ha registrado el débito a la tarjeta.");
    }
    
}
