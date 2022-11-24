package models;

import java.util.Random;

public class Processes {

    private int PID;
    private Task task;
    private int priority;
    private int arrivalTime;
    private int blockedTime;
    private int burstTime;

    public Processes(int PID, Task task, int priority, int arrivalTime,
                     int blockedTime, int burstTime) {
        this.PID = PID;
        this.task = task;
        this.priority = priority;
        this.arrivalTime = arrivalTime;
        this.blockedTime = blockedTime;
        this.burstTime = burstTime;
    }

    public Processes() {
        this.PID = new Random().nextInt(20) + 1;
        this.task = new Task();
        this.priority = new Random().nextInt(4) + 1;
        this.arrivalTime = new Random().nextInt(30);
        this.blockedTime = 5;
        this.burstTime = new Random().nextInt(4) + 1;;
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getBlockedTime() {
        return blockedTime;
    }

    public void setBlockedTime(int blockedTime) {
        this.blockedTime = blockedTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    @Override
    public String toString() {
        return "Processes{" +
                "PID=" + PID +
                ", task=" + task +
                ", priority=" + priority +
                ", arrivalTime=" + arrivalTime +
                ", blockedTime=" + blockedTime +
                ", burstTime=" + burstTime +
                '}';
    }

    //   public void addEle(ArrayList<Integer> numbers) {
//
//            int b = (int)(Math.random()*(100-50+1)+50);
//            numbers.add(b);
//
//            try {
//                Thread.sleep(500);
//            }catch (Exception e){
//                System.out.println("Thread  interrupted.");
//            }
//    }
}
