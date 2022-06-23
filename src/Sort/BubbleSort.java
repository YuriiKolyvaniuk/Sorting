package Sort;

import javax.swing.*;
import java.util.*;

public class BubbleSort{

    private static < T > List<T> removeNull(T[] arr, int index){
        List<T> tempList = new ArrayList<T>(Arrays.asList(arr));
        tempList.remove(index);

        return tempList;
    }

    public static void sort(int [] arr){
        int len = arr.length;
        for(int i = 0; i < len-1;++i){
            for(int j = 0; j < len - i -1; ++j){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
    }
    public static void sort(double [] arr){
        int len = arr.length;
        for(int i = 0; i < len-1;++i){
            for(int j = 0; j < len - i -1; ++j){
                if(arr[j] > arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void sort(float [] arr){
        int len = arr.length;
        for(int i = 0; i < len-1;++i){
            for(int j = 0; j < len - i -1; ++j){
                if(arr[j] > arr[j+1]){
                    float temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static <T> List<T>  sort(List<T> list){
        int a = list.size();
        if(list.get(0) == null && list.size() == 1){
            return null;
        }else{
            while(list.remove(null)){

            }

            int len = list.size();
            for(int i = 0; i < len-1;++i){
                for(int j = 0; j < len - i -1; ++j){
                    if( list.get(j).hashCode() > list.get(j+1).hashCode() ){
                        if(list.get(j).hashCode() > 0) {
                            T temp = list.get(j);
                            list.set(j, list.get(j + 1));
                            list.set(j + 1, temp);
                        }
                    }
                }
            }
            return list;
        }


    }

    public static Integer [] sort(Integer [] arr){
        if(arr[0] == null && arr.length == 1) {
            return null;

        }else{
            for(int i = 0; i < arr.length;i++){
                if(arr[i] == null){
                    List<Integer> tempList;
                    tempList = removeNull(arr,i);
                    arr = tempList.toArray(new Integer[0]);
                }
            }
            int len = arr.length;
            for(int i = 0; i < len-1;++i){
                for(int j = 0; j < len - i -1; ++j){
                    if(arr[j] > arr[j+1]){
                        Integer temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            return arr;
        }
    }
    public static Double [] sort(Double [] arr){
        if(arr[0] == null && arr.length == 1) {
            return null;

        }else{
            for(int i = 0; i < arr.length;i++){
                if(arr[i] == null){
                    List<Double> tempList;
                    tempList = removeNull(arr,i);
                    arr = tempList.toArray(new Double[0]);
                }
            }
            int len = arr.length;
            for(int i = 0; i < len-1;++i){
                for(int j = 0; j < len - i -1; ++j){
                    if(arr[j] > arr[j+1]){
                        Double temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            return arr;
        }
    }
    public static Float [] sort(Float [] arr){
        if(arr[0] == null && arr.length == 1) {
            return null;

        }else{
            for(int i = 0; i < arr.length;i++){
                if(arr[i] == null){
                    List<Float> tempList;
                    tempList = removeNull(arr,i);
                    arr = tempList.toArray(new Float[0]);
                }
            }
            int len = arr.length;
            for(int i = 0; i < len-1;++i){
                for(int j = 0; j < len - i -1; ++j){
                    if(arr[j] > arr[j+1]){
                        Float temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            return arr;
        }
    }

}