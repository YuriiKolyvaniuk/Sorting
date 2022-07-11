package Sort;

import java.util.*;

public class QuickSort{
    ////////////////// Check for null. Method .remove for array //////////////////
    private static <E> List<E> removeNull(E[] arr, int index){
        List<E> tempList = new ArrayList<E>(Arrays.asList(arr));
        tempList.remove(index);

        return tempList;
    }

    ////////////////// QuickSort algorithm for primitive type//////////////////
    private static void sort(int [] arr,int low, int high){
         if(low >= high){
             return;
         }

         int pivotIndex = new Random().nextInt(high-low)+low;
         int pivot = arr[pivotIndex];
         swap(arr,pivotIndex,high);

         int leftPointer = partition(arr, low, high, pivot);

         sort(arr,low,leftPointer-1);
         sort(arr,leftPointer+1,high);

     }
    private static void sort(double [] arr,int low, int high){
        if(low >= high){
            return;
        }

        int pivotIndex = new Random().nextInt(high-low)+low;
        double pivot = arr[pivotIndex];
        swap(arr,pivotIndex,high);

        double leftPointer = partition(arr, low, high, pivot);

        sort(arr,low,(int)leftPointer-1);
        sort(arr,(int)leftPointer+1,high);

    }
    private static void sort(float [] arr,int low, int high){
        if(low >= high){
            return;
        }

        int pivotIndex = new Random().nextInt(high-low)+low;
        float pivot = arr[pivotIndex];
        swap(arr,pivotIndex,high);

        float leftPointer = partition(arr, low, high, pivot);

        sort(arr,low,(int)leftPointer-1);
        sort(arr,(int)leftPointer+1,high);

    }

    ////////////////// QuickSort algorithm for reference type//////////////////
    private static <E> Integer [] sort(Integer [] arr, int low, int high){
        if(low >= high){
            return arr;
        }

        int pivotIndex = new Random().nextInt(high-low)+low;
        Integer pivot = arr[pivotIndex];
        swap(arr,pivotIndex,high);

        Integer leftPointer = partition(arr,low,high,pivot);

        sort(arr,low,(int)leftPointer-1);
        sort(arr,(int)leftPointer+1,high);

        return arr;
    }
    private static <E> Double [] sort(Double [] arr, int low, int high){
        if(low >= high){
            return arr;
        }

        int pivotIndex = new Random().nextInt(high-low)+low;
        Double pivot = arr[pivotIndex];
        swap(arr,pivotIndex,high);

        double leftPointer = partition(arr,low,high,pivot);

        sort(arr,low,(int)leftPointer-1);
        sort(arr,(int)leftPointer+1,high);

        return arr;
    }
    private static <E> Float [] sort(Float [] arr, int low, int high){
        if(low >= high){
            return arr;
        }

        int pivotIndex = new Random().nextInt(high-low)+low;
        Float pivot = arr[pivotIndex];
        swap(arr,pivotIndex,high);

        float leftPointer = partition(arr,low,high,pivot);

        sort(arr,low,(int)leftPointer-1);
        sort(arr,(int)leftPointer+1,high);

        return arr;
    }

    ////////////////// QuickSort algorithm for any Numbers List//////////////////
    private static <E extends Comparable<E>> List<E> sort(List<E> list,int low,int high){

        if(low >= high){
            return list;
        }

        int pivotIndex = new Random().nextInt(high-low)+low;
        E pivot = list.get(pivotIndex);

        swap(list,pivotIndex,high);

        int leftPointer = low;
        int rightPointer = high;

        while(leftPointer < rightPointer) {

            while (list.get(leftPointer).compareTo(pivot) <= 0 && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (list.get(rightPointer).compareTo(pivot) >= 0 && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(list, leftPointer, rightPointer);
        }

        swap(list,leftPointer, high);

        sort(list,low,(Integer) (leftPointer-1));
        sort(list,(Integer) (leftPointer+1),high);

        return list;
    }

    ////////////////// Just for clean code //////////////////
    private static int partition(int[] arr, int low, int high, int pivot) {
        int leftPointer = low;
        int rightPointer = high;

        while(leftPointer < rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(arr,leftPointer,rightPointer);
        }

        swap(arr,leftPointer, high);
        return leftPointer;
    }
    private static double partition(double[] arr, int low, int high, double pivot) {
        int leftPointer = low;
        int rightPointer = high;

        while(leftPointer < rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(arr,leftPointer,rightPointer);
        }

        swap(arr,leftPointer, high);
        return leftPointer;
    }
    private static float partition(float[] arr, int low, int high, float pivot) {
        int leftPointer = low;
        int rightPointer = high;

        while(leftPointer < rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(arr,leftPointer,rightPointer);
        }

        swap(arr,leftPointer, high);
        return leftPointer;
    }
    private static Integer partition(Integer[] arr, int low ,int high, Integer pivot){
        int leftPointer = low;
        int rightPointer = high;

        while(leftPointer < rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(arr,leftPointer,rightPointer);
        }

        swap(arr,leftPointer, high);
        return leftPointer;
    }
    private static Double partition(Double[] arr, int low ,int high, Double pivot){
        int leftPointer = low;
        int rightPointer = high;

        while(leftPointer < rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(arr,leftPointer,rightPointer);
        }

        swap(arr,leftPointer, high);
        return (double)leftPointer;
    }
    private static Float partition(Float[] arr, int low ,int high, Float pivot){
        int leftPointer = low;
        int rightPointer = high;

        while(leftPointer < rightPointer){
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(arr,leftPointer,rightPointer);
        }

        swap(arr,leftPointer, high);
        return (float)leftPointer;
    }

    ////////////////// Public methods .sort for calling private methods .sort where we have realisation //////////////////
    public static void sort(int [] arr){
         sort(arr ,0 ,arr.length - 1);
    }
    public static void sort(double [] arr){
        sort(arr ,0 ,arr.length - 1);
    }
    public static void sort(float [] arr){
        sort(arr ,0 ,arr.length - 1);
    }
    public static Integer[] sort(Integer []arr){

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
            arr = sort(arr,0,arr.length-1);
            return arr;
        }
    }
    public static Double[] sort(Double []arr){

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
            arr = sort(arr,0,arr.length-1);
            return arr;
        }
    }
    public static Float[] sort(Float []arr){

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
            arr = sort(arr,0,arr.length-1);
            return arr;
        }
    }
    public static <E extends Comparable<E>> List<E> sort(List<E> list){
        if(list.size() == 0){
            return list;
        }
        else if(list.get(0) == null && list.size() == 1){
            return null;
        }else {
            while (list.remove(null)) {

            }
            int len = list.size();
            list = sort(list, 0, len-1);
            return list;
        }

    }


    ////////////////// Swap functions //////////////////
    private static void swap(int [] arr, int index1, int index2){
         int temp = arr[index1];
         arr[index1] = arr[index2];
         arr[index2] = temp;
     }
    private static void swap(double[] arr, int index1, int index2){
        double temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    private static void swap(float [] arr, int index1, int index2){
        float temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    private static <E> void swap(E[] arr,int index1, int index2){
        E temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    private static <E> void swap(List <E> list, int index1,int index2){
        E temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

}
