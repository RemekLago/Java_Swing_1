package aplikacjezwielomaramkami;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dialog extends JDialog
{
    public dialog(JFrame parent)
    {
        super(parent, true);
        initComponents();
        
        int szer = (int)parent.getBounds().getWidth(); //300
        int wys = (int)parent.getBounds().getHeight(); //200
        
       
        int szerRamki = this.getSize().width; //250
        int wysRamki = this.getSize().height; //75
        
        this.setLocation(parent.getBounds().x+ (szer-szerRamki)/2,parent.getBounds().y+ (wys-wysRamki)/2);        
    }
    public void initComponents()
    {
        this.setTitle("To jest ramka numer"+(++i));
        this.setBounds(300, 300, 250, 75);


        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

   
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
    
    static int i = 0;
}

