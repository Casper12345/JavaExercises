package exercise8;

/**
 * Created by Casper on 19/12/2016.
 */
public class Spy {

    private static int spyCount = 0;
    private int spyId;


    public static void main(String[] args) {
        Spy first = new Spy(12);
        Spy second = new Spy(34);
        Spy third = new Spy(45);

        first.die();
        second.die();
        third.die();


    }

    private Spy(int spyId) {
        this.spyId = spyId;
        spyCount++;
        System.out.println("This is spy id: " + this.spyId);
        System.out.println("There are " + spyCount + " spies");
    }


    private void die(){
        System.out.println("This spy nr: " +this.spyId+ " has been eliminated");
        spyCount--;
        System.out.println("The number of spies are " + spyCount);
    }




}
