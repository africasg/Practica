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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }

}




