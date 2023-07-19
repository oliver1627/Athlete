package AthletesPackage;

public class Main {

    public static void main(String[] args) {

        QueueManager athleteQueue = new QueueManager();



        // Enqueuing athletes

        Athlete athlete1 = new Athlete(null, 0, 0);

        Athlete athlete2 = new Athlete("Athlete 2", 30, 8);

        athleteQueue.enqueue(athlete1);

        athleteQueue.enqueue(athlete2);



        System.out.println("Queue size: " + athleteQueue.size());



        // Dequeuing an athlete

        Athlete dequeuedAthlete = athleteQueue.dequeue();

        System.out.println("Dequeued athlete: " + dequeuedAthlete.name);



        // Checking if the queue is empty

        System.out.println("Is queue empty? " + athleteQueue.isEmpty());



        // Peeking at the front athlete

        Athlete frontAthlete = athleteQueue.peek();

        System.out.println("Front athlete: " + frontAthlete.name);



        Athlete dequeuedAthlete2 = athleteQueue.dequeue();

        System.out.println("Dequeued athlete: " + dequeuedAthlete2.name);

        // Checking if the queue is empty

        System.out.println("Is queue empty? " + athleteQueue.isEmpty());



    }

}