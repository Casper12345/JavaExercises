package exercise6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Casper on 13/01/2017.
 */
public class Exercise6 {

    public static void main(String[] args) {

    }

    public void mergeSort(List<Integer> listToSort){
        mergeSort(listToSort, new ArrayList<>(), 0, listToSort.size()-1);

    }

    public void mergeSort(List<Integer> list, List<Integer> aux,  int leftStart, int rightEnd) {

        if(leftStart >= rightEnd){
            return;
        }
        int middle = (leftStart + rightEnd)/2;
        mergeSort(list, aux, leftStart, middle);
        mergeSort(list, aux, middle +1, rightEnd);
        mergeHalves(list, aux, leftStart,rightEnd);


    }

    private void mergeHalves(List<Integer> list, List<Integer> aux, int leftStart, int rightEnd){

        int leftEnd = (rightEnd + leftStart)/2;
        int rightStart = leftEnd + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;
        while(left <= leftEnd && right <= rightEnd){
            if(list.get(left) <= list.get(right)){

            }
        }


    }






}
