package com.company;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        String[] names = {
                "oneDalmatian", "twoDalmatian","threeDalmatian","fourDalmatian", "fiveDalmatian","sixDalmatian",
                "sevenDalmatian", "eightDalmatian","nineDalmatian","tenDalmatian", "elevenDalmatian","twelveDalmatian",
                "thirteenDalmatian", "fourteenDalmatian","fifteenDalmatian","sixteenDalmatian", "seventeenDalmatian","eighteenDalmatian","nineteenDalmatian"
        };

        Random random = new Random();
        Set<Dog>set = new HashSet<>();
        for (int i = 0; i < 40;i++){
            set.add(new Dog(i,names[random.nextInt(19)]));

        }
        System.out.println(set.size());

        for (Dog d:set){
            d.tellAboutYourSelf(set);
        }






    }


}
class Dog {
    private int age;
    private String name;


    public Dog(int age,String name) {
        this.age = age;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Dog tellAboutYourSelf(Set<Dog> dog){
        for (Dog d: dog){
            System.out.println(d.age +" " + d.name);
        }
        return null;
    }
}
