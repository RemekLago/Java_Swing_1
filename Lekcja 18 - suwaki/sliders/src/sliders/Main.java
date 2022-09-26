package sliders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main extends JFrame
{
    public Main()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Suwaki");
        this.setBounds(300, 300, 300, 200);
        wartoscSuwaka.setEditable(false);
        
        suwak.setMajorTickSpacing(5);
        suwak.setMinorTickSpacing(1);
        suwak.setPaintTicks(true);
        suwak.setPaintLabels(true);
        suwak.setSnapToTicks(true);
      
        suwak.addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent e) 
            {
                wartoscSuwaka.setText(""+((JSlider)e.getSource()).getValue());
                
                tekst.setFont(new Font(tekst.getFont().getFontName(), tekst.getFont().getStyle(), ((JSlider)e.getSource()).getValue()));
            }
        });
        this.getContentPane().add(suwak, BorderLayout.NORTH);
        this.getContentPane().add(tekst, BorderLayout.CENTER);
        this.getContentPane().add(wartoscSuwaka, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    JSlider suwak = new JSlider(JSlider.HORIZONTAL, 0, 30, 5);
    JTextField wartoscSuwaka = new JTextField(""+suwak.getValue());
    JLabel tekst = new JLabel("cos");
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
    

}

