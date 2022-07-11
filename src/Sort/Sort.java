package Sort;

import java.util.*;

public class Sort {

    ////////////////// Sorting by BubbleSort for arrays and lists. Calling methods: //////////////////
    public static void bubble(int [] input){BubbleSort.sort(input);}
    public static void bubble(double [] input){BubbleSort.sort(input);}
    public static void bubble(float [] input){BubbleSort.sort(input);}

    public static Integer [] bubble(Integer[] input) {
        input = BubbleSort.sort(input);
        return input;
    }
    public static Double [] bubble(Double[] input) {
        input = BubbleSort.sort(input);
        return input;
    }
    public static Float [] bubble(Float[] input) {
        input = BubbleSort.sort(input);
        return input;
    }
    public static <E extends Comparable<E>> List<E> bubble(List<E> input){
        input = BubbleSort.sort(input);
        return input;
    }


    ////////////////// Sorting by QuickSort for arrays and lists. Calling methods: //////////////////
    public static void quick(int []input){QuickSort.sort(input);}
    public static void quick(double []input){QuickSort.sort(input);}
    public static void quick(float []input){QuickSort.sort(input);}

    public static Integer[] quick(Integer[]input){
        input = QuickSort.sort(input);
        return input;
    }
    public static Double[] quick(Double[]input){
        input = QuickSort.sort(input);
        return input;
    }
    public static Float[] quick(Float[]input){
        input = QuickSort.sort(input);
        return input;
    }
    public static <E extends Comparable<E>> List<E>quick(List<E> input){
        input = QuickSort.sort(input);
        return input;
    }
}
