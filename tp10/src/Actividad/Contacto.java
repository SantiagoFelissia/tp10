package Actividad;

import java.util.ArrayList;

public class Contacto {

    private String nombre;
    private String telefonoFijo;
    private ArrayList<String> celulares;

    public Contacto(String nombre, String telefonoFijo) {
        this.nombre = nombre;
        this.telefonoFijo = telefonoFijo;
        this.celulares = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public ArrayList<String> getCelulares() {
        return celulares;
    }

    public void agregarCelular(String celular) {
        celulares.add(celular);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nTeléfono fijo: " + telefonoFijo +
               "\nCelulares: " + celulares;
    }
}