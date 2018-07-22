/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

/**
 *
 * @author nacht
 */
import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

public class CompoundFigure extends Figure{
    
    private List<Figure> figures; 
    
    public CompoundFigure() {
        super(1,2);
        this.figures = new ArrayList<Figure>();
    }
    
    public void add(Figure f) {
        figures.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure figure : figures) {
            figure.draw(graphics);
        }
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Figure figure : figures) {
            figure.move(dx, dy);
        }
    }
    
    
    
}
