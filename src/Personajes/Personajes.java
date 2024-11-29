package Personajes;

public abstract class Personajes {
        private String nombre;
        private String imagen;//como hacer lo de las imagenes, mirar si se hace con string o no
        private String descripcion;
        //posicion imagen (en el main del juego)
        public Personajes(String nombre, String imagen, String descripcion) {
            this.nombre = nombre;
            this.imagen = imagen;
            this.descripcion = descripcion;
        }
/*metodos: aparecer

 */
    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }
}




