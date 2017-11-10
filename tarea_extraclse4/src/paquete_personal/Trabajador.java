/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_personal;

/**
 *
 * @author lenovo
 */
public class Trabajador extends Persona {

    private int costo_seguro;
    private int horas_trabajadas;
    private int costo_por_hora;

    public Trabajador(String n, String a, int e, String v, int s, int h, int x) {
        super(n, a, e, v);
        setCosto_seguro(s);
        setHoras_trabajadas(h);
        setCosto_por_hora(x);

    }

    public void setCosto_seguro(int s) {
        costo_seguro = s;
    }

    public int getCosto_seguro() {
        return costo_seguro;
    }

    public void setHoras_trabajadas(int s) {
        horas_trabajadas = s;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setCosto_por_hora(int s) {
        costo_por_hora = s;
    }

    public int getCosto_por_hora() {
        return costo_por_hora;
    }

    public int getobtener_sueldo() {
        int obtener_sueldo = 0;
        obtener_sueldo += ((horas_trabajadas * costo_por_hora) + costo_seguro);
        return obtener_sueldo;
    }

    @Override
    public String toString() {
        String cadena = "";

        return String.format("%s\n"
                + "Seguro: %d\n"
                + "Horas Trabajadas: %d\n"
                + "Valor x Hora: %d\n"
                + "Sueldo:%d\n",
                 super.toString(), getCosto_seguro(), getHoras_trabajadas(), getCosto_por_hora(), getobtener_sueldo());

    }

}
