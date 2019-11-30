package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        AbstractAnimal[] aquarium = new AbstractAnimal[10];
        Random random = new Random();
        double duckWeights[] = {0.70, 0.82, 1.76, 0.53, 1.20};
        double sharkWeights[] = {654, 812, 750, 1100, 736};
        String[] duckNames = {"duck1","duck2","duck3","duck4","duck5"};
        String[] sharkNames = {"shark1","shark2","shark3","shark4","shark5"};

        for (int i = 0; i <aquarium.length; i++ ) {
            if (i < 5) {
                aquarium[i] = new Duck(duckWeights[random.nextInt(5)],duckNames[random.nextInt(5)]);
                aquarium[i].select(aquarium);
            } else if(i < 10) {
                aquarium[i] = new Shark(sharkWeights[random.nextInt(5)],sharkNames[random.nextInt(5)]);
                aquarium[i].select(aquarium);
            }
        }


    }
}

