/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import clicker.applicationlogic.PersonalCalculator;
import clicker.applicationlogic.Calculator;
import javax.swing.JLabel;

/**
 *
 * @author nacht
 */
public class ClickListener implements ActionListener{
    
    private Calculator calculator;
    private JLabel text;
    
    public ClickListener(Calculator calculator, JLabel text) {
        this.calculator = calculator;
        //this.text = new JLabel(calculator.giveValue() + "");
        this.text = text;
    }
    
    public JLabel text() {
        return text;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        calculator.increase();
        text.setText(calculator.giveValue() + "");
    }
    
    
    
}
