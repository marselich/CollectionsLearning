package ru.sinergy;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Arrays
        Cat[] cats = new Cat[3];

        cats[0] = new Cat("Мурка");
        cats[1] = new Cat("Барсик");
        cats[2] = new Cat("Черныш");

       // cats[1] = null;

        System.out.println(Arrays.toString(cats));


        //ArrayList
        ArrayList<Cat> catsList = new ArrayList();

        for(Cat cat : cats) {
            catsList.add(cat);
        }

        catsList.add(new Cat("Барсик"));

//        catsList.remove(1);

        Cat cat = catsList.get(0);
        System.out.println(cat);

        System.out.println(catsList.indexOf(cat));

        catsList.add(2, cat);
        catsList.add(2, new Cat("Меня сюда вставили"));

//        catsList.removeAll(Arrays.asList(cat, catsList.get(3)));

        System.out.println(catsList.toString());

        System.out.println(catsList.size());

        //LinkedList

        String str1 = new String("Hello world");
        String str2 = new String("My name is Marsell");
        String str3 = new String("I love java");

        LinkedList<String> myBio = new LinkedList();

        myBio.add(str1);
        myBio.add(str2);
        myBio.add(str3);

        System.out.println(myBio);

        myBio.remove();

        System.out.println(myBio);

        //Linked list on practice
        LinkedList<Car> cars = new LinkedList();
        Car ferrari = new Car("Ferrari cool");
        Car toyota = new Car("toyota corolla");
        Car gelik = new Car("Gelik");

        cars.addAll(Arrays.asList(ferrari,toyota,gelik));
        System.out.println(cars);

        cars.addFirst(new Car("Ford gt300"));
        cars.addLast(new Car("Lada Sedan"));

        System.out.println(cars);

        System.out.println(cars.pollFirst());
        System.out.println(cars);

        // ArrayList vs LinkedList

//        List<Integer> list = new LinkedList<>();
//
//        for(int i = 0; i < 5000000; i++) {
//            list.add(i);
//        }
//
//        long start = System.currentTimeMillis();
//
//        for(int i = 0; i < 100; i++) {
//            list.add(2000000, Integer.MAX_VALUE);
//        }
//
//        System.out.println("Время работы для LinkedList в (мл): " +
//                (System.currentTimeMillis() - start));
//
//        list = new ArrayList<>();
//
//        for(int i = 0; i < 5000000; i++) {
//            list.add(i);
//        }
//
//        start = System.currentTimeMillis();
//
//        for(int i = 0; i < 100; i++) {
//            list.add(2000000, Integer.MAX_VALUE);
//        }
//
//        System.out.println("Время работы для ArrayList в (мл): " +
//                (System.currentTimeMillis() - start));


        // Set

        Set<String> states = new HashSet();
        states.add("Germany");
        states.add("France");
        states.add("Italy");

        boolean isAdded = states.add("Italy");

        System.out.println("Italy is added: " + isAdded);

        System.out.println("Set contains: " + states.size());

        System.out.println(states);

        states.remove("Germany");

        System.out.println(states);

        HashSet<Cat> catsHashSet = new HashSet<>(catsList);

        System.out.println(catsHashSet);

        TreeSet<Cat> catTreeSet = new TreeSet(catsList);

        System.out.println(catTreeSet);

        // Map
    }
}