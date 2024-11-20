package Objetos;

public abstract class Objeto {
    private String nombreobj;
    private String desc;
    private boolean disponible;

    public Objeto(String nombreobj, String desc, boolean disponible) {
        this.nombreobj = nombreobj;
        this.desc = desc;
        this.disponible = disponible;
    }

    public String getNombreobj() {
        return nombreobj;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isDisponible() {
        return disponible;
    }

}





