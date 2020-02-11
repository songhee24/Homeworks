package com.company.model;

import java.util.HashMap;

public class Main {
   static DBCar dbCar = new DBCar();

    public static void main(String[] args) {
        Car honda = DBCar.getCarByid(1);
        HashMap<Integer, Car> cars = new HashMap<>();
        cars.put(honda.getId(),honda);
        Car bmw = DBCar.getCarByid(2);
        cars.put(bmw.getId(),bmw);
        Car erkin = DBCar.getCarByid(3);
        cars.put(erkin.getId(),erkin);
        for (HashMap.Entry<Integer,Car> entry:cars.entrySet()){
            System.out.println("Key:"+entry.getKey()+" Value: " + entry.getValue());
        }
    }
}




