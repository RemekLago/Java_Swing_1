package zdarzenia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener
{  
    public Main()
    {
        super("Zdarzenia");
        this.setBounds(300, 300, 300, 200);
        
        initComponents();
        
        this.setDefaultCloseOperation(3);
    }
    
    public void initComponents()
    {
        kolorCzerwony = new JButton("Czerwony");   
        kolorCzarny = new JButton("Czarny"); 
        kolorNiebieski = new JButton("Niebieski");
        
        
        kolorCzerwony.addActionListener(new sluchaczKolorow(Color.RED));
//        kolorCzarny.addActionListener(new sluchaczKolorow(Color.BLACK));

        kolorNiebieski.addActionListener(this);
        
        panel.add(kolorCzerwony);
        panel.add(kolorCzarny);
        panel.add(kolorNiebieski);
        
        kolorCzarny.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) 
            {
               panel.setBackground(Color.BLACK);
            }
        });
        
        budujButton("Zielony", Color.GREEN);
        
        this.getContentPane().add(panel);
    }
    
    
    JPanel panel = new JPanel();
    JButton kolorCzerwony;
    JButton kolorCzarny;   
    JButton kolorNiebieski;

    public void budujButton(String nazwa, final Color k)
    {
        JButton przycisk = new JButton(nazwa);
        przycisk.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
               panel.setBackground(k);
            }
        });
        
        panel.add(przycisk);
    }
    
    private class sluchaczKolorow implements ActionListener
    {
        public sluchaczKolorow(Color k)
        {
            this.kolor = k;
        }
        
        public void actionPerformed(ActionEvent e) 
        {
           panel.setBackground(kolor);
        }
        
        Color kolor;
    }
    
    public static void main(String[] args) 
    {
        new Main().setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource() == kolorNiebieski)
           panel.setBackground(Color.BLUE);
      
    }
    
}
