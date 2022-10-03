package wewnetrzneramki;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;


public class Main extends JFrame
{
    public Main()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Wewnętrzne Ramki");
        this.setBounds(300, 300, 300, 200);
        
        JInternalFrame wewnRamka = new JInternalFrame("tytuł rameczki", true, true, true, true);
        wewnRamka.add(new JButton("tescior"), BorderLayout.NORTH);                
        wewnRamka.setVisible(true);
        wewnRamka.pack();
        //wewnRamka.setFrameIcon(icon);
         JInternalFrame wewnRamka2 = new JInternalFrame("tytuł rameczki", true, true, true, true);
        wewnRamka2.add(new JLabel("inny tescior"), BorderLayout.NORTH);                
        wewnRamka2.setVisible(true);
        wewnRamka2.pack();   
        wewnRamka.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
        
        wewnRamka.addInternalFrameListener(new InternalFrameListener() {

            public void internalFrameOpened(InternalFrameEvent e) {
                System.out.println("otwarte");
            }

            public void internalFrameClosing(InternalFrameEvent e) {
                String odp = JOptionPane.showInternalInputDialog(e.getInternalFrame(), "Wpisz 'wyjście' by wyjść z programu lub 'zamknij' by zamknąć tylko ramkę");
                
                if (odp != null)                  
                    if (odp.equals("wyjście"))
                        System.exit(0);
                    else if (odp.equals("zamknij"))
                        e.getInternalFrame().dispose();
            }

            public void internalFrameClosed(InternalFrameEvent e) {
                System.out.println("zamkniecie");
            }

            public void internalFrameIconified(InternalFrameEvent e) {
                System.out.println("minimalizacja");
            }

            public void internalFrameDeiconified(InternalFrameEvent e) {
                System.out.println("maksymalizacja");
            }

            public void internalFrameActivated(InternalFrameEvent e) {
                System.out.println("aktywacja");
            }

            public void internalFrameDeactivated(InternalFrameEvent e) {
                System.out.println("dezaktywacja");
            }
        }); 
        
        desktopPane.add(wewnRamka);
        desktopPane.add(wewnRamka2);
        
        
        this.getContentPane().add(desktopPane, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private JDesktopPane desktopPane = new JDesktopPane();
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
    

}

