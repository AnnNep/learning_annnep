package org.example.lesson20.person;

import java.util.Objects;

public class Person implements Comparable<Person>{

    private int id;
    private String name;
    private String lastName;

    public Person(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

//Нельзя вызывть метод у объекта, который налл
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName);
    }
//getClass - метод класса обджект, в котором лежит объект (Person)
    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName);
    }

    //После реализации этих методов икуалс и хэшкод тепер будут создаваться не на основе ссылки, а на основе данных

//Переопределили метод ту стринг, чтобы в красивом варианте отображалась информация об объекте
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.id, o.id); //то же самое, что снизу, но лаконичнее
//        if (id < o.id) return -1;
//        else if (id > o.id) return 1;
//        else return 0;
    }
}
