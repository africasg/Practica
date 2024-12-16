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

    public void Accion1(){
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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/escena1.jpg"));
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

        JTextArea mensaje1 = new JTextArea("Bienvenida detective Allysson, necesitamos que investigues este caso de asesinato\n" +
                "De momento lo único que sabemos es que la víctima es Emily Carter, una estudiante universitaria. La reportaron como desaparecida en el trabajo y al" +
                "llegar a su casa nos la encontramos así en el baño.\n" +
                "La última persona en verla con vida fue su amiga Jessica Smith. Además la víctima tenía un novio llamado Ryan white. Ambos tienen coartadas\n" +
                "Puedes investigar un poco más la zona a ver si encuentras alguna pista de utilidad. ");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
        botonesPanel.add(botonCerrar1);

        dialog1.add(botonesPanel, BorderLayout.SOUTH);


        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);

    }

    public void Accion2(){
        //objeto movil
        Objeto movil= new Objeto("Movil","Movil de la victima.",true);
        ImageIcon iconomovil= new ImageIcon(getClass().getResource("/telefono_juego.png"));

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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/escena1.jpg"));
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

        JTextArea mensaje1 = new JTextArea("Decides dar una vuelta por la casa a investigar la escena. Encuentras el movil de la victima y te lo guardas como pista\n" +
                "Cuando enciendes el movil empiezas a buscar algo que te pueda decir que le paso a Emily carter y ahi encuentras una conversacion entre ella y su amiga Jess\n" +
                "Parece una discusion entre ambas por... Ryan. En el mensaje Jess amenazaba a Emily por haber empezado a salir con el chico que la gustaba\n " +
                "Esto es una gran pista. Jess pudo haber hecho daño a Emily por celos. Ademas de eso encuentras en la aplicacion de notas un codigo (40605) me pregunto que podre hacer con el.");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
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
        JLabel mensaje2 = new JLabel("Has obtenido un movil!!!");
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
        //FALTA AÑADIR A JESSICA PARA QUE APAREZCA SU PERSONAJE
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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/interrogatorio.jpg"));
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

        JTextArea mensaje1 = new JTextArea("Decides ir a interrogar a Jessica, tiene mucho en contra suya por el momento\n\n" +
                "Detective Allyson: Bueno Jessica me gustaria Hablar contigo sobre tu amiga Emily, como ya sabes ha aparecido muerta en su casa y tengo motivos para pensar que has sido tu\n\n" +
                "Jessica Smith: ESTAS LOCA??? YO JAMAS LE HARIA DAÑO A EMILY!!!!\n\n" +
                "Detective Allysson: Tengo una conversacion en el movil de la victima donde la amenazabas por salir con el chico que te gustaba...\n\n" +
                "Jessica Smith: Eso... Fue una pelea tonta nada mas, ella sabia que a mi me gustaba Ryan desde mucho antes y aun asi decidio salir con él... Pero no paso nada más que esa conversacion, al final hicimos las paces. Era mi mejor amiga...\n\n" +
                "Detective Allysson: Bueno esto es suficiente por hoy Jessica muchas gracias por tu testimonio. ");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion4(){
    //FALTA AÑADIR A RYAN PARA QUE APAREZCA SU PERSONAJE
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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/interrogatorio.jpg"));
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

        JTextArea mensaje1 = new JTextArea("Decides ir a interrogar a Ryan el novio de Emily, a ver si puede aclararte un poco la relación entre ambas chicas.\n\n" +
                "Detective Allyson: Hola Ryan gracias por venir, como sabes estoy investigando la muerte de tu novia Emily. He encontrado algo y me gustaria que me aclarases una cosa.\n\n" +
                "Ryan White: Por supuesto detective, hare lo que sea con tal de saber quien le hizo esto a mi pobre Emily...\n\n" +
                "Detective Allysson: Tengo una conversacion en el movil de la victima donde Jessica y Emily discutian por ti, me gustaria saber como era su relacion ultimamente.\n\n" +
                "Ryan White: ESA LOCA DE JESSICA!!! Ella y Emily ultimamente no se juntaban mucho porque Jessica estaba obsesionada conmigo...\n\n" +
                "Detective Allysson: OH? Muchas gracias por esta informacion me ayudara mucho con la investigacion");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion5(){

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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/despacho.jpg"));
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

        JTextArea mensaje1 = new JTextArea("Ahora tengo un poco mas de informacion sobre el caso, pero no creo que sea suficiente.\n" +
                "Es un poco tarde para ir sola a la escena del crimen y ademas podria ser peligroso, pero necesito encontrar algo mas... algo que me diga quien le hizo esto a Emily Carter");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
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
        ImageIcon iconopapelesOriginal= new ImageIcon(getClass().getResource("/papeles.jpg"));
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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/casa.jpg"));
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

        JTextArea mensaje1 = new JTextArea("No deberia de estar aqui... Pero tengo que encontrar alguna pista importante que me ayude con el caso. Mirare en la habitacion de la victima, la ultima vez no pude entrar en ella por culpa de la policia\n\n" +
                "Al entrar empiezas a mirar por todas partes... hasta que abres el armario y encuentras una caja fuerte que parece cerrada, al parecer necesita un codigo de 5 digitos.\n" +
                "¡YA LO TENGO, USARE EL CODIGO QUE HABIA EN EL MOVIL DE EMILY!\n\n" +
                "La caja fuerte se ha abierto y dentro encuentras un par de objetos. Primero coges unos papeles que parecen el testamento de alguien. Parece que el abuelo de Emily murio hace poco y le dejo una gran suma de dinero como herencia, interesante.\n" +
                "Debajo de los papeles parece haber algo mas... es una pistola... Estara bien si me la llevo?");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
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

        JLabel mensaje2 = new JLabel("Has obtenido unos papeles muy importantes para la victima!!!");
        mensaje2.setFont(new Font("Verdana", Font.PLAIN, 16));
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

    public void cogePistola(Pistola pistola){

        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        Detective Allysson= new Detective("Allyson", ruta, "Detective", inventario, false);

        ImageIcon iconopapelesOriginal= new ImageIcon(getClass().getResource("/pistola_juego.png"));
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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/casa.jpg"));
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
        JLabel mensaje2 = new JLabel("Has obtenido una pistola!!!");

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



    public void Accion7(){

        //objeto detective allyson
        String ruta="imagen_Allyson.png";
        List<Objeto> inventario=new ArrayList<>();
        Detective Allysson= new Detective("Allyson", ruta, "Detective", inventario, false);

        //Objeto papeles
        Objeto papeles= new Objeto("Papeles","Herencia del abuelo de la victima",true);
        ImageIcon iconopapelesOriginal= new ImageIcon(getClass().getResource("/telefono_juego.png"));
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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/despacho.jpg"));
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

        JTextArea mensaje1 = new JTextArea("Realmente creo que seria demasiado peligroso volver a la escena del crimen, ademas podría meterme en lios si alguien me pilla ahí.\n" +
                "Despues de darle unas vueltas decido tirar de las pistas que ya tengo y repasar algo que haya podido pasar por alto\n\n" +
                "Al final acabo revisando el movil de Emily otra vez, al meterme en sus mails encuentro uno reciente donde a la victima se le había entregado una gran cantidad de dinero por una herencia de su abuelo\n" +
                "Será este el motivo real por el asesinato de Emily Carter...\n" +
                "Mientras estaba dandole vueltas a la nueva información ocurrio algo sorprendente... Alguien le acababa de mandar un mensaje anonimo al movil de la victima!!!\n" +
                "Igual deberia de abrirlo para ver si me puede ayudar con el caso, pero si por el contrario no es nada relacionado con el asesinato habre manipulado una pista para nada.....");
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);


        //Segundo dialogo
        JDialog dialog2 = new JDialog(frame, null, true);
        dialog2.setSize(750, 500);
        dialog2.setResizable(false);
        dialog2.setLayout(new BorderLayout());

        JLabel iconoLabel = new JLabel(iconopapeles);
        JLabel mensaje2 = new JLabel("Has obtenido unos papeles muy importantes \n para la victima!!!");

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

    public void Accion8(){

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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/casa.jpg"));
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

        JTextArea mensaje1 = new JTextArea("Tras andar un poco mas por la casa escuchas un fuerte golpe fuera\n" +
                "Corriendo te acercas a la ventana mas cercana al ruido y ves una silueta mirando a la casa, pero enseguida sale corriendo hacia el bosque...\n" +
                "Creo que es demasiado arriesgado seguir a la persona de negro pero esto podría ser una gran pista." );
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion9(){

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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/despacho.jpg"));
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

        JTextArea mensaje1 = new JTextArea("Al final has decidido abrir el mensaje anonimo, ya estas demasiado implicada un poco mas no puede doler.\n\n" +
                "MENSAJE:\n\n" +
                "Ven mañana al bosque detras de la casa de Emily sola si quieres saber que paso.\n\n" +
                "De quien sera este mensaje tan extraño? Querran ayudarme o sera una trampa?" );
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion10(){

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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/BOSQUE.JPG"));
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

        JTextArea mensaje1 = new JTextArea("Despues de seguir a la figura la pierdes de vista al entrar al bosque, igual esto ha sido una mala idea...\n" +
                "De pronto escuchas un ruido detras del arbusto de detras tuya!!!" );
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public int disparas(Pistola pistola){
        int disparo=0;
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
          disparo =1;
          return disparo;

        }else{
            JDialog dialog1 = new JDialog(frame, null, true);
            dialog1.setSize(750, 500);
            dialog1.setResizable(false);
            dialog1.setLayout(new BorderLayout());

            JTextArea mensaje1 = new JTextArea("OH NO NO TENGO LA PISTOLA!!" );
            mensaje1.setEditable(false);
            mensaje1.setLineWrap(true);
            mensaje1.setWrapStyleWord(true);
            mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
            dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

            JButton botonCerrar1 = new JButton("Cerrar");
            botonCerrar1.addActionListener(e -> dialog1.dispose());
            dialog1.add(botonCerrar1, BorderLayout.SOUTH);

            dialog1.setLocationRelativeTo(frame);
            dialog1.setVisible(true);
            return disparo;
        }
    }

    public void Accion11(){

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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/BOSQUE.JPG"));
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

        JTextArea mensaje1 = new JTextArea("Del arbusto sale un conejo corriendo muy asustado por el disparo... menos mal que no le he llegado a dar.\n" +
                "Cuando te acercas al arbusto de donde salio el conejo ves que en el arbol de al lado hay una nota, posiblemente dejada por la persona a la que seguia.\n\n" +
                "NOTA:\n" +
                "Hola detective si quieres saber que le ha pasado a Emily vuelve aqui mañana a la misma hora." );
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion12(){

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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/BOSQUE.JPG"));
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

        JTextArea mensaje1 = new JTextArea("Del arbusto sale un conejo corriendo, menos mal que no he disparado... \n" +
                "Cuando te acercas al arbusto de donde salio el conejo ves que en el arbol de al lado hay una nota, posiblemente dejada por la persona a la que seguia.\n\n" +
                "NOTA:\n" +
                "Hola detective si quieres saber que le ha pasado a Emily vuelve aqui mañana a la misma hora." );
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion13(){

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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/BOSQUE.JPG"));
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

        JTextArea mensaje1 = new JTextArea("Al final decidi hacerle caso a la nota de ayer y he venido aqui tal y como me ha pedido, espero no arrepentirme\n\n" +
                "???: Hola detective Alysson me alegro de que hayas venido.\n\n" +
                "Alysson: Espera... tu eres Mike el amigo de Ryan... No entiendo, que haces tu aqui.\n\n" +
                "Mike:Asies soy yo, pero no podia mantenerme callado por mucho mas. La verdad es que en mi declaracion a la policia dije que Ryan estuvo conmigo el dia de la muerte de Emily pero no fue asi\n" +
                "El me pidio que mintiese por el, pero eso fue antes de saber lo que le habia pasado a Emily. Cuando lo supe la culpabilidad me estaba matando y es cuando contacte contigo.\n" +
                "La verdad es que Ryan es el asesino, me lo confeso borracho el otro dia... Dijo que estaba sin dinero y que cuando se entero de lo de la herencia del abuelo de Emily lo planeo todo.\n\n" +
                "Allysson: Mike... si lo que dices es cierto... esto podria ayudarme a detener a Ryan aunque primero tendria que ir a hablar con el y despues de su confesión delatarle a la policia." );
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void Accion14(){

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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/BOSQUE.JPG"));
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

        JTextArea mensaje1 = new JTextArea("Ahora que se que Ryan es el asesino tengo que ir con mucho cuidado para que no me pase nada malo a mi tampoco\n\n" +
                "Cuando llamo a la puerta Ryan me recibe y deja pasar, nos sentamos en su sofa.\n" +
                "Allysson: Bueno Ryan tengo algunas noticias sobre el caso de Emily...\n\n" +
                "Ryan:Enserio??? menos mal, espero que pronto podais hacer justicia. Que es lo nuevo que has descubierto?\n\n" +
                "Allysson: No se Ryan dimelo tu, merecia la pena la vida de Emily por un poco de dinero??\n\n" +
                "Se hizo el silencio.\n" +
                "Ryan:No se de que me estas hablando y no me gustan estas acusaciones.\n\n" +
                "Allysson: No te hagas el tonto, ya se que fuiste tu el que mato a la victima y tengo pruebas Ryan.\n\n" +
                "Ryan:Vaya Allysson no me esperaba que lo consiguieses... me temo que tendre que hacer algo contigo.\n\n" +
                "Tras decir eso Allysson se levanta con la grabacion de la conversacion y se aleja de Ryan pero este saca un cuchillo de un cajon y se acerca a la detective\n" );
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
    }

    public void ganas(){

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
                ImageIcon fondo = new ImageIcon(getClass().getResource("/HAS_CONSEGUIDO.jpg"));
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

        JTextArea mensaje1 = new JTextArea("Conseguiste defenderte usando la pistola de la victima, gracias a la grabación que hiciste la policia pudo detener a Ryan despues de ser dado de alta en el hospital por el disparo\n\n" +
                "GENIAL DETECTIVE LO CONSEGUISTE" );
        mensaje1.setEditable(false);
        mensaje1.setLineWrap(true);
        mensaje1.setWrapStyleWord(true);
        mensaje1.setFont(new Font("Verdana", Font.PLAIN, 24));
        dialog1.add(new JScrollPane(mensaje1), BorderLayout.CENTER);

        JButton botonCerrar1 = new JButton("Cerrar");
        botonCerrar1.addActionListener(e -> dialog1.dispose());
        dialog1.add(botonCerrar1, BorderLayout.SOUTH);

        dialog1.setLocationRelativeTo(frame);
        dialog1.setVisible(true);
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
                    ImageIcon fondo = new ImageIcon(getClass().getResource(imagePath));
                    g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
                }
            };

            fondoPanel.setLayout(new BorderLayout());
            frame.setContentPane(fondoPanel); // Actualizar el panel de contenido del marco

            // Crear el diálogo con el mensaje adecuado
            JDialog dialog = new JDialog(frame, null, true);
            dialog.setSize(750, 500);
            dialog.setResizable(false);
            dialog.setLayout(new BorderLayout());

            // Determinar mensaje según el resultado
            String mensaje = nom.equals("Ryan")
                    ? "Genial Detective, has adivinado quién es el asesino."
                    : "Vaya... No has resuelto el caso, ese no es el asesino.";
            JTextArea mensajeArea = new JTextArea(mensaje);
            mensajeArea.setEditable(false);
            mensajeArea.setLineWrap(true);
            mensajeArea.setWrapStyleWord(true);
            mensajeArea.setFont(new Font("Verdana", Font.PLAIN, 24));
            dialog.add(new JScrollPane(mensajeArea), BorderLayout.CENTER);

            // Botón para cerrar el diálogo
            JButton botonCerrar = new JButton("Cerrar");
            botonCerrar.addActionListener(e -> dialog.dispose());
            dialog.add(botonCerrar, BorderLayout.SOUTH);

            dialog.setLocationRelativeTo(frame); // Centrar el diálogo en el marco
            dialog.setVisible(true);
        };

        // Mostrar el resultado
        mostrarResultado.run();

        // Hacer visible el marco principal
        frame.setVisible(true);
    }

}
