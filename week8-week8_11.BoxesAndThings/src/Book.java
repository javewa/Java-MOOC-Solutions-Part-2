/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
public class Book implements Comparable{
    
    private String name;
    private String writer;
    private double weight;
    
    public Book(String writer, String name, double weight) {
        this.name = name;
        this.writer = writer;
        this.weight = weight;
    }
    
    public double weight() {
        return weight;
    }
    
    public String toString() {
        return writer + ": " + name;
    }
    
}
