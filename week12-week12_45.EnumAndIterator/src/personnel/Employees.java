/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author nacht
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {
    
    private List<Person> people = new ArrayList<Person>();
    
    public Employees() {
        
    }
    
    public void add(Person person) {
       people.add(person);
    }
    
    public void add(List<Person> persons) {
        for (Person person : persons) {
            people.add(person);
        }
    }
    
    public void print() {
        for (Person person : people) {
            System.out.println(person);
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = people.iterator();
        
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
         
    }
    
    public void fire(Education education) {
        Iterator <Person> iterator = people.iterator();
        
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
    
}
