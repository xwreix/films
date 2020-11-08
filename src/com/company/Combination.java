package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Combination {
    public static void combine(List<Film> films1, List<Film> films2) {
        List<Film> comb = new ArrayList<>(films1);
        comb.addAll(films2);

        System.out.println("Combination: ");
        for (Film film : comb) {
            System.out.println(film.getName() + ": " + film.getRating());
        }
    }

    public static void combineWithStream(List<Film> films1, List<Film> films2) {
        Stream<List<Film>> stream1 = Stream.of(films1);
        Stream<List<Film>> stream2 = Stream.of(films2);

        System.out.println("Combination: ");
        Stream.concat(stream1, stream2)
                .forEach(films -> films.forEach(film -> System.out.println(film.getName() + ": " + film.getRating())));
    }
}
