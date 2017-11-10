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
public class Empresa {

    private String nombre;
    private String siglas;
    private String ciudad;
    protected Trabajador trabajadores[];

    public Empresa(String n, String a, String e, Trabajador trabajadores[]) {
        setArreglo(trabajadores);
        setNombre(n);
        setSigla(a);
        setCiudad(e);

    }

    public void setArreglo(Trabajador n[]) {
        trabajadores = n;
    }

    public Trabajador[] getArreglo() {
        return trabajadores;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void setSigla(String n) {
        siglas = n;
    }

    public void setCiudad(String n) {
        ciudad = n;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSigla() {
        return siglas;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
 


        return String.format("Empresa: %s\n"
                + "Siglas: %s\n"
                + "ciudad: %s\n", getNombre(), getSigla(), getCiudad() );

    }

}
