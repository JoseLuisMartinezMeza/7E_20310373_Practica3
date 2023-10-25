
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.event.*;
import java.awt.Font;
import java.awt.*;
import java.io.*;
class Juego_botones extends JPanel implements ActionListener,ItemListener {
    Font fuente=new Font("Arial",Font.BOLD,20);
    Font fuente1=new Font("Arial",Font.PLAIN,20);
    Font fuente2=new Font("Arial",Font.PLAIN,18);
	public JButton botonR,botonS,botonP1,botonP2,botonP3,botonP4,botonP5,botonL1,botonL2,botonL3,botonL4,botonL5,botonE1,botonE2,botonE3,botonE4,botonE5;
    public JTextArea contexto;
    public JComboBox<String> acusoP,acusoL,acusoE;
    public int Intr = 0, Q = 0;
    public String a = "P4.jpeg",coso,sujeto,lugar,equipo,sujetoi,lugari,equipoi;
    public String[] s= new String[5];
    public String lore = "\n\n\nAlguien abord0 el barco pirata del Capitan Mundy, \nparece que se han infiltrado en varias ubicaciones, \ny es tu deber descubrir lo que ocurrio a bordo \nde la nave con precision.";
    public Juego_botones() {
    setLayout(null);
    setBackground(new Color(100,100,100));
    contexto = new JTextArea(lore);
    contexto.setFont(fuente);
    contexto.setEditable(false);
    contexto.setForeground(Color.BLUE);
    contexto.setOpaque(false);
    contexto.setBounds(20, 20, 760, 350);
    botonR = new JButton("Comprobar");
    botonR.setBounds(250, 400, 230, 35);
    botonR.setFont(fuente);
    botonR.setVisible(false);
    botonS = new JButton("Siguiente");
    botonS.setBounds(633, 530, 150, 30);
    botonS.setFont(fuente1);
    
    // Botones de Personajes
    botonP1 = new JButton("Capitan Mundy");
    botonP1.setBounds(20, 200, 150, 30);
    botonP1.setFont(fuente2);
    botonP1.setVisible(false);
    
    botonP2 = new JButton("Barbara blanca");
    botonP2.setBounds(170, 200, 150, 30);
    botonP2.setFont(fuente2);
    botonP2.setVisible(false);
    
    botonP3 = new JButton("Camarada Jack");
    botonP3.setBounds(320, 200, 150, 30);
    botonP3.setFont(fuente2);
    botonP3.setVisible(false);
    
    botonP4 = new JButton("Barba negra");
    botonP4.setBounds(470, 200, 150, 30);
    botonP4.setFont(fuente2);
    botonP4.setVisible(false);
    
    botonP5 = new JButton("Hammer Head");
    botonP5.setBounds(620, 200, 150, 30);
    botonP5.setFont(fuente2);
    botonP5.setVisible(false);
    
    // Botones de Lugares
    botonL1 = new JButton("Cubierta");
    botonL1.setBounds(20, 290, 150, 30);
    botonL1.setFont(fuente2);
    botonL1.setVisible(false);
    
    botonL2 = new JButton("Cabina");
    botonL2.setBounds(170, 290, 150, 30);
    botonL2.setFont(fuente2);
    botonL2.setVisible(false);
    
    botonL3 = new JButton("Taberna");
    botonL3.setBounds(320, 290, 150, 30);
    botonL3.setFont(fuente2);
    botonL3.setVisible(false);
    
    botonL4 = new JButton("Bodega de Tesoros");
    botonL4.setBounds(470, 290, 150, 30);
    botonL4.setFont(fuente2);
    botonL4.setVisible(false);
    
    botonL5 = new JButton("Bodega de Mapas");
    botonL5.setBounds(620, 290, 150, 30);
    botonL5.setFont(fuente2);
    botonL5.setVisible(false);
    
    // Botones de Equipos
    botonE1 = new JButton("Sable");
    botonE1.setBounds(20, 380, 150, 30);
    botonE1.setFont(fuente2);
    botonE1.setVisible(false);
    
    botonE2 = new JButton("Brujula");
    botonE2.setBounds(170, 380, 150, 30);
    botonE2.setFont(fuente2);
    botonE2.setVisible(false);
    
    botonE3 = new JButton("Garfio");
    botonE3.setBounds(320, 380, 150, 30);
    botonE3.setFont(fuente2);
    botonE3.setVisible(false);
    
    botonE4 = new JButton("Botella de ron");
    botonE4.setBounds(470, 380, 150, 30);
    botonE4.setFont(fuente2);
    botonE4.setVisible(false);
    
    botonE5 = new JButton("Llave Doble");
    botonE5.setBounds(620, 380, 150, 30);
    botonE5.setFont(fuente2);
    botonE5.setVisible(false);
    
    // ComboBox para Personajes, Lugares y Equipos
    String[] optionsP = {"Personaje", "Capitan Mundy", "Barbara blanca", "Camarada Jack", "Hammer Head", "Barba negra"};
    acusoP = new JComboBox<>(optionsP);
    acusoP.setBounds(200, 150, 150, 30);
    acusoP.setFont(fuente2);
    acusoP.setVisible(false);
    
    String[] optionsL = {"Lugar", "Cubierta", "Cabina", "Taberna", "Bodega de Tesoros", "Bodega de Mapas"};
    acusoL = new JComboBox<>(optionsL);
    acusoL.setBounds(370, 150, 150, 30);
    acusoL.setFont(fuente2);
    acusoL.setVisible(false);
    
    String[] optionsE = {"Equipo", "Sable", "Brujula", "Garfio", "Botella de ron", "Llave Doble"};
    acusoE = new JComboBox<>(optionsE);
    acusoE.setBounds(540, 150, 150, 30);
    acusoE.setFont(fuente2);
    acusoE.setVisible(false);

    add(contexto);
    add(botonR);
    add(botonS);
    add(botonP1);
    add(botonP2);
    add(botonP3);
    add(botonP4);
    add(botonP5);
    add(botonL1);
    add(botonL2);
    add(botonL3);
    add(botonL4);
    add(botonL5);
    add(botonE1);
    add(botonE2);
    add(botonE3);
    add(botonE4);
    add(botonE5);
    add(acusoP);
    add(acusoL);
    add(acusoE);
    botonR.addActionListener(this);
    botonS.addActionListener(this);
    botonP1.addActionListener(this);
    botonP2.addActionListener(this);
    botonP3.addActionListener(this);
    botonP4.addActionListener(this);
    botonP5.addActionListener(this);
    botonL1.addActionListener(this);
    botonL2.addActionListener(this);
    botonL3.addActionListener(this);
    botonL4.addActionListener(this);
    botonL5.addActionListener(this);
    botonE1.addActionListener(this);
    botonE2.addActionListener(this);
    botonE3.addActionListener(this);
    botonE4.addActionListener(this);
    botonE5.addActionListener(this);
    acusoP.addItemListener(this);
    acusoL.addItemListener(this);
    acusoE.addItemListener(this);

    try {
        backgroundImage = ImageIO.read(new File(a));  // Imagen a cambiar
        repaint();
    } catch (Exception e) {
    }
}
    public void itemStateChanged(ItemEvent accion){
        sujeto = acusoP.getSelectedItem().toString();
        lugar = acusoL.getSelectedItem().toString();
        equipo = acusoE.getSelectedItem().toString();
    }
    public void actionPerformed(ActionEvent accion){
        if (accion.getSource() == botonR){
            coso = "P13.jpeg";
            IMG(coso);
            Resultado();
        }
    	if (accion.getSource() == botonS){
            Intr++;
            coso = "P14.jpeg";
            if (Intr==1) {
                Rand();
                System.out.println(Intr);
                Lista();
                IMG(coso);
            }
            else if (Intr>1) {
                Q++;
                System.out.println("elseif");
                System.out.println(Q);
                Lista();
                IMG(coso);
                if(Q>=5){
                    Juicio();
                    coso = "P21.jpeg";
                    IMG(coso);
                }
            }
            else{
                System.out.println("else");
            }
        }
        if (accion.getSource() == botonP1){
            coso = "P11.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Capitan Mundy")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonP2){
            coso = "P7.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Barbara blanca")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonP3){
            coso = "P8.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Barba negra")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonP4){
            coso = "P6.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Camarada Jack")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonP5){
            coso = "P12.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Hammer Head")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL1){
            coso = "P17.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Cubierta")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL2){
            coso = "P3.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Cabina")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL3){
            coso = "P20.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Taberna")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL4){
            coso = "P18.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Bodega de Tesoros")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL5){
            coso = "P5.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Bodega de Mapas")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE1){
            coso = "P6.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Sable")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE2){
            coso = "P9.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Brujula")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE3){
            coso = "P19.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Garfio")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE4){
            coso = "P15.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Botella de ron")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE5){
            coso = "P17.jpeg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Llave Doble")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
    }
