package GUI;
import GUI.UI;
import Objetos.Objeto;
import Objetos.Pistola;
import Personajes.Detective;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Paneles {
    public JLabel crearTextoCentrado(String texto, int tamañoFuente, Color color) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setAlignmentX(Component.CENTER_ALIGNMENT);
        etiqueta.setForeground(color);
        etiqueta.setFont(new Font("Verdana", Font.PLAIN, tamañoFuente));
        return etiqueta;
    }
    // Método para crear el fondo del JFrame
    public JPanel crearPanelFondo(String rutaFondo) {
        return new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource(rutaFondo)));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
    }

    // Método para crear un JDialog con un mensaje
    public JDialog crearDialogo(JFrame frame, String texto) {
        JDialog dialogo = new JDialog(frame, null, true);
        dialogo.setSize(750, 500);
        dialogo.setResizable(false);
        dialogo.setLayout(new BorderLayout());

        JTextArea mensaje = new JTextArea(texto);
        mensaje.setEditable(false);
        mensaje.setLineWrap(true);
        mensaje.setWrapStyleWord(true);
        mensaje.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialogo.add(new JScrollPane(mensaje), BorderLayout.CENTER);

        JButton botonCerrar = new JButton("Cerrar");
        botonCerrar.addActionListener(e -> dialogo.dispose());
        dialogo.add(botonCerrar, BorderLayout.SOUTH);

        dialogo.setLocationRelativeTo(frame);
        dialogo.setVisible(true);

        return dialogo;
    }

    // Método para configurar el JFrame
    public JFrame crearFrame(String rutaFondo) {
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel fondoPanel = crearPanelFondo(rutaFondo);
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        return frame;
    }

    // Método para inicializar el Detective
    public Detective crearDetective(String nombre, String rutaImagen) {
        List<Objeto> inventario = new ArrayList<>();
        return new Detective(nombre, rutaImagen, "Detective", inventario, false);
    }


}
