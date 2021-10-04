/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef{

    public static void recursiveFunction( int numberOfCities1 ,int jumpNumber1,int currentCities1,int userCurrentCity1,List<Integer> resultvalue1){
        int numberOfCities = numberOfCities1;
        int jumpNumber = jumpNumber1;
        int currentCities = currentCities1;
        int userCurrentCity =userCurrentCity1;
        List<Integer> resultValue = resultvalue1;
        String result = "";
        if(jumpNumber+currentCities>numberOfCities){
            // System.out.println("First case");
            int temp = ((jumpNumber+currentCities)%numberOfCities);
            if(temp==userCurrentCity){
                //  System.out.println("First case equal");
                currentCities= temp;
                System.out.println("YES");
                // result = "Yes";
            }else{
                if(resultValue.size()==0||(resultValue.size()>1 && resultValue.get(0) != temp &&resultValue.get(1)!=temp+jumpNumber)||(resultValue.size()==1 && resultValue.get(0) != temp)){
                    //  System.out.println("First case not equal");
                    currentCities= temp;
                    resultValue.add(currentCities);
                    recursiveFunction(numberOfCities,jumpNumber,currentCities,userCurrentCity,resultValue);
                } else{
                    // result = "NO";
                    System.out.println("NO");
                }
            }
        }else{
            int temp = (jumpNumber+currentCities);
            if(temp==userCurrentCity){
                // System.out.println("Second case  equal");
                currentCities= temp;
                System.out.println("YES");
                result = "Yes";
            }else{
                if(resultValue.size()==0||(resultValue.size()>1 && resultValue.get(0) != temp &&resultValue.get(1)!=temp+jumpNumber)||(resultValue.size()==1 && resultValue.get(0) != temp)){
                    // System.out.println("Second case not equal");
                    currentCities= temp;
                    resultValue.add(currentCities);
                    recursiveFunction(numberOfCities,jumpNumber,currentCities,userCurrentCity,resultValue);
                }else{
                    System.out.println("NO");
                    // result = "NO";
                }
            }
        }
        //  return result;
    }

    public static void doesCovidReach(int totalCases,String[] values){

        for (int i = 0; i<totalCases;i++){
            int numberOfCities = Integer.parseInt(values[i].split(" ")[0]);
            int jumpNumber =  Integer.parseInt(values[i].split(" ")[1]);
            int currentCities =  Integer.parseInt(values[i].split(" ")[2]);
            int userCurrentCity =  Integer.parseInt(values[i].split(" ")[3]);

            List<Integer> resultValue = new ArrayList<Integer>();
            // System.out.println("First case------------"+i);
            if((numberOfCities<=1000 && numberOfCities>=1)&& (currentCities>=0&& currentCities<= (numberOfCities-1))&& (userCurrentCity>=0&& userCurrentCity<= (numberOfCities-1))&& (jumpNumber>=0&& jumpNumber<= 1000)) {
                //System.out.println("Callling function");
                recursiveFunction(numberOfCities, jumpNumber, currentCities, userCurrentCity, resultValue);
            }

        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            int totalCases = Integer.parseInt(sc.nextLine());
            // sc.nextLine();

            String[] values = new String[totalCases];

            for (int i = 0; i < totalCases; i++) {
                values[i] = sc.nextLine();
            }
            if(totalCases>=1 && totalCases<=100) {
                doesCovidReach(totalCases, values);
            }
        }
        sc.close();
    }
}
