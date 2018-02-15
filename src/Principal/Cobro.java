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
abstract class Cobro {
    
    int monto;
    
    // Método generalizado
    void cobrar(int monto){
        
        //Algoritmo
        ingresarMonto(monto);
        recibirMedioPago(monto);
        registrarPago();
        entregarFactura();
    
    }
    
    // Método en común
    void ingresarMonto(int monto){
        this.monto = monto;
        System.out.println("La cantidad a cobrar es: " + this.monto);
    }
    
    // Método abstracto específico
    abstract void recibirMedioPago(int monto);
    
    // Método abstracto específico
    abstract void registrarPago();
    
    // Método en común
    void entregarFactura(){
        System.out.println("Se ha emitido una factura por " + monto + " quetzales.");
    }
}
