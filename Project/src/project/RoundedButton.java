/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Fadila Nur Habibah
 */
public class RoundedButton extends JButton{
    public RoundedButton(String text) {
        super(text);
        setContentAreaFilled(false); // Menghilangkan latar belakang default
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Warna latar belakang
        if (getModel().isPressed()) {
            g2.setColor(new Color(200, 200, 200)); // Warna saat ditekan
        } else {
            g2.setColor(new Color(220, 220, 220)); // Warna normal
        }
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); // Sudut membulat

        // Warna border
        g2.setColor(Color.GRAY);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);

        // Menggambar teks
        super.paintComponent(g2);
        g2.dispose();
    }

    @Override
    public void paintBorder(Graphics g) {
        // Jangan gunakan border default
    }
    
}
