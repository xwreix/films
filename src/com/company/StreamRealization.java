package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamRealization {
    public static List<Film> copy(List<Film> films) {
        List<Film> copy = films.stream()
                .collect(Collectors.toList());

        return copy;
    }

    public static List<Film> delete(List<Film> film1, List<Film> film2) {
        List<Film> result = new ArrayList<>(film2);

        film1.stream()
                .forEach(result::remove);

        return result;
    }

    public static List<Film> combine(List<Film> films1, List<Film> films2) {
        List<Film> combination = new ArrayList<>(films1);

        films2.stream()
                .forEach(combination::add);

        return combination;
    }

    public static Map<Double, Long> convert(List<Film> films) {
        Map<Double, Long> result = films.stream()
                .collect(Collectors.groupingBy(Film::getRating, Collectors.counting()));

        return result;
    }

    public static List<Film> lettersChecker(List<Film> films) {
        List<Film> result = films.stream()
                .filter(film -> film.getName().matches("^[a-zA-Z]+$"))
                .collect(Collectors.toList());

        return result;
    }

    public static List<Film> intersectionFinding(List<Film> films1, List<Film> films2) {
        List<Film> intersection = films1.stream()
                .filter(films2::contains)
                .collect(Collectors.toList());

        return intersection;
    }

    public static List<Film> ratingFilter(List<Film> films, double rating) {
        List<Film> result = films.stream()
                .filter(film -> film.getRating() > rating)
                .collect(Collectors.toList());

        return result;
    }

    public static List<Film> rangeFilter(List<Film> films, double bottomBound, double upperBound) {
        List<Film> result = films.stream()
                .filter(film -> film.getRating() > bottomBound && film.getRating() < upperBound)
                .collect(Collectors.toList());

        return result;
    }

    public static List<Film> sort(List<Film> films) {
        List<Film> result = films.stream()
                .sorted(Film::compareTo)
                .collect(Collectors.toList());

        return result;
    }

    public static Film maxFinder(List<Film> films) {
        Film max = films.stream()
                .max(Film::compareTo).get();

        return max;
    }

    public static Film minFinder(List<Film> films) {
        Film min = films.stream()
                .min(Film::compareTo).get();

        return min;
    }
}
