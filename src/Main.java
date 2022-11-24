import models.Processes;
import models.Threads;
import models.utils.Services;

import java.util.HashMap;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Populating Queue and initializing the hash map.

        Services services = new Services();
        Queue<Processes> processesQueue = services.populateAndSortQueue();
        HashMap<Integer, Integer> sharedResource = services.populateMap();
        Queue<Processes> processesQueueCopy = processesQueue;


        Threads thread1 = new Threads(sharedResource, processesQueueCopy);
        Threads thread2 = new Threads(sharedResource, processesQueueCopy);
        Threads thread3 = new Threads(sharedResource, processesQueueCopy);
        Threads thread4 = new Threads(sharedResource, processesQueueCopy);


        System.out.println("\n\n\n\n***********************************************************************************************************");
        System.out.println("\t\t\t\t\t\tThread 0 LIST DISPLAY ");
        System.out.println("***********************************************************************************************************");


        thread1.start();
        try {
            thread1.join();

        } catch (Exception e) {
            System.out.println("Interrupted");
        }



        System.out.println("\n\n\n\n***********************************************************************************************************");
        System.out.println("\t\t\t\t\t\tThread 1 LIST DISPLAY ");
        System.out.println("***********************************************************************************************************");
        thread2.start();
        try {
            thread2.join();

        } catch (Exception e) {
            System.out.println("Interrupted");
        }

        System.out.println("\n\n\n\n***********************************************************************************************************");
        System.out.println("\t\t\t\t\t\tThread 2 LIST DISPLAY ");
        System.out.println("***********************************************************************************************************");
        thread3.start();
        try {
            thread3.join();

        } catch (Exception e) {
            System.out.println("Interrupted");
        }


        System.out.println("\n\n\n\n***********************************************************************************************************");
        System.out.println("\t\t\t\t\t\tThread 3 LIST DISPLAY ");
        System.out.println("***********************************************************************************************************");
        thread4.start();
        try {
            thread4.join();

        } catch (Exception e) {
            System.out.println("Interrupted");
        }



    }
}