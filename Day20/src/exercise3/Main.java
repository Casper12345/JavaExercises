package exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> numbers2 = Arrays.asList(2, 4, 5, 6, 7, 8);

        // three

        List<Integer> result = numbers1.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(result);

        // four

        List<Integer> result2 = numbers2.stream().map(i -> i).collect(toList());
        System.out.println(result2);

        List<int[]> pairs =
                numbers1.stream()
                        .flatMap(i -> numbers2.stream()
                                .filter(j -> (i + j) % 3 == 0).map(j -> new int[]{i, j})).collect(toList());


    }

}
