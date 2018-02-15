/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author ivanl
 */
public class RestauranteFacade {

    Caja SeccionCaja;
    Cocina SeccionCocina;

    public RestauranteFacade(String region) {
        this.SeccionCaja = new Caja();
        this.SeccionCocina = new Cocina(region);

    }

    public void ingresoRestaurante(Persona persona) {
        System.out.println("ingreso una persona al restaurante");
    }

    public void salidaRestaurante(Persona persona) {
        System.out.println("salida de una persona al restaurante");
    }

    public Pedido pedido(Persona persona, int menu) {
        SeccionCaja.atenderCliente(persona);
        SeccionCaja.pedirMenu(menu);
        SeccionCaja.cobrando(35);
        Pedido p = new Pedido(SeccionCocina.numeroPedidos(), persona.nombres, menu);
        
        return p;
    }
    
    public Pedido Aceptar(Pedido p){
        SeccionCocina.agregarPedido(p);
        SeccionCocina.entregaPedido(p);
        return p;
    }

}
