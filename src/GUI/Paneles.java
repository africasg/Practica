package GUI;
import Objetos.Objeto;
import Personajes.Detective;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Paneles {

    /**
     * Metodo para crear etiquetas con el texto centrado.
     * Recibe un texto, el tamaño de la fuente y el color de la letra y devuelve un JLabel.
     */
    public static JLabel crearTextoCentrado(String texto, int tamañoFuente, Color color) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setAlignmentX(Component.CENTER_ALIGNMENT);
        etiqueta.setForeground(color);
        etiqueta.setFont(new Font("Verdana", Font.PLAIN, tamañoFuente));
        return etiqueta;
    }

    /**
     * Metodo que pinta una imagen en el fondo de un panel.
     * Recibe una ruta de imagen y devuelve un JPanel.
     */
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

    /**
     * Metodo para crear dialogos a partir de un Frame y un texto.
     * Devuelve un JDialog.
     */
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

    /**
     * Metodo que crea nuevos frames y llama al metodo crearPanelFondo para pintarlos.
     * Devuelve un JFrame.
     */
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

    /**
     * Metodo que crea un objeto de la clase detective.
     * Recibe un String y una ruta de imagen y devuelve un detective.
     */
    public Detective crearDetective(String nombre, String rutaImagen) {
        List<Objeto> inventario = new ArrayList<>();
        return new Detective(nombre, rutaImagen, "Detective", inventario, false);
    }

    /**
     * Metodo que crea etiquetas.
     * Recibe un texto, una fuente y un color y devuelve un JLabel.
     */
    public JLabel crearEtiqueta(String texto, Font fuente, Color color) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(fuente);
        etiqueta.setForeground(color);
        return etiqueta;
    }


    /**
     * Metodo para crear botones.
     * Recibe un texto, una fuente, un color y un evento y devuelve un JButton.
     */
    public JButton crearBoton(String texto, Font fuente, ActionListener accion) {
        JButton boton = new JButton(texto);
        boton.setPreferredSize(new Dimension(300, 80));
        boton.setFont(fuente);

       return boton;

    }


}