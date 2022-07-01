package ru.sinergy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        Cat[] cats = new Cat[3];

        cats[0] = new Cat("Мурка");
        cats[1] = new Cat("Барсик");
        cats[2] = new Cat("Черныш");

       // cats[1] = null;

        System.out.println(Arrays.toString(cats));

        ArrayList<Cat> catsList = new ArrayList();

        for(Cat cat : cats) {
            catsList.add(cat);
        }

        catsList.add(new Cat("Алешка"));

        catsList.remove(1);

        Cat cat = catsList.get(0);
        System.out.println(cat);

        System.out.println(catsList.indexOf(cat));

        catsList.add(2, cat);
        catsList.add(2, new Cat("Меня сюда вставили"));

        catsList.removeAll(Arrays.asList(cat, catsList.get(3)));

        System.out.println(catsList.toString());

        System.out.println(catsList.size());

    }
}