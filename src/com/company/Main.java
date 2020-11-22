package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Film> films1 = new ArrayList<>();
        List<Film> films2 = new ArrayList<>();
        listsFilling(films1, films2);

        System.out.println("Copies:\n" + StreamRealization.copy(films1) + "\n" + StandardRealization.copy(films2));
        System.out.println("\nIntersection:\n" + StreamRealization.intersectionFinding(films1, films2) +
                "\n" + StandardRealization.intersectionFinding(films1, films2));
        System.out.println("\nCombination:\n" + StreamRealization.combine(films1, films2) +
                "\n" + StandardRealization.combine(films1, films2));
        System.out.println("\nSorted:\n" + StreamRealization.sort(films1));
        StandardRealization.sort(films2);
        System.out.println(films2);
        System.out.println("\nDeletion:\n" + StreamRealization.delete(films1, films2) + "\n" +
                StandardRealization.delete(films1, films2));
        System.out.println("\nConverter:\n" + StreamRealization.convert(films1) + "\n" +
                StandardRealization.convert(films2));
        System.out.println("\nFilms with rating higher than 5.0: " + StreamRealization.ratingFilter(films1, 5.0));
        System.out.println("Films with rating higher than 8.0: " + StandardRealization.ratingFilter(films2, 8.0));
        System.out.println("\nFilms with only latin latters:" + StreamRealization.lettersChecker(films1) +
                "\n" + StandardRealization.lettersChecker(films2));
        System.out.println("\nFilms in the range from 3.0 to 5.0"
                + StreamRealization.rangeFilter(films1, 3.0, 5.0));
        System.out.println("Films in the range from 6.0 to 9.6" +
                StandardRealization.rangeFilter(films2, 6.0, 9.6));

        System.out.println("\nMax:");
        try {
            System.out.println(StreamRealization.maxFinder(films1) + "\n"
                    + StandardRealization.maxFinder(films2));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\nMin:");
        try {
            System.out.println(StreamRealization.minFinder(films1) + "\n" + StandardRealization.minFinder(films2));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void listsFilling(List<Film> films1, List<Film> films2) {
        Film film1 = new Film("FilmOne1", 5.6);
        Film film2 = new Film("FilmTwo", 9.2);
        Film film3 = new Film("FilmThree", 3.6);
        Film film4 = new Film("FilmFour", 7.8);
        Film film5 = new Film("FilmFive", 10.0);
        Film film6 = new Film("FilmSix", 5.6);

        films1.add(film1);
        films1.add(film2);
        films1.add(film3);
        films1.add(film6);

        films2.add(film4);
        films2.add(film6);
        films2.add(film1);
        films2.add(film5);
    }
}
