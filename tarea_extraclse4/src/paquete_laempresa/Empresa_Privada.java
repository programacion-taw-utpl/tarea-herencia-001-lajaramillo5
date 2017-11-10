/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_laempresa;

import paquete_personal.Trabajador;

/**
 *
 * @author lenovo
 */
public class Empresa_Privada extends Empresa {

    private int ventas_mensual_fijo;
    private int numero_sucursales;

    public Empresa_Privada(String n, String a, String e ,int s, int h,Trabajador trabajadores[]) {
        super(n,a,e,trabajadores);
        setVentas_mensual_fijo(s);
        setNumero_sucursales(h);
        setArreglo(trabajadores);
    }

    public void setVentas_mensual_fijo(int s) {
        ventas_mensual_fijo = s;
    }

    public int getVentas_mensual_fijo() {
        return ventas_mensual_fijo;
    }

    public void setNumero_sucursales(int s) {
        numero_sucursales = s;
    }

    public int getNumero_sucursales() {
        return numero_sucursales;
    }
    @Override
  public Trabajador[] getArreglo() {
        return trabajadores;
    }
    

    @Override
    public String toString() {
        String cadena = "";
                for (int i = 0; i < trabajadores.length; i++) {
            cadena += trabajadores[i].toString() + "\n";

        }

        return String.format("%s"
                + "Ventas: %d\n"
                + "Sucursales:%d\n"
                + "Lista Trabajadores:\n%s"
                , super.toString(), getVentas_mensual_fijo(), getNumero_sucursales(),cadena);

    }

}
