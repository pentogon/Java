package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
        cats.add(this);
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (Cat cat: cats) {
            System.out.println(cat);
        }
    }
}
