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
        //objeto movil
        Objeto movil= new Objeto("Movil","Movil de la victima.",true);
        ImageIcon iconomovil= new ImageIcon(getClass().getResource("/telefono_juego.png"));

        //objeto detective
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        Detective Allysson= new Detective("Allyson", ruta, "Detective", inventario, false);

        //primer texto
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(800, 600);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("Decides dar una vuelta por la casa a investigar la escena. Encuentras el movil de la victima y te lo guardas como pista\n" +
                "Cuando enciendes el movil empiezas a buscar algo que te pueda decir que le paso a Emily carter y ahi encuentras una conversacion entre ella y su amiga Jess\n" +
                "Parece una discusion entre ambas por... Ryan. En el mensaje Jess amenazaba a Emily por haber empezado a salir con el chico que la gustaba\n " +
                "Esto es una gran pista. Jess pudo haber hecho daño a Emily por celos. Ademas de eso encuentras en la aplicacion de notas un codigo (40605) me pregunto que podre hacer con el.");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);

        //obtienes el movil
        Allysson.cogerObjeto(movil);

        //Segundo dialogo
        JDialog dialog2 = new JDialog(frame, null, true);
        dialog2.setSize(800, 600);
        dialog2.setLayout(new BorderLayout());

        JLabel iconoLabel = new JLabel(iconomovil);
        JLabel mensaje2 = new JLabel("Enhorabuena, has obtenido un movil!!!");
        mensaje2.setHorizontalAlignment(SwingConstants.CENTER);

        dialog2.add(iconoLabel, BorderLayout.WEST);
        dialog2.add(mensaje2, BorderLayout.CENTER);

        JButton botonCerrar2 = new JButton("Cerrar");
        botonCerrar2.addActionListener(e -> {
            dialog2.dispose();
            frame.dispose();

        });
        dialog2.add(botonCerrar2, BorderLayout.SOUTH);


        dialog2.setLocationRelativeTo(frame);
        dialog2.setVisible(true);

    }

}