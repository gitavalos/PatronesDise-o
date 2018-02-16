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
public class RestauranteGuatemala extends Restaurante {

    @Override
    protected Hamburguesa CrearHamburguesa(String Pedido) {
        reg = "Guatemala";
        if (Pedido.equals("Angus")) {
            Hamburguesa angus = new Angus();
            angus.Region = reg;
            angus.Extras.add("Tocino");
            angus.Extras.add("Salsa Barbacoa");
            angus.Extras.add("Cebolla");
            return angus;
        } else if (Pedido.equals("CuartoConQueso")) {
            Hamburguesa cuarto = new CuartoLibraQueso();
            cuarto.Region = reg;
            return cuarto;
        }
        System.out.println("Lo Sentimos nostros no servimos " + Pedido + " en region " + reg);
        return null;
    }

}
