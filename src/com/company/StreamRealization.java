package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRealization {
    public static List<Film> copy(List<Film> films) {
        return films.stream()
                .collect(Collectors.toList());
    }

    public static List<Film> delete(List<Film> film1, List<Film> film2) {
        List<Film> result = copy(film2);
        List<Film> intersection = intersectionFinding(film1, film2);
        result.removeAll(intersection);

        return result;
    }

    public static List<Film> combine(List<Film> films1, List<Film> films2) {
        List<List<Film>> comb = Stream.concat(Stream.of(films1), Stream.of(films2))
                .collect(Collectors.toList());

        List<Film> combination = new ArrayList<>(comb.get(0));
        combination.addAll(comb.get(1));

        return combination;
    }

    public static Map<Double, Long> convert(List<Film> films) {
        return films.stream()
                .collect(Collectors.groupingBy(Film::getRating, Collectors.counting()));
    }

    public static List<Film> lettersChecker(List<Film> films) {
        return films.stream()
                .filter(film -> film.getName().matches("^[a-zA-Z]+$"))
                .collect(Collectors.toList());
    }

    public static List<Film> intersectionFinding(List<Film> films1, List<Film> films2) {
        return films1.stream()
                .filter(films2::contains)
                .collect(Collectors.toList());
    }

    public static List<Film> ratingFilter(List<Film> films, double rating) {
        return films.stream()
                .filter(film -> film.getRating() > rating)
                .collect(Collectors.toList());
    }

    public static List<Film> rangeFilter(List<Film> films, double bottomBound, double upperBound) {
        return films.stream()
                .filter(film -> film.getRating() > bottomBound && film.getRating() < upperBound)
                .collect(Collectors.toList());
    }

    public static List<Film> sort(List<Film> films) {
        return films.stream()
                .sorted(Film::compareTo)
                .collect(Collectors.toList());
    }

    public static Film maxFinder(List<Film> films) {
        return films.stream()
                .max(Film::compareTo).get();
    }

    public static Film minFinder(List<Film> films) {
        return films.stream()
                .min(Film::compareTo).get();
    }
}
