
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
public class Diff implements ActionListener{

    private JTextField output;
    private JTextField text;
    private JButton button;
    
    public Diff(JTextField output, JTextField input, JButton button) {
        this.output = output;
        this.text = input;
        this.button = button;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (text.getText().matches("[0-9]+")) {
            int c = Integer.parseInt(output.getText()) - Integer.parseInt(text.getText());
            if (c != 0) {
                button.setEnabled(true);
            } else {
                button.setEnabled(false);
            }
            output.setText(c + "");
        }
        text.setText("");
    }
    
}
