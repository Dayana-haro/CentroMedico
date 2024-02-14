/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class FondoPanel extends JPanel{
    private Image imagen; 
    @Override
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("C:\\Users\\USUARIO\\Documents\\proyecto\\PCentroMedico\\CentroMedico\\src\\main\\resources\\Imagenes\\MediMeetup.jpg")).getImage();
        g.drawImage(imagen,0,0,getWidth(), getHeight(),this);
        
        setOpaque(false);
        
        super.paint(g);
    }
    
  
    
    
}
