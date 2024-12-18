package GUI;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import Backend.Game;
import Objetos.Pistola;

public class UI {

    Pistola pistola = new Pistola("pistola", "Arma de la victima", false, true);

   
    public void mostrarMenu() {
        JFrame frame = new JFrame("Mistery Murder");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Fondo imagen (Metodo extraído)
        JPanel panel = getjPanel();

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

        // Botón Jugar
        gbc.gridy++;
        JButton btnIniciar = new JButton("Jugar");
        btnIniciar.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón
        btnIniciar.setFont(new Font("Arial", Font.BOLD, 24)); // Texto más grande
        btnIniciar.addActionListener(_ -> {
            frame.dispose(); // Cerrar el menú
            mostrarPantallaInicial();
        });
        panel.add(btnIniciar, gbc);

        // Botón Salir
        gbc.gridy++;
        JButton btnSalir = new JButton("Salir");
        btnSalir.setPreferredSize(new Dimension(300, 80));
        btnSalir.setFont(new Font("Arial", Font.BOLD, 24));
        btnSalir.addActionListener(_ -> {
            JOptionPane.showMessageDialog(frame, "Gracias por jugar.");
            System.exit(0); // Cerrar el juego
        });
        panel.add(btnSalir, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }

    private JPanel getjPanel() {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/PANTALLA_TITULO.jpg")));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(new GridBagLayout());
        return panel;
    }

    public void mostrarPantallaInicial() {
        //Se muestra el texto con lore, consigues movil(lees conver y tienes codigo)
        Game game = new Game();
        JFrame frame = new JFrame("Pantalla inicial");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/interrogatorio.jpg")));
                Image img = fondo.getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);


        game.Accion1();
        JLabel textoCentrado = Paneles.crearTextoCentrado(
                "¿A quién vas a interrogar?",
                24, // Tamaño de la fuente
                Color.WHITE // Color del texto
        );
        panel.setLayout(new GridBagLayout());
        panel.add(textoCentrado);


        GridBagConstraints gbc = new GridBagConstraints(); //PARA PONER LOS BOTONES GRANDES Y EN EL MEDIO HAY QUE UTILIZAR EL GRIDY
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        game.Accion2();
        gbc.gridy++;


        JButton botonJess = new JButton("Hablar con Jess");
        botonJess.setPreferredSize(new Dimension(300, 80));
        botonJess.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonJess);

