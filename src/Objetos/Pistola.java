package Objetos;

public class Pistola extends Objeto {

    private boolean tieneBala;

    public Pistola(String nombreobj, String desc, boolean disponible, boolean tieneBala) {
        super(nombreobj, desc, disponible);
        this.tieneBala = tieneBala;
    }

    public boolean tieneBala() {
        return tieneBala; //Saber si tiene bala o no
    }

    public void setTieneBala(boolean tieneBala) {
        this.tieneBala = tieneBala;
    }
}