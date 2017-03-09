package exercise4;

/**
 * Created by Casper on 09/01/2017.
 */

import java.util.*;

class BinarySearch {

    private List<Integer> listToSearch = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11);

    public static void main(String args[]) {

        BinarySearch b = new BinarySearch();
        Collections.sort(b.listToSearch);

        System.out.println(b.listToSearch);
        System.out.println(b.listToSearch.subList(0, (b.listToSearch.size()/2)));
        System.out.println(b.listToSearch.subList((b.listToSearch.size()/2),b.listToSearch.size()));
        System.out.println(b.search(100, b.listToSearch));


    }

    public boolean search(int toSearch, List<Integer> searchList) {

        if (searchList.size()==0) {
            return false;
        }

        if((searchList.get(searchList.size()/2)) == toSearch) {
            return true;
        }

         if(toSearch < searchList.get((searchList.size()/2))){
            return search(toSearch, searchList.subList(0,(searchList.size()/2)));
        }else{
           return search(toSearch, searchList.subList((searchList.size()/2), searchList.size()));
        }

    }

}