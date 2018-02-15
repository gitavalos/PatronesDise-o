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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String region = "Guatemala";
        Persona cliente1 = new Persona("201122826", "Ivan", "Lopez");
        Persona cliente2 = new Persona("201114339", "Antonio", "Avalos");           
        
        
        System.out.println("............................con facade............................");
        RestauranteFacade restaurante = new RestauranteFacade(region);
        //pedido con patron de diseño facade
        restaurante.ingresoRestaurante(cliente1);
        Pedido p = restaurante.pedido(cliente1, 1);
        p.AgregarExtra("Extra Queso");
        p.AgregarExtra("Extra Queso");
        p.AgregarExtra("Extra Queso");
        p.AgregarExtra("Extra Queso");
        restaurante.Aceptar(p);
        
        //pedido sin patron de diseño facade
        
        System.out.println("............................sin facade............................");
        restaurante.ingresoRestaurante(cliente2);
        Caja SeccionCaja = new Caja();
        Cocina SeccionCocina = new Cocina(region);
        SeccionCaja.atenderCliente(cliente2);
        SeccionCaja.pedirMenu(2);
        SeccionCaja.cobrando(35);
        Pedido p1 = new Pedido(SeccionCocina.numeroPedidos(),cliente2.nombres,2);
        p1.AgregarExtra("Extra Tocino");
        SeccionCocina.agregarPedido(p1);
        SeccionCocina.entregaPedido(p1);
    }
    
}
