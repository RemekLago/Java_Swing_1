package zdarzeniaokna;

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
        this.setTitle("Pola Wyboru");
        this.setBounds(300, 300, 300, 200);
        
        this.addWindowListener(new WindowAdapter() {
        
        public void windowOpened(WindowEvent e) {
             JOptionPane.showMessageDialog(rootPane, "Witaj :-)");
        }
        });
        
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }

    public void windowOpened(WindowEvent e) 
    {
       JOptionPane.showMessageDialog(rootPane, "Witaj :-)");
    }

    public void windowClosing(WindowEvent e) 
    {
        int opcja = JOptionPane.showConfirmDialog(rootPane, "Czy na pewno chcesz zamknąć ten super ekstra program?? :(");
        if (opcja == 0)
            this.dispose(); 
    }

    public void windowClosed(WindowEvent e) 
    {
        System.out.println("Zapisujemy dane na dysku");
    }

    public void windowIconified(WindowEvent e) 
    {
        System.out.println("Jestem minimalizowany");
    }

    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Jestem maksymalizowany");
    }

    public void windowActivated(WindowEvent e) 
    {
        System.out.println("Jestem aktywny");
    }

    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Jestem nieaktywny");
    }
    

}
