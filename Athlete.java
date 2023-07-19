package AthletesPackage;

import java.util.LinkedList;

import java.util.Queue;

public class Athlete{
    String name;
    int age;
    int runningDistanceEachDay;



public Athlete(String name, int age, int runningDistanceEachDay) {

    this.name = name;

    this.age = age;

    this.runningDistanceEachDay = runningDistanceEachDay;

}

}



class QueueManager {

private Queue<Athlete> queue;



public QueueManager() {

    queue = new LinkedList<>();

}



public void enqueue(Athlete athlete) {

    queue.add(athlete);

}



public Athlete dequeue() {

    return queue.poll();

}



public boolean isEmpty() {

    return queue.isEmpty();

}



public int size() {

    return queue.size();

}



public Athlete peek() {

    return queue.peek();

}

}