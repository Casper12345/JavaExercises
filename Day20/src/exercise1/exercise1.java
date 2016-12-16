package exercise1;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;


public class exercise1 {

    public static void main(String[] args) {
        final List<Dish> menu =

                Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
                    new Dish("beef", false, 700, Dish.Type.MEAT),
                    new Dish("chicken", false, 400, Dish.Type.MEAT),
                    new Dish("french fries", true, 530, Dish.Type.OTHER),
                    new Dish("rice", true, 350, Dish.Type.OTHER),
                    new Dish("season fruit", true, 120, Dish.Type.OTHER),
                    new Dish("pizza", true, 550, Dish.Type.OTHER),
                    new Dish("prawns", false, 400, Dish.Type.FISH),
                    new Dish("salmon", false, 450, Dish.Type.FISH));
        // number one
        List<Dish> dishes =

                menu.stream().filter((Dish i) -> i.getType() == Dish.Type.MEAT).limit(2).collect(toList());

                System.out.println(dishes);
        // number two

        int counting =
                menu.stream().map(dish -> 1).reduce(0, (x, y) -> x + y);
                System.out.println(counting);


        // number three

    }

}
