package com.company;

import java.util.TreeSet;

public class Main {
    static int a = 2;
    public static void main(String[] args) {
       Thread t1 = new Thread(new FirstThread(1,a));
       Thread t2 = new Thread(new FirstThread(2,a));
       Thread t3 = new Thread(new FirstThread(3,a));
       Thread t4 = new Thread(new FirstThread(4,a));
       t1.start();
       t2.start();
       t3.start();
       t4.start();
    }


}