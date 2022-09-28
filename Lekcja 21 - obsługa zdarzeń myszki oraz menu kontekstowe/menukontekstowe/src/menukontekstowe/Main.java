package menukontekstowe;

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
        this.setTitle("Menu Kontekstowe");
        this.setBounds(300, 300, 300, 200);
        
        final JPopupMenu menuKontekstowe = new JPopupMenu();
        
        menuKontekstowe.add(new JMenuItem(new AbstractAction("Zamknij") {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }));
        menuKontekstowe.add(new JMenuItem("Kopiuj"));
        menuKontekstowe.add(new JMenuItem("Wklej"));
        
        
        testowiec.addMouseListener(new MouseAdapter() {

            public void mouseReleased(MouseEvent e) {
                System.out.println("released");
                
                if (e.getClickCount() == 3 && e.getButton() == MouseEvent.BUTTON1 && e.isShiftDown())
                    JOptionPane.showMessageDialog(rootPane, "Aleś się naklikał :-) lewym przyciskiem myszy!");
                
                if (e.isPopupTrigger())
                    menuKontekstowe.show(e.getComponent(), e.getX(), e.getY());
            }

        });
       
        this.getContentPane().add(testowiec, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

  
    private JButton testowiec = new JButton("test");
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
    

}

