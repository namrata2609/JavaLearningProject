import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ReplaceX {

    static int findIndex(int[] elements,int N,int X,int p){
        int min= 100000000;
        int minp=-1;

        for(int i =0; i<N;i++ ){
             if(elements[i]==X){
                if(Math.abs(p-i)<min){
                    min = Math.abs(p-1);
                    minp = 1;
                }
             }
        }
        return minp;
    }

    public static void getPossibleSteps(int testcases,String[] conditionsDetails , String[] elementsDetails ){
        for (int i =0 ;i<testcases;i++) {
            int[] conditionalValue = Arrays.stream(conditionsDetails[i].split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int N = conditionalValue[0];
            int X = conditionalValue[1];
            int p = conditionalValue[2];
            int k = conditionalValue[3];
            if (p>=1 && k<=N && X>= 0 && X<= Math.pow(10,9)&& (N < 4*Math.pow(10,5))) {
                int[] intElementArr = Arrays.stream(elementsDetails[i].split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                Arrays.sort(intElementArr);
              //  System.out.println("Value "+findIndex(intElementArr,N,X,p));
                int result = 0;
                boolean flag = false;
                while (!flag) {
                    if (intElementArr[p - 1] == X) {
                        flag = true;
                    }
                    else if (k >= p && intElementArr[p - 1] >= X) {
                        int values = findIndex(intElementArr,N,X,p);
                        intElementArr[k - 1] = (values==-1?X:intElementArr[0] - 1);
                        result += 1;
                        Arrays.sort(intElementArr);
                    }
                    else if (k <= p && intElementArr[p - 1] <= X) {
                        int values = findIndex(intElementArr,N,X,p);
                        intElementArr[k - 1] =(values==-1?X:intElementArr[0] - 1);
                        result += 1;
                        Arrays.sort(intElementArr);
                    }
                    else {
                        result = -1;
                        flag = true;
                    }
               }
                System.out.println(result);
            }
        }
    }
    public static void main(String args[]) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader sc=new BufferedReader(r);
        int totalCases = Integer.parseInt(sc.readLine());
        String[] conditionsDetails = new String[totalCases];
        String[] elementsDetails = new String[totalCases];
        if (totalCases >= 1 && totalCases <= 100) {
        for(int i=0;i<totalCases;i++){
            conditionsDetails[i] = sc.readLine();
            elementsDetails[i] = sc.readLine();
        }
            getPossibleSteps(totalCases, conditionsDetails, elementsDetails);
        }
        sc.close();
    }
}