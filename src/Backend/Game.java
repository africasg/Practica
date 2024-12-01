package Backend;

import Objetos.Objeto;
import Objetos.Pistola;
import Personajes.Personajes;
import Personajes.Detective;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game {

    public void Decision1(){
        Objeto movil= new Objeto("Movil","Movil de la victima.",true);
        ImageIcon iconomovil= new ImageIcon("telefono_juego.png");

        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        Detective Allysson= new Detective("Allyson", ruta, "Detective", inventario, false);

        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JDialog dialog = new JDialog(frame, null, true);
        dialog.setSize(300, 200);
        dialog.setLayout(new BorderLayout());

        JTextArea mensaje = new JTextArea("Decides dar una vuelta por la casa a investigar la escena. Encuentras el movil de la victima y te lo guardas como pista\n" +
                "Cuando enciendes el movil empiezas a buscar algo que te pueda decir que le paso a Emily carter y ahi encuentras una conversacion entre ella y su amiga Jess\n" +
                "Parece una discusion entre ambas por... Ryan. En el mensaje Jess amenazaba a Emily por haber empezado a salir con el chico que la gustaba\n " +
                "Esto es una gran pista. Jess pudo haber hecho daño a Emily por celos. Ademas de eso encuentras en la aplicacion de notas un codigo (40605) me pregunto que podre hacer con el.");
        mensaje.setEditable(false);
        mensaje.setLineWrap(true);
        mensaje.setWrapStyleWord(true);
        dialog.add(new JScrollPane(mensaje), BorderLayout.CENTER);

        JButton botonCerrar = new JButton("Cerrar");
        botonCerrar.addActionListener(e -> dialog.dispose());
        dialog.add(botonCerrar, BorderLayout.SOUTH);

        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);

        //obtienes el movil
        Allysson.cogerObjeto(movil);

        JLabel iconoLabel = new JLabel(iconomovil);
        JLabel mensaje1 = new JLabel("Enhora buena has obtenido un movil!!!");

        mensaje1.setHorizontalAlignment(SwingConstants.CENTER);
        dialog.add(iconoLabel, BorderLayout.WEST);
        dialog.add(mensaje, BorderLayout.CENTER);
        botonCerrar.addActionListener(e -> dialog.dispose());
        dialog.add(botonCerrar, BorderLayout.SOUTH);
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);

    }

}