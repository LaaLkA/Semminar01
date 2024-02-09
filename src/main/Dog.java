package main;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness illustrious) {
        super(nickname, owner, birthDate, illustrious);
    }

    public Dog() {
        super();
    }
}
