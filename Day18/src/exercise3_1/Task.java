package exercise3_1;

/**
 * Created by Casper on 13/01/2017.
 */
public class Task implements Runnable{

    private String item;

    public Task(String item){
        this.item = item;
    }

    @Override
    public void run(){
        System.out.println(item);
    }


}
