package ua.artcode.week2.day1.test;

import com.sun.org.apache.bcel.internal.classfile.Code;
import ua.artcode.week2.day1.model.Coder;
import ua.artcode.week2.day1.model.Tester;
import ua.artcode.week2.day1.model.Worker;

/**
 * Created by Alexey_O on 07.09.2017.
 */
public class TestInheritance {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Coder coder = new Coder();

        // Abstraction
        Worker someWorker = new Coder();
        startWork(worker);
        startWork(coder);
        startWork(someWorker);


        Tester tester1 = new Tester();
        Tester tester2 = new Tester(2, "Tester Kolia", 2500, "+38067...", "Auto");
    }

    public static void startWork(Worker worker) {
        if (worker instanceof Coder) {      // is-a relation checker (checks hierarchy!)
            Coder coderRef = (Coder) worker;
            coderRef.code();
        } else if (worker.getClass() == Tester.class) { // no hierarchy checking!
            Tester testerRef = (Tester) worker;
            testerRef.test();
        } else {
            worker.work();
        }
    }


    public static void startWork2(Worker worker) {
        worker.work();
    }

}
