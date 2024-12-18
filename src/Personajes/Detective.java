package Personajes;

import Objetos.Objeto;
import Objetos.Pistola;

import java.util.ArrayList;
import java.util.List;
//TODO Añadir imagen
public class Detective extends Personajes {
    private final List<Objeto> inventario;

    public Detective(String nombre, String ruta, String descripcion, List<Objeto> inventario, boolean tieneBala) {
        super("Allyson Jayce", ruta, "Personajes.Personajes.Detective");
        this.inventario = new ArrayList<>();
        boolean tieneBala1 = false;
    }
    //METODOS:

    public void cogerObjeto(Objeto objeto) {
        if (objeto.isDisponible()) {
            inventario.add(objeto);
            System.out.println(getNombre() + " ha cogido " + objeto.getNombreobj());
        } else {
            System.out.println("No puedes coger " + objeto.getNombreobj());
        }
    }

    public void cogerPistola(Pistola pistola) {
        if (pistola.isDisponible()) {
            inventario.add(pistola);
            System.out.println(getNombre() + " ha cogido " + pistola.getNombreobj());
        } else {
            System.out.println("No puedes coger " + pistola.getNombreobj());
        }
    }

    //Metodos propios de los objetos
   public void dispararPistola(Pistola pistola) {
        if (pistola.tieneBala()) {
            System.out.println("Disparas la pistola.");
            pistola.setTieneBala(false);
        } else {
            System.out.println("La pistola no tiene balas.");
        }
    }
}





