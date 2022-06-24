package Sort;

import java.util.*;

public class Main {

    public static void main(String[] args){

        Integer [] arr = {null,19,0,8,7,3124,4,57};

        List<Integer> intgrs = new ArrayList<Integer>();
        intgrs.add(null);
        intgrs.add(-13);
        intgrs.add(21);
        intgrs.add(142);
        intgrs.add(12);
        List<Double> dbls = new LinkedList<>(Arrays.asList(4d,17d,3d,4.3,16.4,3.1,null,-1d,-1.1,4.001));
        List<Float> flts = new LinkedList<>(Arrays.asList(4f,-17f,3f,4.3f,16.4f,3.1f,null,-1f,-1.1f,4.001f));

        System.out.println("Array before BubbleSort: ");
        for(int i = 0 ; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

        arr = Sort.bubble(arr);

        System.out.println("");
        try {
            System.out.println("Array after BubbleSort: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }catch (RuntimeException e){
            System.out.println(e.getClass().getSuperclass().getSimpleName());
        }
/*
        System.out.println("List before BubbleSort: ");
        for(int i = 0 ; i< dbls.size();i++) {
            System.out.print(dbls.get(i) + " ");
        }

        dbls = Sort.bubble(dbls);

        System.out.println("");
        try {
            System.out.println("List after BubbleSort: ");
            for(int i = 0 ; i< dbls.size();i++) {
                System.out.print(dbls.get(i) + " ");
            }
        }catch (RuntimeException e){
            System.out.println(e.getClass().getSuperclass().getSimpleName());
        }
        */
    }

}
