package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort{
    private static Integer [] removeNull(Integer [] arr,int index){
        List<Integer> tempList = new ArrayList<Integer>(Arrays.asList(arr));
        tempList.remove(index);
        return tempList.toArray(new Integer[0]);
    }
    private static Double [] removeNull(Double [] arr,int index){
        List<Double> tempList = new ArrayList<Double>(Arrays.asList(arr));
        tempList.remove(index);
        return tempList.toArray(new Double[0]);
    }
    private static Float [] removeNull(Float [] arr,int index){
        List<Float> tempList = new ArrayList<Float>(Arrays.asList(arr));
        tempList.remove(index);
        return tempList.toArray(new Float[0]);
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
    public static Integer [] sort(Integer [] arr){
        if(arr[0] == null && arr.length == 1) {
            return null;

        }else{
            for(int i = 0; i < arr.length;i++){
                if(arr[i] == null){
                    arr = removeNull(arr,i);
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
                    arr = removeNull(arr,i);
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
                    arr = removeNull(arr,i);
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