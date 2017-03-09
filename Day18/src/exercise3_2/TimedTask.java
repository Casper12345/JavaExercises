package exercise3_2;

/**
 * Created by Casper on 13/01/2017.
 */
public class TimedTask implements Runnable{

    private int milliSeconds;

    public TimedTask(int milliSeconds) {
        if(milliSeconds > 1000){
            this.milliSeconds = 1000;
        }
        this.milliSeconds = milliSeconds;
    }

    public void run(){

        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
