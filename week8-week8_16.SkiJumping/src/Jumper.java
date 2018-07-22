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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jumper implements Comparable<Jumper>{
    
    private Random random = new Random();
    private String name;
    private int points;
    private List<Integer> jumps = new ArrayList<Integer>();
    
    public Jumper(String name) {
        this.name = name;
        this.points = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public int jump() {
        int c = 60 + random.nextInt(60);
        jumps.add(c);
        points += c;
        return c;
    }
    
    public List<Integer> getJumps() {
        return jumps;
    }
    
    public List<Score> scores() {
        List<Score> scores = new ArrayList<Score>();
        for (int i = 0; i < 5; i++) {
            scores.add(new Score());
        }
        Collections.sort(scores);
        points += scores.get(1).getValue() + scores.get(2).getValue() + scores.get(3).getValue();
        Collections.reverse(scores);
        return scores;
    }
    
    public int Points() {
        return points;
    }
    
    @Override
    public String toString() {
        return name + " (" + points + " points)";
    }
    
    @Override
    public int compareTo(Jumper jumper) {
        return points - jumper.points;
    }

}
