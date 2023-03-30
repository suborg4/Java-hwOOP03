package org.example.hwOOP03;

import java.util.Comparator;

public class ComparableOfNameDog implements Comparator<Dog> {
    @Override
    public int compare(Dog dog1, Dog dog2) {
        return dog1.getName().compareTo(dog2.getName());
    }
}