        JButton botonRyan = new JButton("Hablar con Ryan");
        botonRyan.setPreferredSize(new Dimension(300, 80));
        botonRyan.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonRyan);

        botonJess.addActionListener(_ -> {
            mostrarPantJess();
            frame.dispose();
        });

        botonRyan.addActionListener(_ -> {
            mostrarPantRyan();
            frame.dispose();
        });

        frame.setVisible(true);
    }

    public void mostrarPantJess() {
        //Te cuenta su parte de la historia
        JFrame frame = new JFrame("Pantalla Jess");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game = new Game();

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/interrogatorio.jpg")));
                Image img = fondo.getImage();

                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        game.Accion3();

        // Crear y agregar el texto al panel
        JLabel textoCentrado = Paneles.crearTextoCentrado(
                "MMMM...Parece que el caso es más complicado de lo que pensabas",
                24, // Tamaño de la fuente
                Color.WHITE // Color del texto
        );
        panel.setLayout(new GridBagLayout());
        panel.add(textoCentrado);


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridy++;
        JButton boton1 = new JButton("Ir a la oficina");
        boton1.setPreferredSize(new Dimension(300, 80));
        boton1.setFont(new Font("Arial", Font.BOLD, 24));

        panel.add(boton1);

        boton1.addActionListener(
                _ -> {
                    mostrarPantalla1();
                    frame.dispose();
                });

        frame.setVisible(true);
    }

    public void mostrarPantRyan() {
        //Te cuenta su parte de la historia
        JFrame frame = new JFrame("Pantalla Ryan");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game = new Game();

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/interrogatorio.jpg")));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        game.Accion4();


        JLabel textoCentrado = Paneles.crearTextoCentrado(
                "MMMM...Parece que el caso es más complicado de lo que pensabas",
                24, // Tamaño de la fuente
                Color.WHITE // Color del texto
        );
        panel.setLayout(new GridBagLayout());
        panel.add(textoCentrado);


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridy++;
        JButton boton1 = new JButton("Ir a la oficina");
        boton1.setPreferredSize(new Dimension(300, 80));
        boton1.setFont(new Font("Arial", Font.BOLD, 24));

        panel.add(boton1);

        boton1.addActionListener(e -> {
            mostrarPantalla1();
            frame.dispose();
        });

        frame.setVisible(true);
    }

    public void mostrarPantalla1() {
        //No sabes si volver a la escena del crimen
        //Vas (mostrarPantalla2a())
        //No vas(mostrarPantalla2b())

        JFrame frame = new JFrame("Pantalla 1");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game = new Game();

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/despacho.jpg")));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        game.Accion5();

        JLabel textoCentrado = Paneles.crearTextoCentrado(
                "¿Volverás a la escena del crimen?",
                24, // Tamaño de la fuente
                Color.WHITE // Color del texto
        );
        panel.setLayout(new GridBagLayout());
        panel.add(textoCentrado);


        JButton botonsi = new JButton("Volver");
        botonsi.setPreferredSize(new Dimension(300, 80));
        botonsi.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonsi);

        JButton botonNo = new JButton("No volver");
        botonNo.setPreferredSize(new Dimension(300, 80));
        botonNo.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonNo);

        botonsi.addActionListener(e -> {
            mostrarPantalla2a();
            frame.dispose();
        });
        botonNo.addActionListener(e -> {
            mostrarPantalla2b();
            frame.dispose();
        });

        frame.setVisible(true);
    }

    public void mostrarPantalla2a() {
        //encuentras caja fuerte y usas el codigo
        //coges los papeles
        //coges pistola (mostrarPantalla3a())
        //no coges pistola (mostrarPantalla3a())

        JFrame frame = new JFrame("Pantalla 2a");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Game game = new Game();

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/casa.jpg")));
                Image img = fondo.getImage();

                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        game.Accion6();

        // Crear y agregar el texto al panel
        JLabel textoCentrado = Paneles.crearTextoCentrado(
                "¿Que harás?",
                24, // Tamaño de la fuente
                Color.WHITE // Color del texto
        );
        panel.setLayout(new GridBagLayout());
        panel.add(textoCentrado);


        JButton botonCoger = new JButton("Coges la pistola");
        botonCoger.setPreferredSize(new Dimension(300, 80));
        botonCoger.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonCoger);

        JButton botonNoCoger = new JButton("No coges la pistola");
        botonNoCoger.setPreferredSize(new Dimension(300, 80));
        botonNoCoger.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonNoCoger);

        botonCoger.addActionListener(e -> {
            game.cogePistola(pistola);
            mostrarPantalla3a();
            frame.dispose();
        });
        botonNoCoger.addActionListener(e -> {
            mostrarPantalla3a();

            frame.dispose();
        });

        frame.setVisible(true);


    }

    public void mostrarPantalla2b() {
        //revisas de nuevo el movil encuentras un mail(papeles)
        //mostrarPantalla3b()

        JFrame frame = new JFrame("Pantalla 2b");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/despacho.jpg")));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        Game game = new Game();

        game.Accion7();

        // Crear y agregar el texto al panel
        JLabel textoCentrado =Paneles.crearTextoCentrado(
                "Creo que sí debería abrir el mensaje",
                24, // Tamaño de la fuente
                Color.WHITE // Color del texto
        );
        panel.setLayout(new GridBagLayout());
        panel.add(textoCentrado);


        JButton botonMensaje = new JButton("*Abrir mensaje*");
        botonMensaje.setPreferredSize(new Dimension(300, 80)); // Tamaño del botón boton
        botonMensaje.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonMensaje);


        botonMensaje.addActionListener(e -> {
            mostrarPantalla3b();
            frame.dispose();
        });
        frame.setVisible(true);

    }

    public void mostrarPantalla3a() {
        //ves a una persona fuera
        //la sigues(mostrarPantalla4())
        //no la sigues(mostrarFinal())

        JFrame frame = new JFrame("Pantalla 3a");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/casa.jpg")));
                Image img = fondo.getImage();

                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        Game game = new Game();

        game.Accion8();


        // Crear y agregar el texto al panel
        JLabel textoCentrado = Paneles.crearTextoCentrado(
                "¿Seguirás a la persona?",
                24, // Tamaño de la fuente
                Color.WHITE // Color del texto
        );
        panel.setLayout(new GridBagLayout());
        panel.add(textoCentrado);

        JButton botonSeguir = new JButton("Le sigues");
        botonSeguir.setPreferredSize(new Dimension(300, 80));
        botonSeguir.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonSeguir);

        JButton botonNoSeguir = new JButton("No le sigues");
        botonNoSeguir.setPreferredSize(new Dimension(300, 80));
        botonNoSeguir.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonNoSeguir);

        botonSeguir.addActionListener(e -> {
            mostrarPantalla4();
            frame.dispose();
        });
        botonNoSeguir.addActionListener(e -> {
            mostrarFinal();
            frame.dispose();
        });

        frame.setVisible(true);
    }

    public void mostrarPantalla3b() {
        //te llega un mensaje
        //vas (mostrarPantalla4())
        //no vas (mostrarFinal())

        JFrame frame = new JFrame("Pantalla 3b");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/despacho.jpg")));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        Game game = new Game();
        game.Accion9();

        JLabel textoCentrado = Paneles.crearTextoCentrado(
                "¿Le harás caso al mensaje?",
                24, // Tamaño de la fuente
                Color.WHITE // Color del texto
        );
        panel.setLayout(new GridBagLayout());
        panel.add(textoCentrado);


        JButton botonVas = new JButton("Ir al bosque");
        botonVas.setPreferredSize(new Dimension(300, 80));
        botonVas.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonVas);

        JButton botonNoVas = new JButton("No ir al bosque");
        botonNoVas.setPreferredSize(new Dimension(300, 80));
        botonNoVas.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonNoVas);

        botonVas.addActionListener(e -> {
            mostrarPantalla4();
            frame.dispose();
        });
        botonNoVas.addActionListener(e -> {
            mostrarFinal();
            frame.dispose();
        });

        frame.setVisible(true);
    }

    public void mostrarPantalla4() {
        //has ido y ahora escuchas un ruido detras de un arbusto
        //decides disparar.TE QUEDAS SIN BALA (mostrarPantalla5a())
        //no disparas. SIGUES CON BALA (mostrarPantalla5b())
        //y si no hay pistola??????


        JFrame frame = new JFrame("Pantalla 4");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/BOSQUE.JPG")));
                Image img = fondo.getImage();

                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        Game game = new Game();
        game.Accion10();

        JLabel textoCentrado = Paneles.crearTextoCentrado(
                "¡OH NO! ¿Que harás?",
                24, // Tamaño de la fuente
                Color.WHITE // Color del texto
        );
        panel.setLayout(new GridBagLayout());
        panel.add(textoCentrado);


        JButton botonDisparas = new JButton("DISPARAR");
        botonDisparas.setPreferredSize(new Dimension(300, 80));
        botonDisparas.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonDisparas);

        JButton botonNoDisparas = new JButton("NO DISPARAR");
        botonNoDisparas.setPreferredSize(new Dimension(300, 80));
        botonNoDisparas.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonNoDisparas);

        botonDisparas.addActionListener(e -> {

            if (!pistola.isDisponible()) {
                mostrarPantalla5b();
            } else if (!pistola.tieneBala()) {
                mostrarPantalla5b();
            } else {
                game.disparas(pistola);
                mostrarPantalla5a();
            }

            frame.dispose();
        });
        botonNoDisparas.addActionListener(e -> {
            mostrarPantalla5b();
            frame.dispose();
        });

        frame.setVisible(true);
    }

    public void mostrarPantalla5a() {
        //era un conejo que sale corriendo por el disparo
        //encuentras una nota
        //vas (mostrarPantalla6())
        //no vas (mostrarfinal())

        JFrame frame = new JFrame("Pantalla 5a");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/BOSQUE.JPG")));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        Game game = new Game();
        game.Accion11();

        JLabel textoCentrado = Paneles.crearTextoCentrado(
                "¿Que harás con esta información? ¿Volverás aquí mañana?",
                24, // Tamaño de la fuente
                Color.WHITE // Color del texto
        );
        panel.setLayout(new GridBagLayout());
        panel.add(textoCentrado);

        JButton botonLeer = new JButton("Volveré");
        botonLeer.setPreferredSize(new Dimension(300, 80));
        botonLeer.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonLeer);

        JButton botonNoLeer = new JButton("No volveré");
        botonNoLeer.setPreferredSize(new Dimension(300, 80));
        botonLeer.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonLeer);

        botonLeer.addActionListener(e -> {
            mostrarPantalla6();
            frame.dispose();
        });
        botonNoLeer.addActionListener(e -> {
            mostrarFinal();
            frame.dispose();
        });

        frame.setVisible(true);
    }

    public void mostrarPantalla5b() {
        //Sale un conejo del arbusto y ves la nota
        //vas (mostrarPantalla6())
        //no vas (mostrarfinal())

        JFrame frame = new JFrame("Pantalla 5b");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/BOSQUE.JPG")));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        Game game = new Game();
        game.Accion12();

        JLabel textoCentrado = Paneles.crearTextoCentrado(
                "¿Que harás con esta información? ¿Volverás aquí mañana?",
                24, // Tamaño de la fuente
                Color.WHITE // Color del texto
        );
        panel.setLayout(new GridBagLayout());
        panel.add(textoCentrado);

        JButton botonLeer = new JButton(" Volveré ");
        botonLeer.setPreferredSize(new Dimension(300, 80));
        botonLeer.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonLeer);

        JButton botonNoLeer = new JButton("No volveré");
        botonNoLeer.setPreferredSize(new Dimension(300, 80));
        botonLeer.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonNoLeer);

        botonLeer.addActionListener(e -> {
            mostrarPantalla6();
            frame.dispose();
        });
        botonNoLeer.addActionListener(e -> {
            mostrarFinal();
            frame.dispose();
        });

        frame.setVisible(true);
    }

    public void mostrarPantalla6() {
        //has ido y te encuentras con mike que te cuenta lo que paso
        //mostrarPantalla7()

        JFrame frame = new JFrame("Pantalla 6");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/BOSQUE.JPG")));
                Image img = fondo.getImage();
                // Dibujar la imagen en el panel
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        frame.add(panel);

        Game game = new Game();
        game.Accion13();

        JLabel textoCentrado = Paneles.crearTextoCentrado(
                "Esto lo cambia todo, necesito una confesión por su parte.",
                24, // Tamaño de la fuente
                Color.WHITE // Color del texto
        );
        panel.setLayout(new GridBagLayout());
        panel.add(textoCentrado);

        JButton botonir = new JButton("Vas a ver a Ryan");
        botonir.setPreferredSize(new Dimension(300, 80));
        botonir.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonir);


        botonir.addActionListener(e -> {
            mostrarPantalla7();
            frame.dispose();
        });

        frame.setVisible(true);
    }

    public void mostrarPantalla7() {

        JFrame frame = new JFrame("Pantalla 7");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/casaryan.png")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(new GridBagLayout());


        Game game = new Game();
        game.Accion14();

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 0, 20, 0);
        gbc.anchor = GridBagConstraints.CENTER;


        // Etiqueta de texto
        JLabel texto = new JLabel("Estoy en graves problemas, ¿Qué hago?");
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.PLAIN, 24));

        // Botones
        JButton botonDefenderte = new JButton("Defenderte con pistola");
        botonDefenderte.setPreferredSize(new Dimension(300, 80));
        botonDefenderte.setFont(new Font("Arial", Font.BOLD, 24));

        JButton botonNoDefenderte = new JButton("No te defiendes");
        botonNoDefenderte.setPreferredSize(new Dimension(300, 80));
        botonNoDefenderte.setFont(new Font("Arial", Font.BOLD, 24));


        // Añadir componentes al panel
        panel.add(texto, gbc);

        gbc.gridy++;
        panel.add(botonDefenderte, gbc);

        gbc.gridy++;
        panel.add(botonNoDefenderte, gbc);

        // Añadir el panel al marco
        frame.add(panel);

        // Acciones para los botones
        botonDefenderte.addActionListener(_ -> {
            // Verificar condiciones de la pistola
            if (!pistola.isDisponible()) {
                mostrarPantaExtra(); // La pistola no está disponible
            } else if (!pistola.tieneBala()) {
                mostrarPantaExtra(); // La pistola no tiene balas
            } else {
                game.disparas(pistola); // Realizar disparo
                game.ganas(); // Continuar a la pantalla 8
            }
            frame.dispose(); // Cerrar la ventana actual
        });

        botonNoDefenderte.addActionListener(_ -> {
            mostrarPantaExtra(); // Mostrar pantalla extra
            frame.dispose(); // Cerrar la ventana actual
        });

        // Hacer visible el marco principal
        frame.setVisible(true);
    }


    public void mostrarFinal() {
        final String[] nom = {""}; // Arreglo para almacenar el nombre del asesino ingresado

        // Configuración del marco
        JFrame frame = new JFrame("Pantalla Final");
        frame.setSize(400, 300);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel principal con GridBagLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setBackground(Color.DARK_GRAY); // Fondo oscuro para contraste
        frame.add(panel);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0; // Centrar los componentes horizontalmente
        gbc.gridy = 0; // Iniciar en la fila 0
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        JLabel textoCentrado =Paneles.crearTextoCentrado(
                "Llegaste al final, ¿quién crees que ha matado a Emily Carter?",
                24, // Tamaño de la fuente
                Color.WHITE // Color del texto
        );
        panel.setLayout(new GridBagLayout());
        panel.add(textoCentrado);

        // Campo de texto para ingresar el nombre del sospechoso
        gbc.gridy++; // Mover a la siguiente fila
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(300, 30)); // Tamaño del campo de texto
        panel.add(textField, gbc);

        // Botón "Guardar"
        gbc.gridy++;
        JButton button = new JButton("Guardar");
        button.setPreferredSize(new Dimension(150, 40));
        button.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(button, gbc);

        // Botón "Volver al menú"
        gbc.gridy++;
        JButton botonMenu = new JButton("Volver al menú");
        botonMenu.setPreferredSize(new Dimension(300, 60));
        botonMenu.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(botonMenu, gbc);
        // Acción del botón "Guardar"
        button.addActionListener(_ -> {
            nom[0] = textField.getText().trim(); // Capturar el nombre ingresado
            if (nom[0].isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Por favor, ingresa un nombre.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Llamar al método del paquete "Game"
                Game game = new Game(); // Asegúrate de que esta clase exista y sea accesible
                game.decides(nom[0]); // Pasar el nombre ingresado al método correspondiente
                frame.dispose(); // Cerrar la ventana actual
            }
        });

        // Acción del botón "Volver al menú"
        botonMenu.addActionListener(e -> {
            mostrarMenu(); // Regresar al menú principal
            frame.dispose(); // Cerrar la ventana actual
        });

        // Mostrar el marco
        frame.setVisible(true);
    }


    public void mostrarPantaExtra() {
        // No te has podido defender y mueres dejando el caso sin resolver
        JFrame frame = new JFrame("Pantalla Extra");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel personalizado con fondo
        JPanel panel = new JPanel(new GridBagLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                ImageIcon fondo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/HAS_MUERTO.jpg")));
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Configurar el diseño del panel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 0, 20, 0);
        gbc.anchor = GridBagConstraints.CENTER;

        // Crear y agregar el mensaje al panel
        JLabel texto = new JLabel("No pudiste defenderte de Ryan y has muerto.(no tenias pistola o no tenias bala)");
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Verdana", Font.BOLD, 28));
        panel.add(texto, gbc);

        // Crear y configurar el botón de volver al menú
        gbc.gridy++;
        JButton botonMenu = new JButton("Volver al menú");
        botonMenu.setPreferredSize(new Dimension(300, 80));
        botonMenu.setFont(new Font("Arial", Font.BOLD, 24));
        botonMenu.addActionListener(_ -> {
            mostrarMenu(); // Regresar al menú principal
            frame.dispose(); // Cerrar la ventana actual
        });
        panel.add(botonMenu, gbc);

        // Agregar el panel al frame y hacerlo visible
        frame.add(panel);
        frame.setVisible(true);
    }
}
