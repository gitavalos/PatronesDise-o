/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;

/**
 *
 * @author ivanl
 */
public class Pedido {

    int numero;
    String NombreCliente;
    int numeroMenu;
    ArrayList extra = new ArrayList();

    public Pedido(int numero, String NombreCliente, int especificacion) {
        this.numero = numero;
        this.NombreCliente = NombreCliente;
        this.numeroMenu = especificacion;
    }
    
    public void AgregarExtra(String elemento){
        extra.add(elemento);
    }

    public int getEspecificacion() {
        return numeroMenu;
    }

    public void setEspecificacion(int especificacion) {
        this.numeroMenu = especificacion;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
