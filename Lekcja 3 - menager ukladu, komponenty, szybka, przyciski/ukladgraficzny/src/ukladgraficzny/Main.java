package ukladgraficzny;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame
{  
    public Main()
    {
        super("Układ graficzny (Layout)");
        this.setBounds(300, 320, 300, 200);
        
        initComponents();
//        this.pack();
        this.setDefaultCloseOperation(3);
    }
    
    public void initComponents()
    {
        centrum = new JButton("Anuluj");
        gora = new JButton("jestem na górze");
        dol = new JButton("jestem na dole");
        prawa = new JButton("jestem po prawej stronie");
        lewa = new JButton("jestem po lewej stronie");
        
        Container kontener = this.getContentPane();
//        gora.setSize(100, 400);
//        kontener.add(centrum, BorderLayout.CENTER);
//        kontener.add(gora, BorderLayout.PAGE_START);
//        kontener.add(dol, BorderLayout.PAGE_END);
//        kontener.add(prawa, BorderLayout.LINE_END);
//        kontener.add(lewa, BorderLayout.LINE_START);
        
        centrum.setLocation(215, 135);
        centrum.setSize(centrum.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(centrum);
    }
    
    JButton centrum;
    JButton gora;
    JButton dol;
    JButton prawa;
    JButton lewa;
    
    public static void main(String[] args) 
    {
        new Main().setVisible(true);
    }
    
}