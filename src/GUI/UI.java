package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import Backend.Game;
import Objetos.Pistola;


public class UI {

    Pistola pistola= new Pistola("pistola","Arma de la victima",false,true);

    public void mostrarMenu(){
        JFrame frame = new JFrame("Mistery Murder");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Fondo imagen
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/PANTALLA_TITULO.jpg"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0); // Espaciado entre componentes
        gbc.anchor = GridBagConstraints.CENTER;

        // Mensaje
        JLabel mensaje = new JLabel("Bienvenido al juego detective ¿Qué quieres hacer?");
        mensaje.setForeground(Color.WHITE); // Cambiar el color del texto
        mensaje.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(mensaje, gbc);

        // Botón "Jugar"
        gbc.gridy++;
        JButton btnIniciar = new JButton("Jugar");
        btnIniciar.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón
        btnIniciar.setFont(new Font("Arial", Font.BOLD, 24)); // Texto más grande
        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Cerrar el menú
                mostrarPantallaInicial();
            }
        });
        panel.add(btnIniciar, gbc);

        // Botón "Salir"
        gbc.gridy++;
        JButton btnSalir = new JButton("Salir");
        btnSalir.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón
        btnSalir.setFont(new Font("Arial", Font.BOLD, 24)); // Texto más grande
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Gracias por jugar.");
                System.exit(0); // Cerrar el juego
            }
        });
        panel.add(btnSalir, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }

    public void mostrarPantallaInicial(){
        //Se muestra el texto con lore, consigues movil(lees conver y tienes codigo)
        Game game= new Game();
        JFrame frame= new JFrame("Pantalla inicial");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/interrogatorio.jpg"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        //mejorar este texto con lore
        game.Accion1();
        JLabel texto= new JLabel(" ¿A quien vas a interrogar?");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints(); //PARA PONER LOS BOTONES GRANDES Y EN EL MEDIO HAY QUE UTILIZAR EL GRIDY
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0); // Espaciado entre componentes
        gbc.anchor = GridBagConstraints.CENTER;

        game.Accion2();
        gbc.gridy++;


        JButton botonJess = new JButton("Hablar con Jess");
        botonJess.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonJess.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonJess);

        JButton botonRyan = new JButton("Hablar con Ryan");
        botonRyan.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonRyan.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonRyan);

        botonJess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantJess();
                frame.dispose();
            }
        });

        botonRyan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantRyan();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
    public void mostrarPantJess(){
        //Te cuenta su parte de la historia
        JFrame frame= new JFrame("Pantalla Jess");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game= new Game();

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/interrogatorio.jpg"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        game.Accion3();

        JLabel texto= new JLabel("MMMM...Parece que el caso es mas complicado de lo que pensaba");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints(); //PARA PONER LOS BOTONES GRANDES Y EN EL MEDIO HAY QUE UTILIZAR EL GRIDY
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0); // Espaciado entre componentes
        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridy++;
        JButton boton1 = new JButton("Ir a la oficina");
        boton1.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        boton1.setFont(new Font("Arial", Font.BOLD, 24));

        panel.add(boton1);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantalla1();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
    public void mostrarPantRyan(){
        //Te cuenta su parte de la historia
        JFrame frame= new JFrame("Pantalla Ryan");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game= new Game();

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/interrogatorio.jpg"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        game.Accion4();


        JLabel texto= new JLabel("MMMM...Parece que el caso es mas complicado de lo que pensaba");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints(); //PARA PONER LOS BOTONES GRANDES Y EN EL MEDIO HAY QUE UTILIZAR EL GRIDY
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0); // Espaciado entre componentes
        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridy++;
        JButton boton1 = new JButton("Ir a la oficina");
        boton1.setBounds(50, 100, 150, 30);
        panel.add(boton1);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantalla1();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
    public void mostrarPantalla1(){
        //No sabes si volver a la escena del crimen
        //Vas (mostrarPantalla2a())
        //No vas(mostrarPantalla2b())

        JFrame frame= new JFrame("Pantalla 1");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game= new Game();

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/despacho.jpg"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        game.Accion5();

        JLabel texto= new JLabel("¿Volveras a la escena del crimen?");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());


        JButton botonsi = new JButton("Si vas");
        botonsi.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonsi.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonsi);

        JButton botonNo = new JButton("No vas");
        botonNo.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonNo.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonNo);

        botonsi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantalla2a();
                frame.dispose();
            }
        });
        botonNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantalla2b();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
    public  void mostrarPantalla2a(){
        //encuentras caja fuerte y usas el codigo
        //coges los papeles
        //coges pistola (mostrarPantalla3a())
        //no coges pistola (mostrarPantalla3a())

        JFrame frame= new JFrame("Pantalla 2a");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game= new Game();

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/casa.jpg"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        game.Accion6();

        JLabel texto= new JLabel("¿Qué hago?");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        JButton botonCoger = new JButton("Coges la pistola");
        botonCoger.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonCoger.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonCoger);

        JButton botonNoCoger = new JButton("No coges la pistola");
        botonNoCoger.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonNoCoger.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonNoCoger);

        botonCoger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.cogePistola(pistola);
                mostrarPantalla3a();
                frame.dispose();
            }
        });
        botonNoCoger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantalla3a();

                frame.dispose();
            }
        });

        frame.setVisible(true);


    }
    public  void mostrarPantalla2b(){
        //revisas de nuevo el movil encuentras un mail(papeles)
        //mostrarPantalla3b()

        JFrame frame= new JFrame("Pantalla 2b");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/despacho.jpg"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        Game game= new Game();

        game.Accion7();

        JLabel texto= new JLabel("Creo que si deberia abrirlo");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        JButton botonMensaje = new JButton("Abres el mensaje");
        botonMensaje.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonMensaje.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonMensaje);


        botonMensaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantalla3b();
                frame.dispose();
            }
        });
        frame.setVisible(true);

    }
    public  void mostrarPantalla3a(){
        //ves a una persona fuera
        //la sigues(mostrarPantalla4())
        //no la sigues(mostrarFinal())

        JFrame frame= new JFrame("Pantalla 3a");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/casa.jpg"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        Game game= new Game();

        game.Accion8();


        JLabel texto= new JLabel(" ¿Debería seguir a la persona?");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        JButton botonSeguir = new JButton("Le sigues");
        botonSeguir.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonSeguir.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonSeguir);

        JButton botonNoSeguir = new JButton("No le sigues");
        botonNoSeguir.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonNoSeguir.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonNoSeguir);

        botonSeguir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantalla4();
                frame.dispose();
            }
        });
        botonNoSeguir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFinal();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
    public  void mostrarPantalla3b(){
        //te llega un mensaje
        //vas (mostrarPantalla4())
        //no vas (mostrarFinal())

        JFrame frame= new JFrame("Pantalla 3b");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/oficina.jpg"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        Game game= new Game();
        game.Accion9();


        JLabel texto= new JLabel("¿Debería hacerle caso al mensaje?");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        JButton botonVas= new JButton("Vas al bosque");
        botonVas.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonVas.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonVas);

        JButton botonNoVas = new JButton("No vas al bosque");
        botonNoVas.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonNoVas.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonNoVas);

        botonVas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantalla4();
                frame.dispose();
            }
        });
        botonNoVas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFinal();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
    public  void mostrarPantalla4(){
        //has ido y ahora escuchas un ruido detras de un arbusto
        //decides disparar.TE QUEDAS SIN BALA (mostrarPantalla5a())
        //no disparas. SIGUES CON BALA (mostrarPantalla5b())
        //y si no hay pistola??????

        JFrame frame= new JFrame("Pantalla 4");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/BOSQUE.JPG"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        Game game= new Game();
        game.Accion10();


        JLabel texto= new JLabel("RAPIDO QUE HACES");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        JButton botonDisparas = new JButton("Disparas");
        botonDisparas.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonDisparas.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonDisparas);

        JButton botonNoDisparas = new JButton("No disparas");
        botonNoDisparas.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonDisparas.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonNoDisparas);

        botonDisparas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.disparas(pistola);
                mostrarPantalla5a();
                frame.dispose();
            }
        });
        botonNoDisparas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantalla5b();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
    public  void mostrarPantalla5a(){
        //era un conejo que sale corriendo por el disparo
        //encuentras una nota
        //vas (mostrarPantalla6())
        //no vas (mostrarfinal())

        JFrame frame= new JFrame("Pantalla 5a");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/BOSQUE.JPG"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);


        JLabel texto= new JLabel("Que deberia de hacer con esta información");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        JButton botonLeer = new JButton("vas ");
        botonLeer.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonLeer.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonLeer);

        JButton botonNoLeer = new JButton("No vas");
        botonNoLeer.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonLeer.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonLeer);

        botonLeer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantalla6();
                frame.dispose();
            }
        });
        botonNoLeer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFinal();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
    public  void mostrarPantalla5b(){
        //Sale un conejo del arbusto y ves la nota
        //vas (mostrarPantalla6())
        //no vas (mostrarfinal())

        JFrame frame= new JFrame("Pantalla 5b");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/BOSQUE.JPG"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);


        JLabel texto= new JLabel("Que susto solo era un conejo. espera... que es esa nota");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        JButton botonLeer = new JButton("vas ");
        botonLeer.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonLeer.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonLeer);

        JButton botonNoLeer = new JButton("No vas");
        botonNoLeer.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonLeer.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonLeer);

        botonLeer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantalla6();
                frame.dispose();
            }
        });
        botonNoLeer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFinal();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
    public  void mostrarPantalla6(){
        //has ido y te encuentras con mike que te cuenta lo que paso
        //mostrarPantalla7()

        JFrame frame= new JFrame("Pantalla 6");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/BOSQUE.JPG"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);


        JLabel texto= new JLabel("Llegue al sitio y estaba... MIKE!!! (te cuenta el lore)");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        JButton botonir = new JButton("Vas a ver a Ryan");
        botonir.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonir.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonir);



        botonir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantalla7();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
    public  void mostrarPantalla7(){
        //has ido a hablar con ryan para confrontarle pero te ataca
        //usas pistola (mostrarPantalla8())
        //no la usas(no la tienes, no quieres, no tienes bala)-mostrarPantExtra()

        JFrame frame= new JFrame("Pantalla 7");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/casaryan.png"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);


        JLabel texto= new JLabel("OH NO... el maldito ryan me ha atacado que hago??");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        JButton botonDefenderte = new JButton("Defenderte con pistola");
        botonDefenderte.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonDefenderte.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonDefenderte);

        JButton botonNoDefenderte = new JButton("No te defiendes");
        botonNoDefenderte.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonNoDefenderte.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonNoDefenderte);

        botonDefenderte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantalla8();
                frame.dispose();
            }
        });
        botonNoDefenderte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPantaExtra();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
    public  void mostrarPantalla8(){
        //te defiendes y has ganado. detienes a ryan
        JFrame frame= new JFrame("Pantalla 8");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(getClass().getResource("/HAS_CONSEGUIDO.jpg"));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);


        JLabel texto= new JLabel("TE HAS DEFENDIDIO Y GANAS OLE OLE");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        JButton botonMenu = new JButton("Volver al menu");
        botonMenu.setBounds(50, 100, 150, 30);
        panel.add(botonMenu);


        botonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarMenu();
                frame.dispose();
            }
        });


        frame.setVisible(true);
    }
    public  void mostrarFinal(){
        //tienes que escribir el nombre del asesino

        //FALTA AÑADIR DONDE TE DICE SI GANAS O PIERDES PERO SE TIENE QUE HACER CUANDO TENGAMOS EL BACKEND LISTO
        //ganas o pierdes

        final String[] nom={""};

        JFrame frame= new JFrame("Pantalla Final");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(panel);


        JLabel texto= new JLabel("Llegaste al final, quien crees que ha matado a emily carter??");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        JTextField textField = new JTextField();
        textField.setBounds(50, 60, 200, 25);
        frame.add(textField);
        textField.setMaximumSize(new Dimension(300, 25));
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(textField);

        JButton button = new JButton("Guardar");
        button.setBounds(50, 100, 100, 30);
        frame.add(button);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button);

        JButton botonMenu = new JButton("Volver al menu");
        botonMenu.setBounds(50, 150, 150, 30);
        botonMenu.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(botonMenu);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nom[0]= textField.getText();
                JOptionPane.showMessageDialog(frame, "Asesino elegido: " + nom[0]);
                frame.dispose();
            }
        });


        botonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarMenu();

                frame.dispose();
            }
        });


        frame.setVisible(true);
    }
    public  void mostrarPantaExtra(){
        //no te has podido defender y mueres dejando el caso sin resolver

        JFrame frame= new JFrame("Pantalla Extra");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);


        JLabel texto= new JLabel("QUE TE HAN MATADO Y NO SABES NA ");
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));// Estilo de la fuente
        panel.add(texto);
        panel.setLayout(new GridBagLayout());

        JButton botonMenu = new JButton("Volver al menu");
        botonMenu.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonMenu.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonMenu);


        botonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarMenu();
                frame.dispose();
            }
        });


        frame.setVisible(true);
    }
}
