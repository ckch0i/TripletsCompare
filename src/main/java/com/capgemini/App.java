package com.capgemini;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        System.out.println("Hello World!");
    }

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int hans = 0;
        int grietje = 0;
        IntStream.range(0,a.size()).forEach(i -> if (a.get(i) < b.get(i)))
            if (a.get(i) < b.get(i)){
                grietje++;
            } else if (a.get(i) > b.get(i)) {
                hans++;
            }
        }
        return Arrays.asList(hans,grietje);
    }

}
