package ru.job4j.professions;

public class Teacher extends Profession {

    public Teacher(String name) {
        this.setProfession("Teacher");
        this.setName(name);
    }

    public void teach(Student student) {

    }
}
