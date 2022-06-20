package Sort;

import java.util.Random;

public class Main {

    public static void main(String[] args){

        Integer [] arr = {null,19,0,8,7,3124,4,57};
        System.out.println("Array before BubbleSort: ");
        for(int i = 0 ; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

        arr = Sort.BubbleSort(arr);

        System.out.println("");
        try {
            System.out.println("Array after BubbleSort: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }catch (RuntimeException e){
            System.out.println(e.getClass().getSuperclass().getSimpleName());
        }
    }

}
