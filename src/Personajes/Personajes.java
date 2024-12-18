package Personajes;

import javax.swing.*;

public class Personajes {
    private String nombre;
    private ImageIcon imagen;
    private String descripcion;
    //posicion imagen (en el main del juego)
    public Personajes(String nombre, String ruta, String descripcion) {
        this.nombre = nombre;
        this.imagen = new ImageIcon(ruta);
        this.descripcion = descripcion;
    }
    /**
     * metodos: aparecer

     */
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}



