package Backend;

import GUI.UI;
import Objetos.Objeto;
import Objetos.Pistola;
import Personajes.Detective;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Game {

    public void Accion1(){
        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        new Detective("Allyson", ruta, "Detective", inventario, false);

        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/escena1.jpg")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //primer texto


        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(750, 500);
        dialog1.setResizable(false);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("""
                Bienvenida detective Allysson, necesitamos que investigue este caso de asesinato
                De momento lo único que sabemos es que la víctima es Emily Carter, una estudiante universitaria. \n
                La reportaron como desaparecida en el trabajo y al llegar a su casa nos la encontramos así en el baño.
                La última persona en verla con vida fue su amiga Jessica Smith. Además la víctima tenía un novio llamado Ryan White.
                Ambos tienen coartadas
                Puedes investigar un poco más la zona, a ver si encuentras alguna pista de utilidad.\s""");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(_ -> dialog1.dispose());
        botonesPanel.add(botonCerrar1);

        dialog1.add(botonesPanel, BorderLayout.SOUTH);


        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);

    }

    public void Accion2(){
        //objeto movil
        Objeto movil= new Objeto("Movil","Movil de la victima.",true);
        ImageIcon iconomovil= new ImageIcon(Objects.requireNonNull(getClass().getResource("/telefono_juego.png")));

        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        Detective Allysson= new Detective("Allyson", ruta, "Detective", inventario, false);

        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/escena1.jpg")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //primer texto

        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(750, 500);
        dialog1.setResizable(false);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("""
                Decides dar una vuelta por la casa a investigar la escena.\s
                Encuentras el móvil de la víctima y te lo guardas como pista
                Cuando enciendes el móvil, empiezas a buscar algo que te pueda dar una pista sobre lo que le pasó a Emily y ahí encuentras una conversación entre ella y su amiga Jess
                Parece una discusión entre ambas por... Ryan.\s
                En el mensaje, Jess amenazaba a Emily por haber empezado a salir con el chico que le gustaba
                Esto es una gran pista. Jess pudo haber hecho daño a Emily por celos.\s
                Además de eso encuentras en la aplicación de notas un código (40605)
                Me pregunto que podré hacer con el.""");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(_ -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);


        //obtienes el movie
        Allysson.cogerObjeto(movil);

        //Segundo dialogo
        JDialog dialog2 = new JDialog(frame, null, true);
        dialog2.setSize(750, 500);
        dialog2.setResizable(false);
        dialog2.setLayout(new BorderLayout());

        JLabel iconoLabel = new JLabel(iconomovil);
        JLabel mensaje2 = new JLabel("¡¡¡Has obtenido el móvil!!!");
        mensaje2.setHorizontalAlignment(SwingConstants.CENTER);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 18));
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

    public void Accion3(){

        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        new Detective("Allyson", ruta, "Detective", inventario, false);

        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/interrogatorio.jpg")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //primer texto


        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(750, 500);
        dialog1.setResizable(false);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("""
                Decides ir a interrogar a Jessica,la cual tiene mucho en su contra por el momento
                
                Detective Allyson: Bueno Jessica, me gustaría hablar contigo sobre Emily, la cual como ya sabes ha aparecido MUERTA en su casa
                Tengo motivos para pensar que tú has estado detrás de esto
                
                Jessica Smith: ¿¿¿PERDONE??? ¡¡¡YO JAMAS LE HARIA DAÑO A EMILY!!!!
                
                Detective Allysson: Tengo una conversación en el móvil de la víctima que demuestra lo contrario... Le amenazabas por salir con el chico que te gustaba...
                
                Jessica Smith: Eso... Fue una pelea tonta, nada más. Ella sabía que me gustaba Ryan desde hace mucho, y aún así decidió salir con él...
                Pero no pasó nada más que esa conversación, todo quedo aclarado.\s
                Ella era mi mejor amiga...
                
                Detective Allysson: Bueno, suficiente por hoy Jessica
                 Muchas gracias por tu testimonio.\s""");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(_ -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion4(){


        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        new Detective("Allyson", ruta, "Detective", inventario, false);


        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/interrogatorio.jpg")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //primer texto

        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(750, 500);
        dialog1.setResizable(false);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("""
                Decides ir a interrogar a Ryan, el novio de Emily, a ver si puede aclararte un poco la relación entre ambas chicas.
                
                Detective Allyson: Hola Ryan, gracias por venir. \nComo sabrás, estoy investigando la muerte de tu novia Emily. He encontrado algo y me gustaría que me aclarases una par de cosas.
                
                Ryan White: Por supuesto detective, haré lo que sea con tal de saber quién le hizo esto a mi pobre Emily...
                
                Detective Allysson: Tengo una conversación en el móvil de Emily donde ella y Jessica discutían por ti, ¿Podrías ayudarme a esclarecer la relación entre ambas?.
                
                Ryan White: ¡¡¡ESA LOCA DE JESSICA!!! Ella y Emily últimamente no se juntaban mucho porque Jessica estaba obsesionada conmigo...
                
                Detective Allysson: OH... Muchas gracias por esta información Ryan, me ayudará mucho con la investigación""");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(_ -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion5(){

        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        new Detective("Allyson", ruta, "Detective", inventario, false);

        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/despacho.jpg")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //primer texto

        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(750, 500);
        dialog1.setResizable(false);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("Ahora tengo un poco más de información sobre el caso, pero no creo que sea suficiente.\n" +
                "Es un poco tarde para ir sola a la escena del crimen y, además, podría ser peligroso, pero necesito encontrar algo más... algo que me diga quién le hizo esto a Emily Carter."
        );
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(_ -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion6(){

        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        Detective Allysson= new Detective("Allyson", ruta, "Detective", inventario, false);

        //Objeto papeles
        Objeto papeles= new Objeto("Papeles","Herencia del abuelo de la victima",true);
        ImageIcon iconopapelesOriginal= new ImageIcon(Objects.requireNonNull(getClass().getResource("/papeles.jpg")));
        Image imagenEscalada = iconopapelesOriginal.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        ImageIcon iconopapeles = new ImageIcon(imagenEscalada);

        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/casa.jpg")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //primer texto

        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(750, 500);
        dialog1.setResizable(false);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("""
                "No debería estar aquí... Pero tengo que encontrar alguna pista importante que me ayude con el caso. Miraré en la habitación de la víctima,ya que la última vez no pude entrar en ella por culpa de la policía."
                *Entras en la habitación*
                Al entrar, empiezas a mirar por todas partes... hasta que abres el armario y encuentras una caja fuerte que parece cerrada. Al parecer, necesita un código de 5 dígitos. \s
                "¡Ya lo tengo, usaré el código que había en el móvil de Emily!"
                
                La caja fuerte se ha abierto y dentro encuentras un par de objetos. Primero coges unos papeles que parecen el testamento de alguien.Por lo que parece, el abuelo de Emily murió hace poco y le dejó una gran suma de dinero como herencia. \s
                
                "Debajo de los papeles parece haber algo más... es ¡una pistola! ¿Estará bien si me la llevo?"
                """);
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(_ -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);

        //obtienes los papeles
        Allysson.cogerObjeto(papeles);

        //Segundo dialogo
        JDialog dialog2 = new JDialog(frame, null, true);
        dialog2.setSize(900, 500);
        dialog2.setResizable(false);
        dialog2.setLayout(new BorderLayout());

        JLabel iconoLabel = new JLabel(iconopapeles);

        JLabel mensaje2 = new JLabel("¡¡¡Has obtenido unos papeles muy importantes para la victima!!!");
        mensaje2.setFont(new Font("Verdana", Font.PLAIN, 16));
        mensaje2.setHorizontalAlignment(SwingConstants.CENTER);

        dialog2.add(iconoLabel, BorderLayout.WEST);
        dialog2.add(mensaje2, BorderLayout.CENTER);

        JButton botonCerrar2 = new JButton("Cerrar");
        botonCerrar2.addActionListener(_ -> {
            dialog2.dispose();
            frame.dispose();

        });
        dialog2.add(botonCerrar2, BorderLayout.SOUTH);


        dialog2.setLocationRelativeTo(frame);
        dialog2.setVisible(true);
    }

    public void cogePistola(Pistola pistola){

        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        Detective Allysson= new Detective("Allyson", ruta, "Detective", inventario, false);

        ImageIcon iconopapelesOriginal= new ImageIcon(Objects.requireNonNull(getClass().getResource("/pistola_juego.png")));
        Image imagenEscalada = iconopapelesOriginal.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        ImageIcon iconopapeles = new ImageIcon(imagenEscalada);

        //coge pistola
        pistola.setDisponible(true);
        pistola.setTieneBala(true);
        Allysson.cogerPistola(pistola);

        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/casa.jpg")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //Segundo dialogo
        JDialog dialog2 = new JDialog(frame, null, true);
        dialog2.setSize(750, 500);
        dialog2.setResizable(false);
        dialog2.setLayout(new BorderLayout());

        JLabel iconoLabel = new JLabel(iconopapeles);
        JLabel mensaje2 = new JLabel("¡¡¡Has obtenido una pistola!!!");

        mensaje2.setHorizontalAlignment(SwingConstants.CENTER);

        dialog2.add(iconoLabel, BorderLayout.WEST);
        dialog2.add(mensaje2, BorderLayout.CENTER);

        JButton botonCerrar2 = new JButton("Cerrar");
        botonCerrar2.addActionListener(_ -> {
            dialog2.dispose();
            frame.dispose();

        });
        dialog2.add(botonCerrar2, BorderLayout.SOUTH);


        dialog2.setLocationRelativeTo(frame);
        dialog2.setVisible(true);

    }



    public void Accion7(){

        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        new Detective("Allyson", ruta, "Detective", inventario, false);

        //Objeto papeles
        ImageIcon iconopapelesOriginal= new ImageIcon(Objects.requireNonNull(getClass().getResource("/telefono_juego.png")));
        Image imagenEscalada = iconopapelesOriginal.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        ImageIcon iconopapeles = new ImageIcon(imagenEscalada);


        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/despacho.jpg")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //primer texto

        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(750, 500);
        dialog1.setResizable(false);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("""
                "Realmente creo que sería demasiado peligroso volver a la escena del crimen, además podría meterme en líos si alguien me pilla ahí." \s
                Después de darle vueltas, decides arreglartelas con las pistas que ya tienes y repasar algo que hayas podido pasar por alto.
                
                Acabas revisando el móvil de Emily otra vez. Al meterte en sus mails, encuentras uno reciente donde a la víctima se le había entregado una gran cantidad de dinero por una herencia de su abuelo. \s
                ¿Será este el motivo real por el asesinato de Emily Carter?
                
                Mientras le dabas vueltas a esta nueva información, ocurrió algo sorprendente... \n¡Alguien le acababa de mandar un mensaje anónimo al móvil de la víctima! \s
                "Igual debería abrirlo para ver si me puede ayudar con el caso, pero si por el contrario no es nada relacionado con el asesinato, habré manipulado una pista para nada..."
                """);
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(_ -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);


        //Segundo dialogo
        JDialog dialog2 = new JDialog(frame, null, true);
        dialog2.setSize(750, 500);
        dialog2.setResizable(false);
        dialog2.setLayout(new BorderLayout());

        JLabel iconoLabel = new JLabel(iconopapeles);
        JLabel mensaje2 = new JLabel("¡¡¡Has obtenido unos papeles muy importantes \n para la victima!!!");

        mensaje2.setHorizontalAlignment(SwingConstants.CENTER);

        dialog2.add(iconoLabel, BorderLayout.WEST);
        dialog2.add(mensaje2, BorderLayout.CENTER);

        JButton botonCerrar2 = new JButton("Cerrar");
        botonCerrar2.addActionListener(_ -> {
            dialog2.dispose();
            frame.dispose();

        });
        dialog2.add(botonCerrar2, BorderLayout.SOUTH);


        dialog2.setLocationRelativeTo(frame);
        dialog2.setVisible(true);
    }

    public void Accion8(){

        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        new Detective("Allyson", ruta, "Detective", inventario, false);

        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/casa.jpg")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //primer texto

        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(750, 500);
        dialog1.setResizable(false);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("""
                "Tras andar un poco más por la casa, escuchas un fuerte golpe fuera. \s
                Corriendo, te acercas a la ventana más cercana al ruido y ves una silueta mirando hacia la casa, pero enseguida sale corriendo hacia el bosque... \s
                "Creo que es demasiado arriesgado seguir a la persona de negro, pero esto podría ser una gran pista.
               \s""");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(_ -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion9(){

        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        new Detective("Allyson", ruta, "Detective", inventario, false);

        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/despacho.jpg")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //primer texto

        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(750, 500);
        dialog1.setResizable(false);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("""
                "Al final decides abrir el mensaje anónimo; ya estás demasiado implicada, un poco más no hará daño.
                
                 **MENSAJE:**
                
                -Ven mañana al bosque detrás de la casa de Emily, sola, si quieres saber qué pasó.
                -M
                
                ¿De quién será este mensaje tan extraño? ¿Querrán ayudarme o será una trampa?
                """);
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(_ -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion10(){

        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        new Detective("Allyson", ruta, "Detective", inventario, false);

        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/BOSQUE.JPG")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //primer texto

        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(750, 500);
        dialog1.setResizable(false);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("""
                Llegaste al bosque. Notas una sensación extraña. Igual esto ha sido una mala idea...
                
                De pronto, escuchas un ruido detrás del arbusto que está justo detrás de ti.
                """);
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(_ -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void disparas(Pistola pistola){
        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        Detective Allysson= new Detective("Allyson", ruta, "Detective", inventario, false);

        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        if(pistola.isDisponible()){
           Allysson.dispararPistola(pistola);

        }else{
            JDialog dialog1 = new JDialog(frame, null, true);
            dialog1.setSize(750, 500);
            dialog1.setResizable(false);
            dialog1.setLayout(new BorderLayout());

            JTextArea mensaje1 = new JTextArea("¡¡OH NO!! ¡¡NO TENGO LA PISTOLA!!" );
            mensaje1.setEditable(false);
            mensaje1.setLineWrap(true);
            mensaje1.setWrapStyleWord(true);
            mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
            dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

            JButton botonCerrar1 = new JButton("Cerrar");
            botonCerrar1.addActionListener(_ -> dialog1.dispose());
            dialog1.add(botonCerrar1, BorderLayout.SOUTH);

            dialog1.setLocationRelativeTo(frame);
            dialog1.setVisible(true);
        }
    }

    public void Accion11(){

        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        new Detective("Allyson", ruta, "Detective", inventario, false);

        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/BOSQUE.JPG")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //primer texto

        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(750, 500);
        dialog1.setResizable(false);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("""
                "Del arbusto sale un conejo corriendo, muy asustado por el disparo... Menos mal que no le has llegado a dar. \s
                Cuando te acercas al arbusto de donde salió el conejo, ves que en el árbol de al lado hay una nota, posiblemente dejada por la persona a la que seguías. \s
                
                **NOTA:** \s
                *Hola, detective. Si quieres sabe qué le ha pasado a Emily, vuelva aquí mañana a la misma hora.*
                """);
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(_ -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion12(){

        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        new Detective("Allyson", ruta, "Detective", inventario, false);

        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/BOSQUE.JPG")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //primer texto

        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(750, 500);
        dialog1.setResizable(false);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("""
                Del arbusto sale un conejo corriendo, muy asustado por el disparo... Menos mal que no le has llegado a dar. \s
                Cuando te acercas al arbusto de donde salió el conejo, ves que en el árbol de al lado hay una nota, posiblemente dejada por la persona a la que seguías. \s
                
                **NOTA:** \s
                *Hola, detective. Si quiere saber qué le ha pasado a Emily, vuelva aquí mañana a la misma hora.*
                """);
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(_ -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion13(){

        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        new Detective("Allyson", ruta, "Detective", inventario, false);

        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/BOSQUE.JPG")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //primer texto

        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(750, 500);
        dialog1.setResizable(false);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("""
              "Al final decides hacerle caso a la nota de ayer y vas al lugar, tal y como se te pidió. Esperas no arrepentirte. \s
               \s
              **???**: Hola, detective Allysson. Me alegro de que haya venido. \s
               \s
              **Allysson**:Hola... Espera... Tú eres Mike, el amigo de Ryan... No entiendo, ¿qué haces tú aquí? \s
               \s
              **Mike**: Así es, soy yo, pero no podía mantenerme callado por mucho más tiempo. La verdad es que, en mi declaración a la policía, dije que Ryan estuvo conmigo el día de la muerte de Emily, pero no fue así. \s
               Él me pidió que mintiese por él, pero eso fue antes de saber lo que le había pasado a Emily. Cuando lo supe, la culpabilidad me estaba matando, y es cuando contacté con usted. \s
               \s
              La verdad es que Ryan es el asesino. Me lo confesó borracho el otro día... Dijo que estaba sin dinero y que, cuando se enteró de la herencia del abuelo de Emily, lo planeó todo. \s
               \s
             **Allysson**: Mike... Si lo que dices es cierto, esto podría ayudarme a detener a Ryan. Aunque primero tendré que ir a hablar con él y, después de su confesión, delatarle a la policía.
               \s""");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(_ -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion14(){

        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        new Detective("Allyson", ruta, "Detective", inventario, false);

        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/casaryan.png")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(new BorderLayout());
        frame.add(fondoPanel);

        frame.setVisible(true);

        //primer texto

        JDialog dialog1 = new JDialog(frame, null, true);
        dialog1.setSize(750, 500);
        dialog1.setResizable(false);
        dialog1.setLayout(new BorderLayout());

        JTextArea mensaje1 = new JTextArea("""
               "Ahora que sabes que Ryan es el asesino, tienes que ir con mucho cuidado para que no te pase nada malo a ti tampoco. \s
               \s
               Cuando llamas a la puerta, Ryan te recibe y te deja pasar. Nos sentamos en su sofá. \s
               \s
               **Allysson**: Bueno, Ryan, tengo algunas noticias sobre el caso de Emily... \s
               \s
               **Ryan**: ¿En serio? Menos mal, espero que pronto podáis hacer justicia. ¿Qué es lo nuevo que han descubierto? \s
               \s
               **Allysson**: No lo sé, Ryan, dímelo tú.
                ¿Merecía la pena la vida de Emily por un poco de dinero? \s
               \s
               Se hizo el silencio. \s
               \s
               **Ryan**: No sé de qué me está hablando, pero no me está gustando nada esta conversación. \s
               \s
               **Allysson**: No te hagas el tonto, ya sé que fuiste tú quien mató a Emily.
                Tengo pruebas, Ryan. \s
               \s
               **Ryan**: Vaya, Allysson... No me esperaba que lo consiguieses. Me temo que tendré que hacer algo contigo. Lo siento, me caías bien \s
               \s
               Tras decir eso, te levantas con la grabación de la conversación y te alejas de Ryan. Pero él saca un cuchillo de un cajón y se acerca a ti.
               \s
               \s""");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(_ -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void ganas(){

        UI menu= new UI();
        //FONFO DEL FRAME
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel fondoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/HAS_CONSEGUIDO.jpg")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        // Configurar el diseño del panel como GridBagLayout
        fondoPanel.setLayout(new GridBagLayout());

// Configurar el diseño del panel con restricciones
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 0, 20, 0); // Espaciado interno
        gbc.anchor = GridBagConstraints.CENTER; // Centrar componentes

// Crear y agregar el mensaje al panel
        JLabel texto = new JLabel("Te has defendido de Ryan y tras su paso por el hospital, has logrado encarcelarlo");
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.BOLD, 28));
        fondoPanel.add(texto, gbc);

// Crear y configurar el botón de volver al menú
        gbc.gridy++; // Siguiente fila
        JButton botonMenu = new JButton("Volver al menú");
        botonMenu.setPreferredSize(new Dimension(300, 80));
        botonMenu.setFont(new Font("Arial", Font.BOLD, 24));
        botonMenu.addActionListener(_ -> {
            menu.mostrarMenu(); // Regresar al menú principal
            frame.dispose(); // Cerrar la ventana actual
        });
        fondoPanel.add(botonMenu, gbc);


        // Agregar el panel al frame y hacerlo visible
        frame.add(fondoPanel);
        frame.setVisible(true);
    }

    public void decides(String nom) {
        // Crear el marco principal
        JFrame frame = new JFrame("Resultado Final");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Método auxiliar para configurar los paneles y mostrar mensajes
        Runnable mostrarResultado = () -> {
            JPanel fondoPanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    // Determinar qué imagen cargar según el resultado
                    String imagePath = nom.equals("Ryan") ? "/HAS_CONSEGUIDO.jpg" : "/NO_CONSEGUIDO.jpg";
                    ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource(imagePath)));
                    g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
                }
            };

            fondoPanel.setLayout(new BorderLayout());
            // Usar GridBagLayout para organizar los elementos
            fondoPanel.setLayout(new GridBagLayout());
            frame.setContentPane(fondoPanel); // Actualizar el panel de contenido del marco

            // Crear el diálogo con el mensaje adecuado
            JDialog dialog = new JDialog(frame, null, true);
            dialog.setSize(750, 500);
            dialog.setResizable(false);
            dialog.setLayout(new BorderLayout());
            // Configurar los constraints para los elementos
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(20, 0, 20, 0);
            gbc.anchor = GridBagConstraints.CENTER;

            // Determinar mensaje según el resultado
            String mensaje = nom.equals("Ryan")
                    ? "Genial Detective, has adivinado quién es el asesino."
                    : "Vaya... No has resuelto el caso, ese no es el asesino.";
            JLabel mensajeLabel = new JLabel(mensaje);
            mensajeLabel.setHorizontalAlignment(SwingConstants.CENTER);
            mensajeLabel.setFont(new Font("Verdana", Font.BOLD, 28));
            mensajeLabel.setForeground(Color.WHITE);
            fondoPanel.add(mensajeLabel, gbc);

            gbc.gridy++; // Cambiar a la siguiente fila
            JButton botonMenu = new JButton("Volver al menú");
            botonMenu.setPreferredSize(new Dimension(300, 80));
            botonMenu.setFont(new Font("Arial", Font.BOLD, 24));
            fondoPanel.add(botonMenu, gbc);

            botonMenu.addActionListener(_ -> {
                UI menu = new UI();
                menu.mostrarMenu();
                frame.dispose(); // Cerrar la ventana actual
            });
        };

        // Mostrar el resultado
        mostrarResultado.run();

        // Hacer visible el marco principal
        frame.setVisible(true);
    }

}
