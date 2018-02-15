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
public class ExtraTocino extends DecoradorHamburguesa {

    public ExtraTocino(Hamburguesa hamburguesa) {
        System.out.println("Se agrega extra tocino");
        this.hamburguesa = hamburguesa;
    }

    @Override
    public String ObtenerDescripcion() {
        return hamburguesa.ObtenerDescripcion() + " Con Extra Tocino";
    }
}
