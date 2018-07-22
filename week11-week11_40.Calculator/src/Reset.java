
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
public class Reset implements ActionListener{

    private JTextField output;
    private JButton button;
    private JTextField input;
    
    public Reset(JTextField output, JTextField input, JButton button) {
        this.output = output;
        this.button = button;
        this.input = input;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        output.setText("0");
        button.setEnabled(false);
        input.setText("");
    }
    
}
