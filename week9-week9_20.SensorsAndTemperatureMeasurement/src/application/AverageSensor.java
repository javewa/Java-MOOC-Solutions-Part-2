/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author nacht
 */
import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor{
    
    private List<Sensor> sensors;
    private List<Integer> readings = new ArrayList<Integer>();

    
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }
    
    @Override
    public boolean isOn() {
        boolean isIt = true;
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                isIt = false;
            }
        }
        return isIt;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        int sum = 0;
        if (isOn() == false || sensors.isEmpty()) {
            throw new IllegalStateException();
        } else {
            for (Sensor sensor : sensors) {
                sum += sensor.measure();
            }
        }
        readings.add(sum/sensors.size());
        return sum/sensors.size();
    }
    
    public List<Integer> readings() {
        return readings;
    }
    
}
