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

        System.out.println(catsList.toString());
    }
}