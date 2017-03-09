package exercise3_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;

public class ExecutorImpl implements Executor{

    private Queue<Runnable> runnables = new LinkedList<>();

    public static void main(String[] args) {
        ExecutorImpl e = new ExecutorImpl();


    }

    public void execute(Runnable object) throws RejectedExecutionException, NullPointerException {

        runnables.add(object);
        Runnable r = runnables.peek();
        //ThreadPoolExecutor t = r.run();
        ExecutorService t = Executors.newFixedThreadPool(runnables.size());
        t.execute(r);
        if(!t.isTerminated()){
            runnables.remove();
        }

    }
    public int getMaxPendingTime(){
        return runnables.size() * 1000;
    }


}
