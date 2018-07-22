package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(400,200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField textTop = new JTextField();
        JButton copy = new JButton("Copy!");
        JLabel textBottom = new JLabel();
        
        AreaCopier copier = new AreaCopier(textTop, textBottom);
        copy.addActionListener(copier);
        
        container.add(textTop);
        container.add(copy);
        container.add(textBottom);
        
    }
    
    public JFrame getFrame(){
        return frame;
    }
    
    public class AreaCopier implements ActionListener {

    private JTextField origin;
    private JLabel destination;

    public AreaCopier(JTextField origin, JLabel destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.destination.setText(this.origin.getText());
        this.origin.setText("");
    }
}
}
