package exercise5;

import java.util.ArrayList;
import java.util.List;

public class GenericStack<E extends Number> {

    private List<E> genericStack = new ArrayList<>();


    public boolean isEmpty(){
        return genericStack.isEmpty();
    }

    public void push(E toPush){

        genericStack.add(toPush);
    }

    public E pop(){

        return genericStack.get(genericStack.size() - 1);
    }



}
