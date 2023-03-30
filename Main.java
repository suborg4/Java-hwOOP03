package org.example.hwOOP03;

// Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
// Добавить Comparable и/или Comparator к приложению, 
// написанному на семинаре(Файлы прикреплены под уроком)

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListOfDogs listDogs = new ListOfDogs();
        listDogs.setListDogs(Arrays.asList(
                new Dog("Тузик", 3, "Серый"),
                new Dog("Найда", 5, "Рыжый"),
                new Dog("Малыш", 1, "Белый")));

        System.out.println("Перебор итератором");
        Iterator<Dog> iter = listDogs.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("Сортировка ComparableOfNameDog по имени");
        listDogs.getListDogs().sort(new ComparableOfNameDog());
        for (Dog dog: listDogs){
            System.out.println(dog);
        }

        System.out.println("Сортировка через ссылку на метод по цвету");
        listDogs.getListDogs().sort(Comparator.comparing(Dog::getColor));
        listDogs.forEach(System.out::println);
    }
}