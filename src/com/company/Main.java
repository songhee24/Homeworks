package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int array1[] = new int[10];
        int temp = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(2);
        }
        System.out.println();
        arraySort(array1);
        for (int i = 0; i <array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10;i++){
            arrayList.add(random.nextInt(2));
        }
        listSort(arrayList);
        System.out.print(arrayList);
        System.out.println();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0;i< 10;i++){
            linkedList.add(random.nextInt(2));
        }
        linkedSort(linkedList);
        System.out.println(linkedList);



    }

    public static void arraySort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    public static void listSort(ArrayList<Integer> arr){
        for(int i = arr.size()-1; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr.get(j) > (arr.get(j+1)) ){
                    int tmp = arr.get(j);
                    arr.set(arr.get(j),arr.get(j+1));
                    arr.set((j+1),tmp);
                }
            }
        }
    }
    public static void linkedSort(LinkedList<Integer> arr){
        for(int i = arr.size()-1; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr.get(j) > (arr.get(j+1)) ){
                    int tmp = arr.get(j);
                    arr.set(arr.get(j),arr.get(j+1));
                    arr.set((j+1),tmp);
                }
            }
        }
    }
}















