package exercise3_1;
import java.util.LinkedList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Executor;

import java.util.Queue;

public class ExecutorImpl implements Executor{

    private Queue<Runnable> runnables = new LinkedList<>();

    public static void main(String[] args) {
        Executor e = new ExecutorImpl();
        e.execute(new Task("word"));
        e.execute(new Task("dadel"));
        e.execute(new Task("pong"));


    }

    public void execute(Runnable object) throws RejectedExecutionException, NullPointerException {

        runnables.add(object);
        Runnable r = runnables.peek();
        Thread t = new Thread(r);
        t.start();
        if(!t.isAlive()){
            runnables.remove();
        }

    }

}
