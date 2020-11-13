package com.company;

public class Film implements Comparable<Film> {
    private final String name;
    private final double rating;

    public Film(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println(this.getName() + ": " + this.getRating());
    }

    @Override
    public String toString() {
        return this.getName() + ": " + this.getRating();
    }

    @Override
    public int compareTo(Film film) {
        if (Double.compare(this.getRating(), film.getRating()) == 0) {
            return this.getName().compareTo(film.getName());
        } else {
            return Double.compare(this.getRating(), film.getRating());
        }
    }
}
