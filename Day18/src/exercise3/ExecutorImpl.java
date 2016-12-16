package exercise3;
import java.util.LinkedList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Executor;

import java.util.Queue;

public class ExecutorImpl implements Executor{

    private Queue<Runnable> runnables = new LinkedList<>();


    public void execute(Runnable object) throws RejectedExecutionException, NullPointerException {

        runnables.add(object);

        for({

            Thread t = new Thread(runnables.element());

            t.start();


        }


    }

}
