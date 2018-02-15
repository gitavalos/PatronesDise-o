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
public class RunPedido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hamburguesa hamburguesa;
        Restaurante restaurante;
        restaurante = new RestauranteGuatemala();
        hamburguesa = restaurante.OrdenarHamburguesa("Angus");
        hamburguesa = restaurante.OrdenarHamburguesa("CuartoConQueso");
        hamburguesa = restaurante.OrdenarHamburguesa("FiletePez");
        restaurante = new RestauranteEstadosUnidos();
        hamburguesa = restaurante.OrdenarHamburguesa("Angus");
        hamburguesa = restaurante.OrdenarHamburguesa("CuartoConQueso"); 
        hamburguesa = restaurante.OrdenarHamburguesa("FiletePez");
    }
    
}
