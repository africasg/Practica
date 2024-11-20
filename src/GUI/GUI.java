package GUI;

public class GUI {
   //RECUERDA IMPORTAR MAIN PARA QUE FUNCIONE
        public static void mostrarMenu(){
        JFrame frame= new JFrame("Mistery Murder");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            JLabel mensaje = new JLabel("Bienvenido al juego detective ¿Qué quieres hacer?");
            mensaje.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(mensaje);

            JButton btnIniciar = new JButton("Jugar");
            btnIniciar.setAlignmentX(Component.CENTER_ALIGNMENT);
            btnIniciar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose(); // Cerrar el menú
                    mostrarPantallaInicial();
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
        //Se muestra el texto con lore, consigues movil(lees conver y tienes codigo)

            JFrame frame= new JFrame("Pantalla incicial");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);


            JLabel texto= new JLabel(" Bienvenida detective Alisson ");
            texto.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(texto);



            JButton botonJess = new JButton("Hablar con Jess");
            botonJess.setBounds(50, 100, 150, 30);
            panel.add(botonJess);

            JButton botonRyan = new JButton("Hablar con Ryan");
            botonRyan.setBounds(50, 150, 150, 30);
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
        public static void mostrarPantJess(){
            //Te cuenta su parte de la historia
            JFrame frame= new JFrame("Pantalla Jess");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);


            JLabel texto= new JLabel("Detective yo no fui");
            texto.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(texto);

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
        public static void mostrarPantRyan(){
            //Te cuenta su parte de la historia
            JFrame frame= new JFrame("Pantalla Ryan");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);


            JLabel texto= new JLabel("Detective fue Jess seguro");
            texto.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(texto);

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
        public static void mostrarPantalla1(){
            //No sabes si volver a la escena del crimen
            //Vas (mostrarPantalla2a())
            //No vas(mostrarPantalla2b())

            JFrame frame= new JFrame("Pantalla 1");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);


            JLabel texto= new JLabel("¿Deberia de volver a investigar la casa?");
            texto.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(texto);

            JButton botonsi = new JButton("Si vas");
            botonsi.setBounds(50, 100, 150, 30);
            panel.add(botonsi);

            JButton botonNo = new JButton("No vas");
            botonNo.setBounds(50, 150, 150, 30);
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
        public static void mostrarPantalla2a(){
        //encuentras caja fuerte y usas el codigo
            //coges los papeles
            //coges pistola (mostrarPantalla3a())
            //no coges pistola (mostrarPantalla3a())

            JFrame frame= new JFrame("Pantalla 2a");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);


            JLabel texto= new JLabel("He venido y he encontrado una caja fuerte, la abro y hay unos papeles y una pistola. La cojo?");
            texto.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(texto);

            JButton botonCoger = new JButton("coges la pistola");
            botonCoger.setBounds(50, 100, 150, 30);
            panel.add(botonCoger);

            JButton botonNoCoger = new JButton("No coges la pistola");
            botonNoCoger.setBounds(50, 150, 150, 30);
            panel.add(botonNoCoger);

            botonCoger.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
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
        public static void mostrarPantalla2b(){
            //revisas de nuevo el movil encuentras un mail(papeles)
            //mostrarPantalla3b()

            JFrame frame= new JFrame("Pantalla 2b");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);


            JLabel texto= new JLabel("Mejor reviso el movil. En sus mails hay uno con unos papeles de una herencia. OH le ha llegado un mensaje");
            texto.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(texto);

            JButton botonMensaje = new JButton("abres el mensaje");
            botonMensaje.setBounds(50, 100, 150, 30);
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
        public static void mostrarPantalla3a(){
            //ves a una persona fuera
            //la sigues(mostrarPantalla4())
            //no la sigues(mostrarFinal())

            JFrame frame= new JFrame("Pantalla 3a");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);


            JLabel texto= new JLabel(" Creo que acabo de ver a una persona sospechosa fuera, La sigo??");
            texto.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(texto);

            JButton botonSeguir = new JButton("Le sigues");
            botonSeguir.setBounds(50, 100, 150, 30);
            panel.add(botonSeguir);

            JButton botonNoSeguir = new JButton("No le sigues");
            botonNoSeguir.setBounds(50, 150, 150, 30);
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
        public static void mostrarPantalla3b(){
        //te llega un mensaje
            //vas (mostrarPantalla4())
            //no vas (mostrarFinal())

            JFrame frame= new JFrame("Pantalla 3b");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);


            JLabel texto= new JLabel("Lees el mensaje y pone que vayas a x sitio si quieres saber la verdad");
            texto.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(texto);

            JButton botonVas= new JButton("Vas al lugar");
            botonVas.setBounds(50, 100, 150, 30);
            panel.add(botonVas);

            JButton botonNoVas = new JButton("No vas al lugar");
            botonNoVas.setBounds(50, 150, 150, 30);
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
        public static void mostrarPantalla4(){
        //has ido y ahora escuchas un ruido detras de un arbusto
            //decides disparar.TE QUEDAS SIN BALA (mostrarPantalla5a())
            //no disparas. SIGUES CON BALA (mostrarPantalla5b())
            //y si no hay pistola??????

            JFrame frame= new JFrame("Pantalla 4");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);


            JLabel texto= new JLabel("Le he perdido de vista. QUE ES ESE RUIDO. Sacas la pistola automaticamente");
            texto.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(texto);

            JButton botonDisparas = new JButton("DISPARAS!!!");
            botonDisparas.setBounds(50, 100, 150, 30);
            panel.add(botonDisparas);

            JButton botonNoDisparas = new JButton("No disparas");
            botonNoDisparas.setBounds(50, 150, 150, 30);
            panel.add(botonNoDisparas);

            botonDisparas.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
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
        public static void mostrarPantalla5a(){
        //era un conejo que sale corriendo por el disparo
            //encuentras una nota
            //vas (mostrarPantalla6())
            //no vas (mostrarfinal())

            JFrame frame= new JFrame("Pantalla 5a");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);


            JLabel texto= new JLabel("Vaya era solo un conejo y ha salido corriendo. Espera... aqui hay una nota");
            texto.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(texto);

            JButton botonLeer = new JButton("vas ");
            botonLeer.setBounds(50, 100, 150, 30);
            panel.add(botonLeer);

            JButton botonNoLeer = new JButton("No vas");
            botonNoLeer.setBounds(50, 150, 150, 30);
            panel.add(botonNoLeer);

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
        public static void mostrarPantalla5b(){
        //Sale un conejo del arbusto y ves la nota
            //vas (mostrarPantalla6())
            //no vas (mostrarfinal())

            JFrame frame= new JFrame("Pantalla 5b");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);


            JLabel texto= new JLabel("Que susto solo era un conejo. espera... que es esa nota");
            texto.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(texto);

            JButton botonLeer = new JButton("vas ");
            botonLeer.setBounds(50, 100, 150, 30);
            panel.add(botonLeer);

            JButton botonNoLeer = new JButton("No vas");
            botonNoLeer.setBounds(50, 150, 150, 30);
            panel.add(botonNoLeer);

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
