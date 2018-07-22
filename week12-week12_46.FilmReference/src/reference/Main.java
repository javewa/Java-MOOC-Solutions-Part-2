package reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;


public class Main {

    public static void main(String[] args) {
        // Test your code here
        RatingRegister rek = new RatingRegister();
        Person h1 = new Person("Pekka");
        Person h2 = new Person("Arto");
        rek.addRating(h1, new Film("Pulp fiction"), Rating.FINE);
        rek.addRating(h1, new Film("Eraserhead"), Rating.GOOD);
        rek.addRating(h2, new Film("Eraserhead"), Rating.BAD);
        rek.addRating(h2, new Film("Pulp fiction"), Rating.NEUTRAL);
        rek.addRating(h2, new Film("Rambo"), Rating.GOOD);
        System.out.println(rek.getRating(h1, new Film("Pulp fiction")));
        System.out.println(rek.getPersonalRatings(h1));
    }
}
