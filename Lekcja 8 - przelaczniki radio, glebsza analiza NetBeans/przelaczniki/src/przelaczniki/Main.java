package przelaczniki;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame
{
    public Main()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Grupy Przełączników Radio");
        this.setBounds(300, 300, 300, 200);
        panel2.add(etykieta);
        
        
        zbudujPrzelacznikRozmiar("Mały", 15);
        zbudujPrzelacznikRozmiar("Średni", 25);
        zbudujPrzelacznikRozmiar("Duży", 35);
        
        zbudujPrzelacznikKolor("Zielony", Color.GREEN);
        zbudujPrzelacznikKolor("Czerwony", Color.RED);
        zbudujPrzelacznikKolor("Niebieski", Color.BLUE);
        
        this.getContentPane().add(panel, BorderLayout.NORTH);
        this.getContentPane().add(panel3, BorderLayout.CENTER);   
        this.getContentPane().add(panel2, BorderLayout.SOUTH);     
        
        this.setDefaultCloseOperation(3);
    }
    public void zbudujPrzelacznikRozmiar(String nazwa, final int rozmiar)
    {
        JRadioButton przelacznik = new JRadioButton(nazwa);
        
        przelacznik.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) 
            {
                etykieta.setFont(new Font("Monospaced", Font.PLAIN, rozmiar));
            }
        });
        
        groupSize.add(przelacznik);
        panel.add(przelacznik);
    }
    public void zbudujPrzelacznikKolor(String nazwa, final Color k)
    {
        JRadioButton przelacznik = new JRadioButton(nazwa);
        
        przelacznik.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) 
            {
               etykieta.setForeground(k);
            }
        });
        
        groupColor.add(przelacznik);
        panel3.add(przelacznik);
    }    
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JLabel etykieta = new JLabel("Coś");
    ButtonGroup groupSize = new ButtonGroup();
    ButtonGroup groupColor = new ButtonGroup();
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }

    
}
