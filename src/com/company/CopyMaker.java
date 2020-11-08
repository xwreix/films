package com.company;

import java.util.ArrayList;
import java.util.List;

public class CopyMaker {

    public static void copy(List<Film> films) {
        List<Film> copy = new ArrayList<>(films);

        System.out.println("Copy: ");
        for (Film film : copy) {
            film.showInfo();
        }
    }

    public static void copyWithStream(List<Film> films) {
        List<Film> copy = new ArrayList<>();

        films.stream()
                .forEach(copy::add);

        System.out.println("Copy: ");
        copy.stream().forEach(Film::showInfo);
    }

}
