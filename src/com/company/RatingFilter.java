package com.company;

import java.util.List;

public class RatingFilter {
    public static void filter(List<Film> films, double rating) {
        System.out.println("Films with rating higher than " + rating);

        for (Film film : films) {
            if (film.getRating() > rating) {
                System.out.println(film.getName() + ":  " + film.getRating());
            }
        }

    }

    public static void filterWithStream(List<Film> films, double rating) {
        System.out.println("Films with rating higher than " + rating);

        films.stream()
                .filter(film -> film.getRating() > rating)
                .forEach(film -> System.out.println(film.getName() + ":  " + film.getRating()));
    }
}
