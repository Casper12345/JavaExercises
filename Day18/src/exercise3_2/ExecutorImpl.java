package exercise3_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public class ExecutorImpl implements Executor{

    private Queue<Runnable> runnables = new LinkedList<>();

    public static void main(String[] args) {
        ExecutorImpl e = new ExecutorImpl();
        e.execute(new TimedTask(1000));
        e.execute(new TimedTask(1000));
        e.execute(new TimedTask(1000));
        System.out.println(e.getMaxPendingTime());

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

    public int getMaxPendingTime(){
        return runnables.size() * 1000;
    }

}
