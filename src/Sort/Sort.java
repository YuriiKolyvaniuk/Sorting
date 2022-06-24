package Sort;

import java.util.List;

public class Sort {

    public static void bubble(int [] input){BubbleSort.sort(input);} //Sort for int type array
    public static void bubble(double [] input){BubbleSort.sort(input);} //Sort for double type array
    public static void bubble(float [] input){BubbleSort.sort(input);} //Sort for float type array
    public static Integer [] bubble(Integer[] input) {
        input = BubbleSort.sort(input);
        return input;
    } //Sort for Integer type array
    public static Double [] bubble(Double[] input) {
        input = BubbleSort.sort(input);
        return input;
    } //Sort for Double type array
    public static Float [] bubble(Float[] input) {
        input = BubbleSort.sort(input);
        return input;
    } //Sort for Float type array
    public static <E extends Comparable<E>> List<E> bubble(List<E> input){
        input = BubbleSort.sort(input);
        return input;
    } //Sort for any type list


}
