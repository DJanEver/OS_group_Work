package models.utils;

import models.Processes;

import java.util.*;

public class Services {
    public Services() {
    }

    public HashMap<Integer, Integer> populateMap(){
        HashMap<Integer, Integer> sharedResource = new HashMap<Integer, Integer>();
        for(int i = 1; i<=20; i++){
            sharedResource.put(i,0);
        }
        return sharedResource;
    }

    public Queue<Processes> populateAndSortQueue(){
        Processes temp;
        Processes[] tempArray = {new Processes(), new Processes(),new Processes(),
                new Processes(), new Processes(), new Processes(), new Processes(),
                new Processes(), new Processes(), new Processes(), new Processes(),
                new Processes(), new Processes(), new Processes(), new Processes(),
                new Processes(), new Processes(), new Processes(), new Processes(),
                new Processes(),};


        //Sorting according to arrival time
        for(int i = 0; i < 20; i++ ){
            for(int n = 0; n < 20-(i+1); n++){
                if(tempArray[n].getArrivalTime() > tempArray[n+1].getArrivalTime()){
                    temp = tempArray[n];
                    tempArray[n] = tempArray[n+1];
                    tempArray[n+1] = temp;

                }
            }
        }
        ArrayList<Processes> processesArrayList = new ArrayList<>(Arrays.asList(tempArray));
        return new LinkedList<>(processesArrayList);
    }
}

//Calculating the completion time
