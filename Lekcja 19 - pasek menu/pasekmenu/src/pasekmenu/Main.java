package pasekmenu;

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
        this.setTitle("Pasek Menu");
        this.setBounds(300, 300, 300, 200);
        this.setJMenuBar(pasekMenu);
        
        JMenu menuPlik = pasekMenu.add(new JMenu("Plik"));
        
        JMenuItem podMenuNowy = menuPlik.add(new JMenuItem("Nowy"));
        podMenuNowy.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Tu jest kod, który tworzy nowy plik");
            }
        });
        menuPlik.addSeparator();
        final JMenuItem podMenuZapisz = menuPlik.add(new JMenuItem("Zapisz"));
        menuPlik.add(new JMenuItem("Wczytaj"));
        menuPlik.addSeparator();
        JMenu menuOpcje = new JMenu("Opcje");
        menuPlik.add(menuOpcje);
        
        menuOpcje.add(new JMenuItem("Opcja 1"));
        menuOpcje.add(new JMenuItem("Opcja 2"));
        menuOpcje.add(tylkoDoOdczytu);
        
        tylkoDoOdczytu.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
               if (tylkoDoOdczytu.isSelected())
                   podMenuZapisz.setEnabled(false);
               else 
                   podMenuZapisz.setEnabled(true);
            }
        });
        
        JMenu menuPomoc = pasekMenu.add(new JMenu("Pomoc"));
        
        menuPomoc.add(new JMenuItem("FAQ"));
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private JMenuBar pasekMenu = new JMenuBar();
    private JCheckBoxMenuItem tylkoDoOdczytu = new JCheckBoxMenuItem("Tylko do odczytu");
    private JRadioButtonMenuItem radio;
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
    

}

