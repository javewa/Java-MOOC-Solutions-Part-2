/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

/**
 *
 * @author nacht
 */
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class RatingRegister {
    
    private Map<Film, ArrayList<Rating>> register;
    private Map<Person, HashMap<Film, Rating>> ratings;
    
    public RatingRegister() {
        this.ratings = new HashMap<Person, HashMap<Film, Rating>>();
        this.register = new HashMap<Film, ArrayList<Rating>>();
    }
    
    public void addRating(Film film, Rating rating) {
        if (!register.keySet().contains(film)) {
            register.put(film, new ArrayList<Rating>());
        }
        
        List filmRatings = register.get(film);
        filmRatings.add(rating);
    }
    
    public List<Rating> getRatings(Film film) {
        return register.get(film);
    }
    
    public Map<Film, ArrayList<Rating>> filmRatings() {
        return register;
    }
    
    public void addRating(Person person, Film film, Rating rating) {
        if (!ratings.keySet().contains(person)) {
            ratings.put(person, new HashMap<Film, Rating>());
        }
                
        Map personRating = ratings.get(person);
        if (!personRating.containsKey(film)) {
            personRating.put(film, rating);
            addRating(film, rating);
        }
    }
    
    public Rating getRating(Person person, Film film) {
        Map personRating = ratings.get(person);
        Rating returned = Rating.NOT_WATCHED;
        if (personRating.containsKey(film)) {
            returned = (Rating) personRating.get(film);
        }
        return returned;
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person) {
        Map<Film, Rating> muhRatings = new HashMap<Film, Rating>();
        if (ratings.keySet().contains(person)) {
            muhRatings = ratings.get(person);
        }
        return muhRatings;
    }

    public List<Person> reviewers() {
        List<Person> people = new ArrayList<Person>();
        for (Person person : ratings.keySet()) {
            people.add(person);
        }
        return people;
    }
    
}
