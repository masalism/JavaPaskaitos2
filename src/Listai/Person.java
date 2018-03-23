package Listai;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;

    //konstruktorius
    public Person(String name, String surname) {
        this(name);
        //this.name = name;
        this.surname = surname;
    }

    public Person(String name) {
        this.name = name;
    }

    //tam kad saugotu tik unikalius metodus
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }


    //dedi irasa, ir jei vienodas, paima tik viena
    @Override
    public int hashCode() {

        return Objects.hash(name, surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
}
