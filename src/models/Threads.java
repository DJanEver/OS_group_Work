package models;

import java.util.HashMap;
import java.util.Queue;

public class Threads extends java.lang.Thread {

//    private Processes processes;
    private HashMap<Integer, Integer> sharedResource;

    private Queue<Processes> processesQueue;



    public Threads(HashMap<Integer, Integer> sharedResource, Queue<Processes> processesQueue){
//        this.processes = processes;
        this.sharedResource = sharedResource;
        this.processesQueue = processesQueue;
    }


    public Threads() {
    }

    public Queue<Processes> getProcessesQueue() {
        return processesQueue;
    }

    public void setProcessesQueue(Queue<Processes> processesQueue) {
        this.processesQueue = processesQueue;
    }


    public HashMap<Integer, Integer> getSharedResource() {
        return sharedResource;
    }

    public void setSharedResource(HashMap<Integer, Integer> sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run(){
        synchronized (processesQueue){
            System.out.println("The current thread ->: " + Thread.currentThread().getName());
            for(int i =0; i < 5; i++){
                Processes temp = processesQueue.remove();
                temp.getTask().selectRanTask(sharedResource);
            }
        }
    }
}
