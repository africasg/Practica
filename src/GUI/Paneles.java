package GUI;

import javax.swing.*;
import java.awt.*;

public class Paneles {
    private JLabel crearTextoCentrado(String texto, int tamañoFuente, Color color) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setAlignmentX(Component.CENTER_ALIGNMENT);
        etiqueta.setForeground(color);
        etiqueta.setFont(new Font("Verdana", Font.PLAIN, tamañoFuente));
        return etiqueta;
    }

}
