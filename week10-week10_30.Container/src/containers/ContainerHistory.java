/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author nacht
 */
import java.util.ArrayList;
import java.lang.Math;

public class ContainerHistory {
    
    private ArrayList<Double> history;
    
    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }
    
    public void add(double situation) {
        history.add(situation);
    }
    
    public void reset() {
        history = new ArrayList<Double>();
    }
    
    public String toString() {
        return history.toString();
    }
    
    public double maxValue() {
        double c = 0;
        if (!history.isEmpty()) {
            c = history.get(0);
            for (double doubles : history) {
                if (doubles >= c) {
                    c = doubles;
                }
            }
        }
        return c;
    }
    
    public double minValue() {
        double c = 0;
        if (!history.isEmpty()) {
            c = history.get(0);
            for (double doubles : history) {
                if (doubles <= c) {
                    c = doubles;
                }
            }
        }
        return c;
    }
    
    public double average() {
        double c = 0;
        if (!history.isEmpty()) {
            for (double doubles : history) {
                c += doubles;
            }
            c = c / history.size();
        }
        return c;
    }
    
    public double greatestFluctuation() {
        double c = 0;
        if ((!history.isEmpty()) && (history.size() != 1)) {
            int d = 1;
            if (history.size() == 2) {
                c = Math.abs(history.get(0) - history.get(1));
            } else if (history.size() == 3) {
                c = Math.abs(history.get(0) - history.get(1));
                if (Math.abs(history.get(1) - history.get(2)) >= c) {
                    c = Math.abs(history.get(1) - history.get(2));
                }
            } else {
                for (int i = 0; i < history.size() - 2 ; i ++) {
                    double diff = Math.abs(history.get(i) - history.get(d));
                    if (diff >= c) {
                        c = diff;
                    }
                    d += 1;
                }
            }
        }
        return c;
    }
    
    public double variance() {
        double c = 0;
        if (!history.isEmpty()) {
            double average = average();
            for (Double doubles : history) {
                c += (doubles - average) * (doubles - average);
            }
            c = c / (history.size() - 1);
        }
        return c;
    }
    
    
    
}
