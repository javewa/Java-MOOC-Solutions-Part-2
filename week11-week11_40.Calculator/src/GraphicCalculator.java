
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400,200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField answer = new JTextField("0");
        JTextField input = new JTextField("");
  
        answer.setEnabled(false);
        
        container.add(answer);
        container.add(input);
        container.add(createPanel(answer, input));
        
    }

    private JPanel createPanel(JTextField answer, JTextField input) {
        JPanel panel = new JPanel(new GridLayout(1,3));
        
        JButton clear = new JButton("Z");
        clear.setEnabled(false);
        Reset cond = new Reset(answer, input, clear);
        clear.addActionListener(cond);
        
        JButton add = new JButton("+");
        Sum mySum = new Sum(answer,input,clear);
        add.addActionListener(mySum);
        
        JButton sub = new JButton("-");
        Diff myDiff = new Diff(answer, input, clear);
        sub.addActionListener(myDiff);
        
        panel.add(add);
        panel.add(sub);
        panel.add(clear); 
        
        return panel;
    }
    
    public JFrame getFrame() {
        return frame;
    }
}
