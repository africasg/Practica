package Objetos;

public  class Objeto {
    private final String nombreobj;
    private final String desc;
    private boolean disponible;

    public Objeto(String nombreobj, String desc, boolean disponible) {
        this.nombreobj = nombreobj;
        this.desc = desc;
        this.disponible = disponible;
    }

    public String getNombreobj() {
        return nombreobj;
    }
    /**
     * Metodo que comprueba si un objeto esta disponible
     */
    public boolean isDisponible() {
        return disponible;
    }
    /**
     * Metodo que cambia la disponibilidad de un objeto del juego
     */
    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }

}




