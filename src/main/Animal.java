package main;

import java.time.LocalDate;

public class Animal {
    private String nickname;
    private Owner owner;
    private LocalDate birthDate;
    public Illness illness;

    public Animal(String nickname, Owner owner, LocalDate birthDate, Illness illustrious) {
        this.nickname = nickname;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illustrious;
    }

    public String getNickName() {
        return this.nickname;
    }

    // 1:11:39

}
