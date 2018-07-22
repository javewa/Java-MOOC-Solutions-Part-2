package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.BLACK);
        graphics.fillRect(100, 40, 50, 50);
        graphics.fillRect(250, 40, 50, 50);
        graphics.fillRect(40, 200, 50, 50);
        graphics.fillRect(300, 200, 50, 50);
        graphics.fillRect(90, 250, 210, 50);
        
    }
}
