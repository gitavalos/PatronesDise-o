/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Hamburguesa.*;
import java.util.ArrayList;

/**
 *
 * @author ivanl
 */
public class Cocina {

    Hamburguesa hamburguesa;
    Restaurante restaurante;
    String region;
    
    Persona[] personas;
    ArrayList<Pedido> pedidos;
    ArrayList<Pedido> entregados;

    public Cocina(String region) {
        pedidos = new ArrayList<>();
        entregados = new ArrayList<>();
        this.region = region;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("enviando orden a cocina");
        Cocinar();
    }

    //***********PREPARAR PEDIDO*******//
    public Hamburguesa Cocinar() {
        switch(region){
            case ("Guatemala"):
                restaurante = new RestauranteGuatemala();
                break;
            case ("EEUU"):
                restaurante = new RestauranteEstadosUnidos();
                break;
        }        
        Pedido pedido = pedidos.get(0);
        int numMenu = pedido.getEspecificacion();
        switch (numMenu) {
            case (1):
                hamburguesa = restaurante.OrdenarHamburguesa("Angus");
                break;
            case (2):
                hamburguesa = restaurante.OrdenarHamburguesa("CuartoConQueso");
                break;
            case (3):
                hamburguesa = restaurante.OrdenarHamburguesa("FiletePez");
                break;
        }

        return hamburguesa;
    }

    public void entregaPedido(Pedido pedido) {

        entregados.add(pedidos.remove(0));
        System.out.println("entregando orden a cliente");
    }

    public int numeroPedidos() {
        return this.pedidos.size() + this.entregados.size();
    }

}
