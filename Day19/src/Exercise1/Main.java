package Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Main {

    private List <Apple> apples = new ArrayList<>();

    public static void main(String[] args) {
        Main m = new Main();

        m.apples.add(new Apple(12,"green"));
        m.apples.add((new Apple(13, "red")));
        m.apples.add((new Apple(14, "green")));
        m.apples.add(new Apple(160,"green"));
        m.apples.add((new Apple(166, "red")));
        m.apples.add((new Apple(170, "yellow")));

        for(Apple apple: m.colourFinder()) {
            System.out.println(apple.getColour());
        }
        for(Apple apple: m.filterAppleByColour("green")) {
            System.out.println(apple.getColour());
        }

        for(Apple apple: m.filterAppleByColour("yellow")) {
            System.out.println(apple.getColour());
        }

        for(Apple apple: m.filterAppleByMoreThan(150)) {
            System.out.println(apple.getWeight());
        }

        for(Apple apple: m.filterAppleByLessThan(150)) {
            System.out.println(apple.getWeight());
        }

        List<Apple> weightList = m.filterApples(m.apples, new AppleHeavyWeightPredicate());

        System.out.println(Arrays.asList(weightList));

        for(Apple apple: weightList) {
            System.out.println(apple.getWeight());
        }

        List<Apple> colourList = m.filterApples(m.apples, new AppleGreenColourPredicate());

        for(Apple apple: colourList) {
            System.out.println(apple.getColour());
        }


    }

    public List<Apple> colourFinder()  {
        List<Apple> results = new ArrayList<>();

        for (Apple apple : apples) {

            if(apple.getColour().equals("green")){
                results.add(apple);
            }

        }
        return results;
    }

    public List<Apple> filterAppleByColour(String filter){
        List<Apple> returnColour = new ArrayList<>();

        for(Apple apple : apples){
            if (apple.getColour().equals(filter)){
                returnColour.add(apple);
            }

        }
        return returnColour;
    }

    public List<Apple> filterAppleByMoreThan(int filter){
        List<Apple> returnWeight = new ArrayList<>();

        for(Apple apple : apples){
            if (apple.getWeight() > filter){
                returnWeight.add(apple);
            }
        }
        return returnWeight;
    }


    public List<Apple> filterAppleByLessThan(int filter){
        List<Apple> returnWeight = new ArrayList<>();

        for(Apple apple : apples){
            if (apple.getWeight() < filter){
                returnWeight.add(apple);
            }
        }
        return returnWeight;
    }

    public List<Apple> filterApples(List <Apple> apples, ApplePredicate predicate){

        List<Apple> result = new ArrayList<>();

        for(Apple apple : apples){
            if(predicate.test(apple)){
                result.add(apple);
            }
        }
        return  result;
    }


}

class AppleHeavyWeightPredicate implements ApplePredicate{

    public boolean test(Apple apple){
        return apple.getWeight() > 150;
    }

}

class AppleGreenColourPredicate implements ApplePredicate{

    public boolean test (Apple apple){
        return apple.getColour().equals("green");
    }

}
