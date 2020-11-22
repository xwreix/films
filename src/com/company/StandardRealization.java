package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StandardRealization {
    private final static double MAX_RATING = 10;
    private final static double MIN_RATING = 0;

    public static List<Film> copy(List<Film> films) {
        return new ArrayList<>(films);
    }

    public static List<Film> combine(List<Film> films1, List<Film> films2) {
        List<Film> combination = copy(films1);
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
            double rating = film.getRating();

            if (films.containsKey(rating)) {
                int counter = films.get(rating);
                counter++;
                films.put(rating, counter);
            } else {
                films.put(rating, 1);
            }
        }

        return films;
    }

    public static List<Film> lettersChecker(List<Film> films) {
        List<Film> result = copy(films);

        result.removeIf(film -> film.getName().matches("^[a-zA-Z]+$"));

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
        Film max = films.get(0);

        for (Film film : films) {
            if (film.getRating() > MAX_RATING) {
                throw new IllegalArgumentException(film.toString() +
                        " is with rating higher than maximum available rating");
            } else if (film.getRating() >= max.getRating()) {
                max = film;
            }
        }

        return max;
    }

    public static Film minFinder(List<Film> films) {
        Film min = films.get(0);

        for (Film film : films) {
            if (film.getRating() < MIN_RATING) {
                throw new IllegalArgumentException(film.toString() +
                        " is with rating less than minimum available rating");
            } else if (film.getRating() <= min.getRating()) {
                min = film;
            }
        }

        return min;
    }
}
