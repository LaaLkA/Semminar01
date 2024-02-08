package main;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Sunny", new Owner("Nick", "male"),
                LocalDate.of(2021, 10, 05), new Illness("herpes")); // created a animal "cat"
        System.out.println(cat.getNickName());
        System.out.println(Owner.getOwner());

    }
}
