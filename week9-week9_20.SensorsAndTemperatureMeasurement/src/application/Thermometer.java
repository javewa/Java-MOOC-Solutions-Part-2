/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author nacht
 * 
 */
import java.util.Random;

public class Thermometer implements Sensor{

    private boolean status;
    
    
    public Thermometer() {
        this.status = false;
    }
    
    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void on() {
        status = true;
    }

    @Override
    public void off() {
        status = false;
    }

    @Override
    public int measure() {
        Random random = new Random();
        int c = -30;
        if (isOn() == false) {
            throw new IllegalStateException();
        } else {
            c += random.nextInt(60);
        }
        return c;
    }
    
    
}
