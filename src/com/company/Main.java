package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
/*        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("Ветер с моря дул");
        list1.add("Нагонял беду");
        list1.add("И сказал ты мне");
        list1.add("Больше не приду");

        for (int i = 0; i < 4;i++){
            list1.set(i,list1.get(i).concat(list1.get(i)));
            if (list1.get(i).length() > 20){
                list2.add(list1.get(i));
            }
        }
        list2.remove(2);
        System.out.println("list1: "+list1);
        System.out.println("list2: "+list2);*/

        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        ArrayList<Integer> numbers3 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50;i++){
            numbers1.add(random.nextInt(101));
            if (numbers1.get(i) % 2 != 0){
                numbers2.add(i);
            } else if (numbers1.get(i) % 2 == 0) {
                numbers3.add(i);
            };
        }


        System.out.println(numbers2);
        System.out.println(numbers2.size());
        System.out.println(numbers3);
        System.out.println(numbers3.size());
    }
}
