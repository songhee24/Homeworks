package com.company;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
/*        ArrayList<Cat> cats = new ArrayList<>();
        LinkedList<Cat> cats1 = new LinkedList<>();
        long startArray = System.currentTimeMillis();
        for (int i = 0;i<1000000;i++){
            cats.add(new Cat());
        }
        for (int i = 0;i<100;i++){
            cats.add(cats.size()/2,new Cat());
        }
        float endArray = System.currentTimeMillis() - startArray;

        long startArrayFirstLast = System.currentTimeMillis();
        for (int i = 0;i<100;i++){
            cats.add(0,new Cat());
            cats.add(new Cat());
        }
        float endArrayFirstLast = System.currentTimeMillis() - startArrayFirstLast;

        long startArrayGet = System.nanoTime();
            cats.get(cats.size()/2);
            cats.get(cats.size()-1);
        float endArrayGet = System.nanoTime() - startArrayGet;

        long startArrayRemove = System.currentTimeMillis();
            cats.remove(cats.size()/2);
            cats.remove(0);
        float endArrayRemove = System.currentTimeMillis() - startArrayRemove;

        //

        long startLinked = System.currentTimeMillis();
        for (int i = 0;i<1000000;i++){
              cats1.add(new Cat());
        }
        for (int i = 0;i<100;i++){
            cats1.add(cats1.size()/2,new Cat());
        }
        float endLinked = System.currentTimeMillis() - startLinked;

        long startLinkedFistLast = System.nanoTime();
        for (int i = 0;i<100;i++){
            cats1.addFirst(new Cat());
            cats1.addLast(new Cat());
        }
        float endLinkedFistLast = System.nanoTime() - startLinkedFistLast;

        long startLinkedGet = System.currentTimeMillis();
            cats1.get(cats1.size()/2);
            cats1.getLast();
        float endLinkedGet = System.currentTimeMillis() - startLinkedGet;

        long startLinkedRemove = System.currentTimeMillis();
            cats1.remove(cats1.size()/2);
            cats1.removeFirst();
        float endLinkedRemove = System.currentTimeMillis() - startLinkedRemove;


        System.out.println("array added all cats:" + endArray );
        System.out.println("array added fist and last:" + endArrayFirstLast );
        System.out.println("array added get:" + endArrayGet);
        System.out.println("array added remove:" + endArrayRemove);
        System.out.println("linked added all cats:" + endLinked);
        System.out.println("linked added fist and last:" + endLinkedFistLast);
        System.out.println("linked added get:" + endLinkedGet);
        System.out.println("linked added remove:" + endLinkedRemove);*/

        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        LinkedList<AbstractAnimal> animalLinkedList = new LinkedList<>();
        LinkedList<AbstractAnimal> catsAndMice = new LinkedList<>();
        for (int i = 1; i < 101;i++){
            animals.add(new Cat("cat",i));
            animals.add(new Dog("dog",i));
        }
        for (int i = 0; i < animals.size();i++){
             animalLinkedList.add(animals.get(i));
        }
        int catCounter = 0;
        for (int i = 0; i < animalLinkedList.size();i++){
             if (animalLinkedList.get(i) instanceof Cat){
                 catCounter++;
                 if (catCounter == 5){
                     animalLinkedList.remove(animalLinkedList.get(i));
                     catCounter = 0;
                 }
             }
        }
        int dogCounter = 0;
        for (int i = 0;i < animalLinkedList.size();i++){
            if (animalLinkedList.get(i) instanceof Dog){
                dogCounter++;
                if (dogCounter % 3 == 0){
                    animalLinkedList.add(animalLinkedList.indexOf(animalLinkedList.get(dogCounter)),new Mouse("mouse",i));
                }
            }
        }
        for (int i = 0; i < animalLinkedList.size();i++){
            if ( animalLinkedList.get(i).equals(animalLinkedList) ){
                System.out.println("s");
            }
        }
        System.out.println(animalLinkedList);
    }
}

