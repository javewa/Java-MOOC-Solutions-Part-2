/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author nacht
 */
public class Reference {
    
    private RatingRegister ratings;
    
    public Reference(RatingRegister ratings) {
        this.ratings = ratings;
    }
    
    public Film recommendFilm(Person person) {
        //go through all people and sort films by average rating of each film
        //return film with highest ratng
        
        Film rec = null;
        List<Person> people = ratings.reviewers();
        List<Film> allFilms = new ArrayList<Film>();

        if (people.isEmpty()) {
            for (Film films : ratings.filmRatings().keySet()) {
                allFilms.add(films);
            }
            Collections.sort(allFilms, new FilmComparator(ratings.filmRatings()));
            for (int i = 0; i < allFilms.size(); i++) {
                //if one doesn't match, set i = c and break
                if (!ratings.getPersonalRatings(person).containsKey(allFilms.get(i))) {
                    rec = allFilms.get(i);
                    break;
                //if i hits last film, return null
                }
            }
        } else {
            HashMap<Film, ArrayList<Rating>> totalRatings = new HashMap<Film, ArrayList<Rating>>();
            for (Person persons : people) {
                for (Film films : ratings.getPersonalRatings(persons).keySet()) {
                    if (!totalRatings.keySet().contains(films)) {
                        totalRatings.put(films, new ArrayList<Rating>());
                        allFilms.add(films);
                    }
                
                    List<Rating> theRatings = totalRatings.get(films);
                    theRatings.add(ratings.getPersonalRatings(persons).get(films));
                }
            }
            Collections.sort(allFilms, new FilmComparator(totalRatings));

            for (int i = 0; i < allFilms.size(); i++) {
                //if one doesn't match, set i = c and break
                if (!ratings.getPersonalRatings(person).containsKey(allFilms.get(i))) {
                    rec = allFilms.get(i);
                    break;
                }
            }
        }
    return rec;
}
}
