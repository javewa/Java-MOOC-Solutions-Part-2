/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author nacht
 */
import java.util.Random;
import java.lang.Math;

public class Cow implements Milkable, Alive{
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private String name;
    private int udderCapacity;
    private Random random = new Random();
    private double amount;
    
    public Cow() {
        this.name = NAMES[random.nextInt(30)];
        this.udderCapacity = 15 + random.nextInt(26);
        this.amount = 0;
    }
    
    public Cow(String name) {
        this.name = name;
        this.udderCapacity = 15 + random.nextInt(26);
        this.amount = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public double getCapacity() {
        return udderCapacity;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public String toString() {
        return name + " " + Math.ceil(amount) + "/" + udderCapacity * 1.0;
    }

    @Override
    public double milk() {
        double c = amount;
        amount = 0;
        return c;
    }

    @Override
    public void liveHour() {
        double c = 0.7 + random.nextDouble() * 1.3;
        if (amount + c >= udderCapacity) {
            amount = udderCapacity;
        } else {
            amount += c;
        }
    }
    
}
