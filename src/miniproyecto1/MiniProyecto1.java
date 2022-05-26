package miniproyecto1;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import java.awt.GridLayout;

/**
 *
 * @author j5434
 */
public class MiniProyecto1 extends JFrame {
    private JLabel eEstado, epuntaje, eimagen;
    private JButton biniciar, bBlueL, bBlueC, bBlueR, bRedL, bRedC, bRedR, bYellowL, bYellowC, bYellowR, bGreenL, bGreenC, bGreenR;
    private JPanel pjuego, pbotones, pnorth;
    
    public MiniProyecto1 ()
    {
        initComponents();
        setTitle("Juego Abre la Caja");
        setSize(700,400);
        setVisible (true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    private void initComponents()
    {
        eEstado = new JLabel("En espera");
        epuntaje = new JLabel("su puntaje es de:");
        eimagen = new JLabel();
        pjuego = new JPanel(new GridLayout(1,2));
        pbotones = new JPanel(new GridLayout(4,5));
        pnorth = new JPanel(new GridLayout(1,2));
        biniciar = new JButton("iniciar");
        bBlueL = new JButton();
        bBlueC = new JButton();
        bBlueR = new JButton();
        bRedL = new JButton();
        bRedC = new JButton();
        bRedR = new JButton();
        bYellowL = new JButton();
        bYellowC = new JButton();
        bYellowR = new JButton();
        bGreenL = new JButton();
        bGreenC = new JButton();
        bGreenR = new JButton();
        bBlueL.setBackground(Color.blue);
        bBlueC.setBackground(Color.blue);
        bBlueR.setBackground(Color.blue);
        bRedL.setBackground(Color.red);
        bRedC.setBackground(Color.red);
        bRedR.setBackground(Color.red);
        bYellowL.setBackground(Color.yellow);
        bYellowC.setBackground(Color.yellow);
        bYellowR.setBackground(Color.yellow);
        bGreenL.setBackground(Color.green);
        bGreenC.setBackground(Color.green);
        bGreenR.setBackground(Color.green);
        epuntaje.setForeground(Color.green);
        
        pnorth.add(biniciar); pnorth.add(eEstado);
        
        pjuego.add(eimagen); pjuego.add(pbotones);
        
        pbotones.add(bBlueL); pbotones.add(bBlueC); pbotones.add(bBlueR);
        pbotones.add(bRedL); pbotones.add(bRedC); pbotones.add(bRedR);
        pbotones.add(bYellowL); pbotones.add(bYellowC); pbotones.add(bYellowR);
        pbotones.add(bGreenL); pbotones.add(bGreenC); pbotones.add(bGreenR);
        
        eimagen.setIcon(new ImageIcon("C:\\Users\\j5434\\Downloads\\caja.png"));
        
        

        add(pnorth, BorderLayout.NORTH);
        add(pjuego, BorderLayout.CENTER);
        add(epuntaje, BorderLayout.SOUTH);
    }
  

    public static void main(String[] arg)
    {
            MiniProyecto1 miGUI = new MiniProyecto1();
    }
    
}
