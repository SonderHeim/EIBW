package com.cursed.Cursed.DAO;

import com.cursed.Cursed.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;
    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "Den"));
        people.add(new Person(++PEOPLE_COUNT, "Orange"));
    }
    public List<Person> people(){
        return people;
    }
    public Person showPerson(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}