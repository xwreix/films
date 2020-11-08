package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Film> films1 = new ArrayList<>();
        List<Film> films2 = new ArrayList<>();
        listsFilling(films1, films2);

        CopyMaker.copy(films1);
        CopyMaker.copyWithStream(films2);
        System.out.println();

        IntersectionFinder.intersectionFinding(films1, films2);
        IntersectionFinder.intersectionWithStream(films1, films2);
        System.out.println();

        Combination.combine(films1, films2);
        Combination.combineWithStream(films1, films2);
        System.out.println();

        Sorting.sort(films1);
        Sorting.sort(films2);
        System.out.println();

        Deletion.delete(films1, films2);
        Deletion.deleteWithStream(films1, films2);
        System.out.println();

        ConverterToMap.convert(films1);
        ConverterToMap.convertWithStream(films2);
        System.out.println();

        RatingFilter.filter(films1, 4.6);
        RatingFilter.filterWithStream(films2, 8.0);
        System.out.println();

        LettersChecker.check(films1);
        LettersChecker.checkWithStream(films2);
        System.out.println();

        RangeFilter.filter(films1, 3.0, 9.9);
        RangeFilter.filterWithStream(films2, 5.5, 7.0);
        System.out.println();

        MaxAndMinFinder.finder(films1);
        MaxAndMinFinder.finderWithStream(films2);
        System.out.println();
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
