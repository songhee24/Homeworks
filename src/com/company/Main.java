package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
         City[] cities = {
                 new City(2,"asdaaaa"),
                 new City(3,"asaaasd"),
                 new City(4,"fgh"),
                 new City(5,"asd"),
         };
        TreeSet<City> set = new TreeSet<>();
        HashSet<City> set1 = new HashSet<>();

         for (int i = 0; i < cities.length;i++){
             if(numberCheck(cities[i])){
                 set1.add(cities[i]);
             } else set.add(cities[i]);
         }

         for (int i = 0; i < cities.length;i++){
             if (nameCheck(cities[i])){
                 set.remove(cities[i]);
                 set1.remove(cities[i]);
             }
         }

        System.out.println("tree " + set);
        System.out.println("hash " +set1);
    }

     public static boolean numberCheck(City city){
        if (city.getId() % 2 == 0) return true;
        return false;
     }

     public static boolean nameCheck(City city){
        if (city.getName().length() > 5) return true;
        return false;
     }


}
class City implements  Comparable{
    int id;
    String name;

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof City)) return 0;
        City temp = (City) o;
        if (this.id > temp.id) return 1;
        else if( this.id < temp.id) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "" + name + " " + id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}