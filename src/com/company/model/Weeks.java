package com.company.model;

import java.util.LinkedHashMap;
import java.util.Objects;

public class Weeks {
    public static String days [] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public static int daysOfWeek = 7;

     public int intt;

    static Weeks[] weekdays = new Weeks[daysOfWeek];

      static   {
         for (int i = 0; i < daysOfWeek; i++) {
             weekdays[i] = new Weeks(i);
         }
     }

    public Weeks(int intt) {
        this.intt = intt;
    }

    public static Weeks valueOfV(int value) {
        return weekdays[value];
    }




    public static void main(String[] args) {
        LinkedHashMap<Weeks,Integer> map  = new LinkedHashMap<>();
        int count[] = new int[daysOfWeek];
        for (int i =0; i < 100;i++){
            Weeks value = valueOfV((int) (Math.random() * daysOfWeek));
            count[value.intt]++;
            int prevCount = map.getOrDefault(value,0);
            map.put(value,++prevCount);
        }
        for (int i = 0; i < count.length; i++) {
            System.out.format("%s - %d,\thash = %d%n", days[i], count[i], Weekday.valueOf(i).hashCode());
        }

        System.out.println(map);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Weeks weeks = (Weeks) o;
        return Objects.equals(intt, weeks.intt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intt);
    }

    @Override
    public String toString() {
        return "key " + intt + " value";
    }
}
