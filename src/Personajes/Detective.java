package Personajes;

import Objetos.Objeto;
import Objetos.Pistola;

import java.util.ArrayList;
import java.util.List;
//TODO Añadir imagen
public class Detective extends Personajes {
    private List<Objeto> inventario;
    private boolean tieneBala;

    public Detective(String nombre, String imagen, String descripcion) {
        super("Allyson Jayce", imagen, "Personajes.Personajes.Detective");
        this.inventario = new ArrayList<>();
        this.tieneBala = false;
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

    public void mostrarInv() {
        System.out.println("Inventario");
        if (inventario.isEmpty()) {
            System.out.println("Tu inventario esta vacio :(");
        } else {
            for (Objeto obje : inventario) {
                System.out.println("- " + obje.getNombreobj());
            }
        }
    }

    public void UsarObjeto(String nomObjeto) {
        Objeto objeto;
    }

    //Metodos propios de los objetos
    private void dispararPistola(Pistola pistola) {
        if (pistola.tieneBala()) {
            System.out.println("Disparas la pistola.");
            pistola.setTieneBala(false);
        } else {
            System.out.println("La pistola no tiene balas.");
        }
    }
}





