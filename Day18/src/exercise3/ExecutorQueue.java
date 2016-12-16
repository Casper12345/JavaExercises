package exercise3;

import java.util.*;

public class ExecutorQueue {

    private Queue<Runnable> runnables;

    public ExecutorQueue(){

        this.runnables = new LinkedList<>();

    }

    public Queue<Runnable> getQueue(){
        return runnables;
    }


}
