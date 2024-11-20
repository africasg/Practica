import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        mostrarMenu();
    }
    public static void mostrarMenu(){
        JFrame frame= new JFrame("Mistery Murder");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel mensaje = new JLabel("Bienvenido al juego, detective ¿Qué quieres hacer?");
        mensaje.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(mensaje);

        JButton btnIniciar = new JButton("Jugar");
        btnIniciar.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Cerrar el menú
                //mostrarPantallaInicial();
            }
        });
        panel.add(btnIniciar);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Gracias por jugar.");
                System.exit(0); // Cerrar el juego
            }
        });
        panel.add(btnSalir);

        frame.add(panel);
        frame.setVisible(true);

    }
    public static void mostrarPantallaInicial(){
        //AÑADIR IMAGEN
        //Se muestra el texto con lore, consigues movil(lees conver y tienes codigo)
        //MUSICA MISTERIOSA
        //HABLAS CON JESS(mostrarPantJess())
        //HABLAS CON RYAN(mostrarPantRyan())
        //GENERAR BOTONES PARA HABLAR O CON UNO O CON OTRO
    }
    public static void mostrarPantJess(){
        //Te cuenta su parte de la historia
        //(mostrarPantalla1())
    }
    public static void mostrarPantRyan(){
        //Te cuenta su parte de la historia
        //mostrarPantalla1()
    }
    public static void mostrarPantalla1(){
        //No sabes si volver a la escena del crimen
        //Vas (mostrarPantalla2a())
        //No vas(mostrarPantalla2b())
    }
    public static void mostrarPantalla2a(){
        //encuentras caja fuerte y usas el codigo
        //coges los papeles
        //coges pistola (mostrarPantalla3a())
        //no coges pistola (mostrarPantalla3a())
    }
    public static void mostrarPantalla2b(){
        //revisas de nuevo el movil encuentras un mail(papeles)
        //mostrarPantalla3b()
    }
    public static void mostrarPantalla3a(){
        //ves a una persona fuera
        //la sigues(mostrarPantalla4())
        //no la sigues(mostrarFinal())
    }
    public static void mostrarPantalla3b(){
        //te llega un mensaje
        //vas (mostrarPantalla4())
        //no vas (mostrarFinal())
    }
    public static void mostrarPantalla4(){
        //has ido y ahora escuchas un ruido detras de un arbusto
        //decides disparar.TE QUEDAS SIN BALA (mostrarPantalla5a())
        //no disparas. SIGUES CON BALA (mostrarPantalla5b())
    }
    public static void mostrarPantalla5a(){
        //era un conejo que sale corriendo por el disparo
        //encuentras una nota
        //vas (mostrarPantalla6())
        //no vas (mostrarfinal())
    }
    public static void mostrarPantalla5b(){
        //Sale un conejo del arbusto y ves la nota
        //vas (mostrarPantalla6())
        //no vas (mostrarfinal())
    }
    public static void mostrarPantalla6(){
        //has ido y te encuentras con mike que te cuenta lo que paso
        //mostrarPantalla7()
    }
    public static void mostrarPantalla7(){
        //has ido a hablar con ryan para confrontarle pero te ataca
        //usas pistola (mostrarPantalla8())
        //no la usas(no la tienes, no quieres, no tienes bala)-mostrarPantExtra()
    }
    public static void mostrarPantalla8(){
        //te defiendes y has ganado. detienes a ryan
    }
    public static void mostrarFinal(){
        //tienes que escribir el nombre del asesino
        //ganas o pierdes
    }
    public static void mostrarPantaExtra(){
        //no te has podido defender y mueres dejando el caso sin resolver
    }
}