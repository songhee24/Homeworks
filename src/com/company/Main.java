package com.company;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<City> set = new TreeSet<>();
        set.add(new City(1,"mon"));
        set.add(new City(2,"tu"));
        set.add(new City(3,"wed"));
        set.add(new City(4,"thu"));
        set.add(new City(5,"fri"));
        set.add(new City(6,"sat"));
        set.add(new City(7,"sun"));
        System.out.println(set);

    }


}
class City implements  Comparable{
    int id;
    String day;

    public City(int id, String day) {
        this.id = id;
        this.day = day;
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
        return "DayOfWeek{" +
                "day='" + day + '\'' +
                '}';
    }
}