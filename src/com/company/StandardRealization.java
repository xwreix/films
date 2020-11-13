package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StandardRealization {
    public static List<Film> copy(List<Film> films) {
        List<Film> copy = new ArrayList<>(films);

        return copy;
    }

    public static List<Film> combine(List<Film> films1, List<Film> films2) {
        List<Film> combination = new ArrayList<>(films1);
        combination.addAll(films2);

        return combination;
    }

    public static List<Film> delete(List<Film> films1, List<Film> films2) {
        List<Film> result = new ArrayList<>(films2);
        result.removeAll(films1);

        return result;
    }

    public static Map<Double, Integer> convert(List<Film> filmList) {
        Map<Double, Integer> films = new HashMap<>();

        for (Film film : filmList) {
            if (films.containsKey(film.getRating())) {
                int counter = films.get(film.getRating());
                counter++;
                films.put(film.getRating(), counter);
            } else {
                films.put(film.getRating(), 1);
            }
        }

        return films;
    }

    public static List<Film> lettersChecker(List<Film> films) {
        List<Film> incorrect = new ArrayList<>();
        List<Film> result = new ArrayList<>(films);

        for (Film film : films) {
            if (!film.getName().matches("^[a-zA-Z]+$")) {
                incorrect.add(film);
            }
        }

        result.removeAll(incorrect);

        return result;
    }

    public static List<Film> intersectionFinding(List<Film> films1, List<Film> films2) {
        List<Film> intersection = new ArrayList<>();

        for (Film film : films1) {
            if (films2.contains(film)) {
                intersection.add(film);
            }
        }

        return intersection;
    }

    public static List<Film> ratingFilter(List<Film> films, double rating) {
        List<Film> result = new ArrayList<>();

        for (Film film : films) {
            if (film.getRating() > rating) {
                result.add(film);
            }
        }

        return result;
    }

    public static List<Film> rangeFilter(List<Film> films, double bottomBound, double upperBound) {
        List<Film> result = new ArrayList<>();

        for (Film film : films) {
            if (film.getRating() < upperBound && film.getRating() > bottomBound) {
                result.add(film);
            }
        }

        return result;
    }

    public static void sort(List<Film> films) {
        films.sort(Film::compareTo);
    }

    public static Film maxFinder(List<Film> films) {
        Film max = new Film(null, 0);

        for (Film film : films) {
            if (film.getRating() > max.getRating()) {
                max = film;
            }
        }

        return max;
    }

    public static Film minFinder(List<Film> films) {
        Film min = new Film(null, 100);

        for (Film film : films) {
            if (film.getRating() < min.getRating()) {
                min = film;
            }
        }

        return min;
    }
}
