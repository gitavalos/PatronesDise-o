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
public class RestauranteEstadosUnidos extends Restaurante {
    String reg = "EEUU";
    
    @Override
    protected Hamburguesa CrearHamburguesa(String Pedido) {
        if (Pedido.equals("CuartoConQueso")) {
            Hamburguesa cuarto = new CuartoLibraQueso();
            cuarto.Region = reg;
            cuarto.Extras.add("Queso extra");
            cuarto.Extras.add("Lechuga");
            cuarto.Extras.add("Tomate");
            return cuarto;
        } else if (Pedido.equals("FiletePez")) {
            Hamburguesa filete = new FiletePez();
            filete.Region = reg;
            return filete;
        }
        System.out.println("Lo Sentimos nostros no servimos " + Pedido + " en region "+reg);
        return null;
    }

}
