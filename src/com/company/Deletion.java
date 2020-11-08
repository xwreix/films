package com.company;

import java.util.ArrayList;
import java.util.List;

public class Deletion {

    public static void delete(List<Film> film1, List<Film> film2) {
        List<Film> films1 = new ArrayList<>(film1);
        List<Film> films2 = new ArrayList<>(film2);

        for (Film film : films1) {
            films2.remove(film);
        }

        System.out.println("The second list without elements that are in first: ");
        for (Film film : films2) {
            film.showInfo();
        }
    }

    public static void deleteWithStream(List<Film> film1, List<Film> film2) {
        List<Film> films1 = new ArrayList<>(film1);
        List<Film> films2 = new ArrayList<>(film2);

        films1.stream()
                .forEach(films2::remove);

        System.out.println("The second list without elements that are in first: ");
        films2.stream()
                .forEach(Film::showInfo);
    }

}
