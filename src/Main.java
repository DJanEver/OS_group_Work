import models.Processes;
import models.Threads;
import models.utils.Services;

import java.util.HashMap;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Populating Queue and initializing the hash map.

        Services services = new Services();
        boolean flag = false;
        Queue<Processes> processesQueue = services.populateAndSortQueue();
        HashMap<Integer, Integer> sharedResource = services.populateMap();
        Queue<Processes> processesQueueCopy = processesQueue;


        Threads thread1 = new Threads(sharedResource, processesQueueCopy);
        Threads thread2 = new Threads(sharedResource, processesQueueCopy);
        Threads thread3 = new Threads(sharedResource, processesQueueCopy);
        Threads thread4 = new Threads(sharedResource, processesQueueCopy);



        thread1.start();
        try {
            thread1.join();

        } catch (Exception e) {
            System.out.println("Interrupted");
        }


        thread2.start();
        try {
            thread2.join();

        } catch (Exception e) {
            System.out.println("Interrupted");
        }

        thread3.start();
        try {
            thread3.join();

        } catch (Exception e) {
            System.out.println("Interrupted");
        }

        thread4.start();
        try {
            thread4.join();

        } catch (Exception e) {
            System.out.println("Interrupted");
        }



    }
}