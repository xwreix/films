package com.company;

import java.util.List;

public class Sorting {
    public static void sort(List<Film> films) {
        films.sort(Film::compareTo);

        System.out.println("Sorted list: ");
        for (Film film : films) {
            System.out.println(film.getName() + ": " + film.getRating());
        }
    }

    public static void sortWithStream(List<Film> films) {
        System.out.println("Sorted list: ");

        films.stream()
                .sorted(Film::compareTo)
                .forEach(film -> System.out.println(film.getName() + ": " + film.getRating()));
    }
}
