package Objetos;

public class Pistola extends Objeto {

    private boolean tieneBala;

    public Pistola(String nombreobj, String desc, boolean disponible, boolean tieneBala) {
        super(nombreobj, desc, disponible);
        this.tieneBala = tieneBala;
    }
    /**
     * Metodo que comprueba si la pistola del detective tiene balas
     * para poder usarla.
     */
    public boolean tieneBala() {
        return tieneBala; //Saber si tiene bala o no
    }
    /**
     * Metodo que cambia el estado de las balas de la pistola.
     */
    public void setTieneBala(boolean tieneBala) {
        this.tieneBala = tieneBala;
    }
}