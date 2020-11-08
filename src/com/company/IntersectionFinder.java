package com.company;

import java.util.ArrayList;
import java.util.List;

public class IntersectionFinder {
    public static void intersectionFinding(List<Film> films1, List<Film> films2) {
        List<Film> intersection = new ArrayList<>();

        for (Film current : films1) {

            for (Film film : films2) {
                if (current.equals(film)) {
                    intersection.add(current);
                    break;
                }
            }

        }

        if (intersection.isEmpty()) {
            System.out.println("No common elements");
        } else {
            System.out.println("Common elements: ");
            for (Film film : intersection) {
                film.showInfo();
            }
        }

    }

    public static void intersectionWithStream(List<Film> films1, List<Film> films2) {
        System.out.println("Common elements:");

        films1.stream()
                .forEach(current ->
                        films2.stream().filter(film -> film.equals(current)).forEach(Film::showInfo));

    }
}
