package com.company;

public class FirstThread implements Runnable {
    int numbering;
    static int num;
    @Override
    public void run(){
        if (numbering == 1){
            System.out.println("1: " + (num *= 2));
        }
        if (numbering == 2){
            System.out.println("2: " + (num /= 2));
        }
        if (numbering == 3){
            System.out.println("3: " + (num += 2));
        }
        if (numbering == 4){
            System.out.println("4: " + (num -= 2));
        }
    }

    public FirstThread(int numbering, int num) {
        this.numbering = numbering;
        this.num = num;
    }
}
