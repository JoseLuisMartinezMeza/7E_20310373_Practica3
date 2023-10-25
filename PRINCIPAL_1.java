
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.*;
import java.sql.*;
import java.util.Random;

public class PRINCIPAL_1 extends JFrame implements ActionListener {
    Font fuente=new Font("Arial",Font.BOLD,20);
    Font fuente1=new Font("Arial",Font.PLAIN,20);
    Font fuente2=new Font("Arial",Font.PLAIN,18);
    public JLabel Titulo;
    public JButton botonJ,botonI,botonC,botonB;
    Juego_botones Ventana1;
    Acomodo Ventana2;
    public JScrollPane Paneles;
    public static int r;
    public Random random = new Random();
    public PRINCIPAL_1(){
        getContentPane().setBackground(new Color(0,0,255));
        setLayout(null);
        setTitle("El Gran Barco");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Titulo = new JLabel("El Gran Barco");
        Titulo.setBounds(200,0,450,50); //x, y, ancho, alto. Dentro del frame
        Titulo.setFont(fuente1);
        botonJ = new JButton("Empezar");
        botonJ.setBounds(300,250,150,30);
        botonJ.setFont(fuente2);
        botonI = new JButton("C\u00f3mo jugar");
        botonI.setBounds(300,280,150,30);
        botonI.setFont(fuente2);
        botonC = new JButton("Cerrar");
        botonC.setBounds(300,310,150,30);
        botonC.setFont(fuente2);
        botonB = new JButton("Volver");
        botonB.setBounds(633,530,150,30);
        botonB.setFont(fuente2);
        botonB.setVisible(false);
        Paneles = new JScrollPane();
        Paneles.setBounds(0,0,800,600);
        Paneles.setVisible(false);
        Ventana1 = new Juego_botones();
        Ventana2 = new Acomodo();

        //Add
        add(Titulo);
        add(botonC);
        add(botonI);
        add(botonJ);
        add(botonB);
        add(Paneles);

        //ActionListener
        botonI.addActionListener(this);
        botonJ.addActionListener(this);
        botonC.addActionListener(this);
        botonB.addActionListener(this);

        ImageIcon Fondo = new ImageIcon("P4.jpeg");                                  //Imagen a cambiar
        Image Escalada = Fondo.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        ImageIcon imagenNueva = new ImageIcon(Escalada);
        JLabel etiquetaDeFondo = new JLabel(imagenNueva);
        etiquetaDeFondo.setBounds(0, 0, imagenNueva.getIconWidth(), imagenNueva.getIconHeight());
        getContentPane().add(etiquetaDeFondo);
    }
    public void itemStateChanged(ItemEvent accion){}
    public void actionPerformed(ActionEvent accion){
        if (accion.getSource() == botonC){
            int exit = JOptionPane.showConfirmDialog(null,"\u00BF Est\u00e1s seguro?");
            if (exit == 0) {
                System.exit(0);
            }
        }
        if (accion.getSource() == botonI){
            Paneles.setVisible(true);
            Ventana2 = new Acomodo();
            ver2(Ventana2);
            Sombra();
        }
        if (accion.getSource() == botonJ){
            Paneles.setVisible(true);
            r = random.nextInt(5) + 1;
            Ventana1 = new Juego_botones();
            ver1(Ventana1);
        }
        if (accion.getSource() == botonB){
            Paneles.setVisible(false);
            Luz();
        }
    }
    private void ver1(Juego_botones coso){
        Paneles.setViewportView(coso);
        Play();
    }
    private void ver2(Acomodo coso){
        Paneles.setViewportView(coso);
        Luz();
    }
    private void Sombra(){
        botonI.setVisible(false);
        botonJ.setVisible(false);
        botonC.setVisible(false);
        botonB.setVisible(true);
        Titulo.setVisible(false);
    }
    private void Luz(){
        botonI.setVisible(true);
        botonJ.setVisible(true);
        botonC.setVisible(true);
        botonB.setVisible(false);
        Titulo.setVisible(true);
    }
    private void Play(){
        botonI.setVisible(false);
        botonJ.setVisible(false);
        botonC.setVisible(false);
        botonB.setVisible(false);
        Titulo.setVisible(false);
    }

    public static void main(String[] args) {
        PRINCIPAL_1 base=new PRINCIPAL_1();
        base.setBounds(150,100,800,600);
        base.setVisible(true);
        base.setResizable(false);
    }   
}