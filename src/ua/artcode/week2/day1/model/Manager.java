package ua.artcode.week2.day1.model;

/**
 * Created by Alexey_O on 07.09.2017.
 */
public class Manager {

   /* private Coder[] coders;
    private Tester[] testers;
    private Manager[] managers;

    public void addCoder() {}
    public void addTester() {}
    public void addManager() {}*/

    private Worker[] workers;

    public void addWorker(Worker worker) {
        // adds workers to array
    }

    public void doWork() {
        if (workers == null) return;
        for (int i = 0; i < workers.length; i++) {
            workers[i].work();
        }
    }

}
