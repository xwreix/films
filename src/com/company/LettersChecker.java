package com.company;

import java.util.List;

public class LettersChecker {
    public static void check(List<Film> films) {
        for (Film film : films) {
            if (film.getName().matches("^[a-zA-Z]+$")) {
            } else {
                film.showInfo();
                System.out.println("contains not only latin letters");
            }
        }
    }

    public static void checkWithStream(List<Film> films) {
        System.out.println("Films that contain only latin letters: ");

        films.stream()
                .filter(film -> film.getName().matches("^[a-zA-Z]+$"))
                .forEach(Film::showInfo);
    }

}
