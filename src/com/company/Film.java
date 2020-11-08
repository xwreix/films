package com.company;

public class Film implements Comparable<Film> {
    private final String name;
    private final double rating;
    private int amount = 1;

    public Film(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

    public boolean equals(Film film) {
        if (this.name == film.name && this.rating == film.rating) {
            return true;
        } else {
            return false;
        }
    }

    public static int compare(Film film1, Film film2) {
        if (film1.getRating() > film2.getRating()) {
            return 1;
        } else return -1;
    }

    @Override
    public int compareTo(Film film) {
        if (this.getRating() - film.getRating() == 0) {
            return this.getName().compareTo(film.getName());
        } else {
            return (int) (this.getRating() - film.getRating());
        }
    }
}
