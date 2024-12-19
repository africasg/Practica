package Personajes;

import javax.swing.*;

public class Personajes {
    private String nombre;
    private ImageIcon imagen;
    private String descripcion;

    public Personajes(String nombre, String ruta, String descripcion) {
        this.nombre = nombre;
        this.imagen = new ImageIcon(ruta);
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

}


