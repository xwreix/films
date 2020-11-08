package com.company;

import java.util.List;

public class RangeFilter {

    public static boolean filter(List<Film> films, double bottomBound, double upperBound) {
        for (Film film : films) {
            if (film.getRating() > upperBound || film.getRating() < bottomBound) {
                falseInput(films, bottomBound, upperBound);
                return false;
            }
        }

        trueInput(films, bottomBound, upperBound);
        return true;
    }

    public static void filterWithStream(List<Film> films, double bottomBound, double upperBound) {
        if (films.stream()
                .allMatch(film -> film.getRating() > bottomBound && film.getRating() < upperBound)) {
            trueInput(films, bottomBound, upperBound);
        } else {
            falseInput(films, bottomBound, upperBound);
        }
    }

    public static void falseInput(List<Film> films, double bottomBound, double upperBound) {
        System.out.println("Among the films below not all are in the range from " + bottomBound + " to " + upperBound);
        films.forEach(Film::showInfo);
    }

    public static void trueInput(List<Film> films, double bottomBound, double upperBound) {
        System.out.println("All the films below are in the range from " + bottomBound + " to " + upperBound);
        films.forEach(Film::showInfo);
    }
}
