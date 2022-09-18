package wlasnemenu;

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
        this.setTitle("Własne Menu");
        this.setBounds(300, 300, 300, 200);
        
        panelMenu.setLayout(new GridLayout(3, 1));
        panelMenu.add(menu1);
        panelMenu.add(menu2);
        panelMenu.add(menu3);
        
        kontener.add(panelMenu);
        this.setDefaultCloseOperation(3);
    }
    
    private Container kontener = this.getContentPane();
    private JPanel panelMenu = new JPanel();
    private MenuButton menu1 = new MenuButton("1. Dodaj");
    private MenuButton menu2 = new MenuButton("2. Usuń");
    private MenuButton menu3 = new MenuButton("3. Zmień");
    private int i  = 0;
    
    private class MenuButton extends JButton implements FocusListener, ActionListener
    {
        public MenuButton(String nazwa)
        {
            super(nazwa);
            this.addFocusListener(this);
            this.addActionListener(this);
            this.addKeyListener(new KeyAdapter() {
                // gdy klike np. literę a to: KeyPressed, keyTyped, keyRelease 
                 @Override
                public void keyReleased(KeyEvent e) 
                {
                   keyPressedHandler(e);
                }
            });
            this.setBackground(kDefault);
        }

        public void focusGained(FocusEvent e) 
        {
            this.setBackground(kFocusGained);
        }

        public void focusLost(FocusEvent e) 
        {
            this.setBackground(kDefault);
        }
        
        private void keyPressedHandler(KeyEvent e)
        {
            int dlMenu = panelMenu.getComponentCount();
            
            if (i==0) i = 10*dlMenu;
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
            {
                // 0%3 = 0, 1%3 = 1, 2 % 3 = 2, 3 % 3 = 0, 4 % 3 = 1
                
                panelMenu.getComponent(++i%dlMenu).requestFocus();
            }            
            else if (e.getKeyCode() == KeyEvent.VK_UP)
            {
                // 0%3 = 0, 1%3 = 1, 2 % 3 = 2, 3 % 3 = 0, 4 % 3 = 1
                //System.out.println(--i);
                panelMenu.getComponent(--i%dlMenu).requestFocus();
            }    
            else if (e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                //MenuButton tmp = (MenuButton)e.getSource();
                ((MenuButton)e.getSource()).doClick();
            }              
        }
  
        public void actionPerformed(ActionEvent e) 
        {
            JOptionPane.showMessageDialog(this, ((MenuButton)e.getSource()).getText());
        }     
        
        private Color kFocusGained = Color.RED;
        private Color kDefault = Color.BLUE;


    }
    
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }

}