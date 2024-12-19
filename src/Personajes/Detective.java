package Personajes;

import Objetos.Objeto;
import Objetos.Pistola;

import java.util.ArrayList;
import java.util.List;

public class Detective extends Personajes {
    private final List<Objeto> inventario;

    public Detective(String nombre, String ruta, String descripcion, List<Objeto> inventario, boolean tieneBala) {
        super("Allyson Jayce", ruta, "Personajes.Personajes.Detective");
        this.inventario = new ArrayList<>();
        boolean tieneBala1 = false;
    }

    /**
     * Metodo que permite al detective coger los objetos del juego.
     */
    public void cogerObjeto(Objeto objeto) {
        if (objeto.isDisponible()) {
            inventario.add(objeto);
            System.out.println(getNombre() + " ha cogido " + objeto.getNombreobj());
        } else {
            System.out.println("No puedes coger " + objeto.getNombreobj());
        }
    }
    /**
     * Metodo que permite coger la pistola.
     */
    public void cogerPistola(Pistola pistola) {
        if (pistola.isDisponible()) {
            inventario.add(pistola);
            System.out.println(getNombre() + " ha cogido " + pistola.getNombreobj());
        } else {
            System.out.println("No puedes coger " + pistola.getNombreobj());
        }
    }

    /**
     * Metodo que permite disparar la pistola.
     * Recibe la pistola como parametro para ver si esta disponible o si ha sido usada ya.
     */
   public void dispararPistola(Pistola pistola) {
        if (pistola.tieneBala()) {
            System.out.println("Disparas la pistola.");
            pistola.setTieneBala(false);
        } else {
            System.out.println("La pistola no tiene balas.");
        }
    }
}





