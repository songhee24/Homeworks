package com.company;

public interface CanSelect {
      default void select(AbstractAnimal[] animals){
             for (int i = 0; i < animals.length;i++){
                    if (animals[i] instanceof Duck) {
                        System.out.println(animals[i]);
                    } else if (animals[i] instanceof Shark){
                        System.out.println(animals[i]);
                    }

             }
      }
}
