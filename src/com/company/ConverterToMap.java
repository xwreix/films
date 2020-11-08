package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConverterToMap {

    public static void convert(List<Film> filmList) {
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

        System.out.println(films);
    }

    public static void convertWithStream(List<Film> films1) {
        List<Film> filmList = new ArrayList<>(films1);

        for (int i = 0; i < filmList.size(); i++) {

            for (int j = i + 1; j < filmList.size(); j++) {
                if (filmList.get(i).getRating() == filmList.get(j).getRating()) {
                    int amount = filmList.get(i).getAmount();
                    amount++;
                    filmList.get(i).setAmount(amount);
                    filmList.remove(j);
                }
            }

        }

        Map<Double, Integer> films = filmList.stream()
                .collect(Collectors.toMap(Film::getRating, Film::getAmount));

        System.out.println(films);
    }
}