public void Rand() {
    switch (PRINCIPAL_1.r) {
        case 1:
            System.out.println("En el Barco Pirata del Capitan Mundy");
            sujetoi = "Capitan Mundy";
            lugari = "Cubierta";
            equipoi = "Sable";
            s[0] = "\n\n\nLos vigías en el mástil detectaron a un intruso en la cubierta; \n no se encontró a nadie pero había un mapa del tesoro cerca.";
            s[1] = "\n\n\nLos cañoneros en el Cabina de pólvora mencionan que la Srta.\n Barbara blanca se adentró en el cuarto de tesoros; se encontró una Brujula.";
            s[2] = "\n\n\nEl Capitan Mundy afirma haber estado en la taberna, aunque las vigias\n no registraron su presencia; entre las barricas de ron se halló un garfio.";
            s[3] = "\n\n\nEl Camarada Jack dice estar en la bodega de mapas, su nombre figura en el registro;\n una llave doble se encontró cerca de la entrada.";
            s[4] = "\n\n\nBarba negra jura que trabajó en la bodega de cañones, \nlos registros de suministros coinciden, y se encontró un loro parlante en su hombro.";
            break;
        case 2:
            System.out.println("A Bordo del Barco Pirata de la Barbara blanca");
            sujetoi = "Barbara blanca";
            lugari = "Cabina";
            equipoi = "Brujula";
            s[0] = "\n\n\nLos vigías no detectaron la presencia de la Srta.Barbara blanca \nen la cubierta; una bolsa de oro fue hallada cerca del timón.";
            s[1] = "\n\n\nLos registros del capitán Barba negra mencionan que la Srta.Barbara blanca\n se adentró en la bodega de tesoros; se encontró una botella de ron vacía.";
            s[2] = "\n\n\nEl Capitan Mundy afirma estar en la taberna, aunque las vigias no registraron su presencia;\n en su camarote se halló un diario de abordo.";
            s[3] = "\n\n\nEl Camarada Jack dice estar en la bodega de mapas, su nombre figura en el registro; \nuna Brujula se encontró cerca de la entrada.";
            s[4] = "\n\n\nEl Hammer Head menciona que trabajó todo el tiempo en la bodega de cañones, \nlos registros de suministros coinciden, y se encontró un sable en su camarote.";
            break;
        case 3:
            System.out.println("A Bordo del Barco Pirata del Barba negra");
            sujetoi = "Barba negra";
            lugari = "Taberna";
            equipoi = "Garfio";
            s[0] = "\n\n\nLos vigías en el mástil detectaron las llaves del Barba negra y, \ntras una revisión, se encontró las llaves de acceso en el lugar.";
            s[1] = "\n\n\nLos registros de la Barbara blanca indican que el prototipo de la Brujula ha desaparecido de su camarote.";
            s[2] = "\n\n\nBarba negra dijo estar en la taberna, se encontró una pila de platos que lo confirma,\n aunque los vigías fueron a comer y no vieron nada; \n entre los barriles de ron se encontró un garfio.";
            s[3] = "\n\n\nEl Barba negra dijo estar en la bodega de mapas, su nombre no está en el registro; \nuna llave doble se encontró cerca de la entrada.";
            s[4] = "\n\n\nEl Barba negra mencionó que trabajó todo el tiempo en la bodega de cañones y \ngrabó un informe de su trabajo, el inventario menciona un sable en el lugar.";
            break;
        case 4:
            System.out.println("A Bordo del Barco Pirata del Hammer Head");
            sujetoi = "Hammer Head";
            lugari = "Bodega de Tesoros";
            equipoi = "Botella de ron";
            s[0] = "\n\n\nLos vigías en el mástil detectaron la presencia del Camarada Jack y, \ntras una revisión, se encontró un garfio en el lugar.";
            s[1] = "\n\n\nLa Barbara blanca mencionó que trabajó todo el tiempo en la bodega de cañones y \ngrabó un informe de su trabajo; el inventario tenía una Brujula en el lugar, pero desapareció.";
            s[2] = "\n\n\nBarba negra dijo estar en la taberna, las vigias lo confirman;\njunto a la puerta se encontró un sable.";
            s[3] = "\n\n\nEl Barba negra dijo estar en la bodega de mapas, el registro está perdido,\n pero varios lo vieron entrar; se halló un prototipo de la Brujula cerca de la entrada.";
            s[4] = "\n\n\nEl Hammer Head mencionó que estaba en el Cabina, los datos del lugar difieren,\n se recuperó una Garfio de acceso en el lugar.";
            break;
        case 5:
            System.out.println("A Bordo del Barco Pirata del Camarada Jack");
            sujetoi = "Camarada Jack";
            lugari = "Bodega de Mapas";
            equipoi = "Llave Doble";
            s[0] = "\n\n\nLos vigias en la taberna detectaron la presencia de la Barbara blanca que mencionó estar en el lugar; \nse ha perdido una llave doble en la zona.";
            s[1] = "\n\n\nLos registros de la cubierta no funcionan, pero una bitácora menciona a Barba negra en el lugar,\n tras una revisión se encontró una botella de ron.";
            s[2] = "\n\n\nEl Barba negra dijo estar en el Cabina, las vigias lo vieron; \nen la decoración de la isla se encontró una Garfio de acceso.";
            s[3] = "\n\n\nEl Camarada Jack mencionó estar en la bodega de cañones, su nombre no está en el registro;\n se encontró un prototipo de la Brujula en la mesa.";
            s[4] = "\n\n\nEl Hammer Head menciona que estaba en la Bodega de Tesoros, \nlos datos del lugar lo confirman, se recuperó un garfio en el lugar.";
            break;
        default:
            System.out.println("Navegando por aguas desconocidas");
            break;
    }
}
//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||    
    //Cambio de fondo
    public Image backgroundImage;
    private void IMG(String change){
        a = change;
        try {
            backgroundImage = ImageIO.read(new File(a));  // Imagen a cambiar
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||    */
    public void Resultado(){
        if(sujeto==sujetoi&&lugar==lugari&&equipo==equipoi){
            lore="Ganaste";
        }
        else{
            String verdad="Te haz equivocado. \nEl culpable es: "+sujetoi+"\nEntro desde: "+lugari+"\nUsando: "+equipoi;
            lore=verdad;
        }
        contexto.setText(lore);
        contexto.setVisible(true);
        botonR.setVisible(false);
        acusoE.setVisible(false);
        acusoL.setVisible(false);
        acusoP.setVisible(false);
        botonS.setVisible(false);
        botonP1.setVisible(false);
        botonP2.setVisible(false);
        botonP3.setVisible(false);
        botonP4.setVisible(false);
        botonP5.setVisible(false);
        botonL1.setVisible(false);
        botonL2.setVisible(false);
        botonL3.setVisible(false);
        botonL4.setVisible(false);
        botonL5.setVisible(false);
        botonE1.setVisible(false);
        botonE2.setVisible(false);
        botonE3.setVisible(false);
        botonE4.setVisible(false);
        botonE5.setVisible(false);
    }
    private void Lista(){
        contexto.setVisible(false);
        botonS.setVisible(false);
        botonP1.setVisible(true);
        botonP2.setVisible(true);
        botonP3.setVisible(true);
        botonP4.setVisible(true);
        botonP5.setVisible(true);
        botonL1.setVisible(true);
        botonL2.setVisible(true);
        botonL3.setVisible(true);
        botonL4.setVisible(true);
        botonL5.setVisible(true);
        botonE1.setVisible(true);
        botonE2.setVisible(true);
        botonE3.setVisible(true);
        botonE4.setVisible(true);
        botonE5.setVisible(true);
    }
    private void Info(){
        contexto.setText(lore);
        contexto.setVisible(true);
        botonS.setVisible(true);
        botonP1.setVisible(false);
        botonP2.setVisible(false);
        botonP3.setVisible(false);
        botonP4.setVisible(false);
        botonP5.setVisible(false);
        botonL1.setVisible(false);
        botonL2.setVisible(false);
        botonL3.setVisible(false);
        botonL4.setVisible(false);
        botonL5.setVisible(false);
        botonE1.setVisible(false);
        botonE2.setVisible(false);
        botonE3.setVisible(false);
        botonE4.setVisible(false);
        botonE5.setVisible(false);
    }
    private void Juicio(){
        contexto.setVisible(false);
        botonR.setVisible(true);
        botonS.setVisible(false);
        botonP1.setVisible(false);
        botonP2.setVisible(false);
        botonP3.setVisible(false);
        botonP4.setVisible(false);
        botonP5.setVisible(false);
        botonL1.setVisible(false);
        botonL2.setVisible(false);
        botonL3.setVisible(false);
        botonL4.setVisible(false);
        botonL5.setVisible(false);
        botonE1.setVisible(false);
        botonE2.setVisible(false);
        botonE3.setVisible(false);
        botonE4.setVisible(false);
        botonE5.setVisible(false);
        acusoP.setVisible(true);
        acusoL.setVisible(true);
        acusoE.setVisible(true);
    }
    public static void main(String[] args) {
        Juego_botones base=new Juego_botones();
        base.setBounds(150,100,800,600);
        base.setVisible(true);
    }
}
