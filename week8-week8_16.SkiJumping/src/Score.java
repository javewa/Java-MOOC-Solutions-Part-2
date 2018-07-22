/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
import java.util.Random;

public class Score implements Comparable<Score>{
    
    private Random random = new Random();
    private int value;
    
    public Score() {
        this.value = 10 + random.nextInt(10);
    }
    
    public int getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return "" + value;
    }
    
    @Override
    public int compareTo(Score score) {
        return value - score.value;
    }
    
    
    
}
