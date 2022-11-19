package models;

import java.util.HashMap;
import java.util.Random;

public class Task {

    public Task() {
    }
    public void addRecord(HashMap<Integer, Integer> sharedResource){
            sharedResource.put(new Random().nextInt(20) + 1, new Random().nextInt(99) + 1);
        try {
            Threads.sleep(500);
        }catch (Exception e){
            System.out.println("Thread  interrupted.");
        }
        // Displaying the HashMap
        System.out.println("Add record method was called -> Current map " + sharedResource + "\n");
    }

    public void removeRecord(HashMap<Integer, Integer> sharedResource){
        int key = new Random().nextInt(20) + 1;
                sharedResource.put(key, 0);
        try {
            Threads.sleep(500);
        }catch (Exception e){
            System.out.println("Thread  interrupted.");
        }
        // Displaying the HashMap
        System.out.println("Remove record method was called -> Current map " + sharedResource + "\n");
    }

    public void retrieveRecord(HashMap<Integer, Integer> sharedResource){
        int key = new Random().nextInt(20) + 1;

                System.out.println("Value retrieve -> " + sharedResource.get(key));
        try {
            Threads.sleep(500);
        }catch (Exception e){
            System.out.println("Thread  interrupted.");
        }
        // Displaying the HashMap
        System.out.println("Retrieve record method was called Current map: " + sharedResource + "\n");
    }

    public void calculateRecord(HashMap<Integer, Integer> sharedResource){

            int sum = sharedResource.values().stream().mapToInt(Integer::intValue).sum();
            System.out.println("Sum -> " + sum);
        try {
            Threads.sleep(500);
        }catch (Exception e){
            System.out.println("Thread  interrupted.");
        }
        // Displaying the HashMap
        System.out.println("Calculate record method was called Current map: " + sharedResource + "\n");
    }

    public void selectRanTask(HashMap<Integer, Integer> sharedResource){
        switch(new Random().nextInt(3) + 1){
            case 1:
                addRecord(sharedResource);
                break;

            case 2:
                removeRecord(sharedResource);
                break;

            case 3:
                retrieveRecord(sharedResource);
                break;

            case 4:
                calculateRecord(sharedResource);
                break;
        }
    }

}
