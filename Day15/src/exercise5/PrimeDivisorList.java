package exercise5;
import java.util.*;


public class PrimeDivisorList {
	
	private List<Integer> primeList  = new ArrayList<>();

	public void add(Integer add) throws NullPointerException {

	    if (add == null){
	        throw new NullPointerException();
        }

        boolean primeNumber = primeChecker(add);

	    if(!primeNumber){
	        throw new IllegalArgumentException();
        }

		primeList.add(add);
	}

	private boolean primeChecker(Integer toCheck){
        boolean primeNumber = true;
	    int i = 2;

	    if(toCheck == 1){
	        return false;
        }

        while( i < toCheck){

            if(toCheck%i == 0){
                primeNumber= false;
            }

            i++;

        }
        return primeNumber;
	}

	public Integer get(int index){

		return primeList.get(index);
	}

	@Override
    public String toString(){
	    //[ 2 * 3^2 * 7 = 126 ]
        return "";
    }
	
	
}