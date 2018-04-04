package ru.job4j.professions;

public class Engineer extends Profession {
    public Engineer(String name) {
        this.setProfession("Engineer");
        this.setName(name);
    }

    public void build(House house) {
    house.setSquare(house.getSquare()+1);
    }
}
