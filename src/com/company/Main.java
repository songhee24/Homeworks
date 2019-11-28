package com.company;

public class Main {

    public static void main(String[] args) {
        Climbing monkey = new Monkey();
        Climbing secondMonkey = new Jocko();
    }
}

class Monkey implements Climbing,EatingFruits{
      Climbing secondMonkey;


      @Override
      public void climb(){

      }

      @Override
      public void eatFruits(){

      }
}

class Jocko implements Climbing,EatingFruits {
    @Override
    public void climb(){

    }

    @Override
    public void eatFruits(){

    }
}