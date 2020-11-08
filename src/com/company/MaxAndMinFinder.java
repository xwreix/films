package com.company;

import java.util.List;

public class MaxAndMinFinder {
    public static void finder(List<Film> films) {
        Film max = new Film(null, 0);
        Film min = new Film(null, 100);

        for (Film film : films) {
            if (film.getRating() > max.getRating()) {
                max = film;
            }
            if (film.getRating() < min.getRating()) {
                min = film;
            }
        }

        System.out.println("Film with max rating: " + max.getName() + ":  " + max.getRating());
        System.out.println("Film with min rating: " + min.getName() + ":  " + min.getRating());
    }

    public static void finderWithStream(List<Film> films) {
        Film max = films.stream()
                .max(Film::compare).get();
        Film min = films.stream()
                .min(Film::compare).get();

        System.out.println("Film with max rating: " + max.getName() + ":  " + max.getRating());
        System.out.println("Film with min rating: " + min.getName() + ":  " + min.getRating());
    }
}
