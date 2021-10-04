import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {

    public static void selectionSort(int[] input){

        for(int i=0;i<input.length-1;i++){
            int indexOfSmallestNumber = i;
            for(int j=i+1;j<input.length;j++){
                if(input[indexOfSmallestNumber]>input[j]){
                    indexOfSmallestNumber = j;
                }
            }
            int temp= input[i];
            input[i]= input[indexOfSmallestNumber];
            input[indexOfSmallestNumber]=temp;

        }


       // System.out.println(Arrays.toString(input));
    }
    public static void bubbleSort(int[] input){

        for(int i=0;i<input.length-1;i++){
            boolean swapper =false;
            for(int j=0;j+1<input.length-i;j++){
                if(input[j]>input[j+1]){
                    swapper = true;
                    int temp= input[j];
                    input[j]= input[j+1];
                    input[j+1]=temp;
                }
            }
            /*
            if(!swapper){
                return;
            }*/

        }


       // System.out.println("Bubble sorted array - "+Arrays.toString(input));
    }
    public static void mergeSort(int[] input,int from , int to){

        if(from<to){
            int middle  =  (from+to)/2;
            mergeSort(input,from,middle);
            mergeSort(input,middle+1,to);
            Merge(input,from,middle,to);
        }

    }

    public static void Merge(int[] input,int from ,int middle, int to){
    int leftLength = middle-from +1;
    int rightLength = to-middle;
    int[] left  = new int[leftLength+1];
    int[] right  = new int[rightLength+1];
       for (int i=0;i<leftLength;i++){
           left[i] = input[from+i];
       }
        for (int i=0;i<rightLength;i++){
            right[i] = input[middle+1+i];
        }
        left[leftLength] = Integer.MAX_VALUE;
        right[rightLength] = Integer.MAX_VALUE;

        int leftpointer = 0;
        int rightpointer = 0;
        for(int i=from;i<=to;i++){
            if(left[leftpointer]>right[rightpointer]){
                input[i] = right[rightpointer];
                rightpointer++;
            }else{
                input[i] = left[leftpointer];
                leftpointer++;
            }
        }


    }
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void quickSortExecutor(int[] input){
      quickSort(input,0,input.length-1);

    }

    public static void mergeSortExecutor(int[] input){
        mergeSort(input,0,input.length-1);

    }
    public static void quickSort(int[] input,int from, int to){
        if(from<to) {
            int indexOfPivot = partition(input,from,to);
            quickSort(input, 0, indexOfPivot - 1);
            quickSort(input, indexOfPivot+1, to);
        }

    }

    public static int partition(int[] input,int from, int to){
       int pivot = input[to];
       int wall = from;
       for(int i = from;i<to;i++){
         if(input[i]<=pivot){
             int temp = input[wall];
             input[wall] = input[i];
             input[i] = temp;
             wall++;

         }
       }
       input[to]=input[wall];
       input[wall] = pivot;
       return wall;
    }

    public static int[] generateArray(int size,int from, int to){
        Random randomGenerator = new Random();
        int[] result = new int[size];
        for (int i=0;i<size;i++){
            result[i] = randomGenerator.nextInt(to)+from;
        }
       return result;

    }

    public static boolean isSorted(int[] array){
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedDecreasing(int[] array){
        for(int i=0;i<array.length-1;i++){
            if(array[i]<array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        int sizeOfInput = 100;
        int numberOfArrays = 1000;
        String[] Algorithms = {"selectionSort","bubbleSort","mergeSortExecutor","quickSortExecutor"};
        for(String algorithm:Algorithms){
            Method m = SortingAlgorithms.class.getMethod(algorithm,int[].class);
            System.out.println("Testing : "+ algorithm);
            long statTime = System.nanoTime();
            for(int i =0;i<numberOfArrays;i++){
              int[] testArray = generateArray(sizeOfInput,0,100);
              int[] cloneArray = testArray.clone();
           //If algorithm doesn't work properly
                m.invoke(SortingAlgorithms.class,testArray);
                if(!isSorted(testArray)){
                    printArray(cloneArray);
                    System.out.println("Error: Unsorted Array");
                    printArray(testArray);
                }
            }
            long endTime = System.nanoTime();
            System.out.println("********************");
            System.out.println("Finished "+numberOfArrays+ " tests.");
            System.out.println("Took "+(endTime-statTime)/1000000000.0+ " s");
            System.out.println("********************");
            System.out.println();
        }


    }

}
