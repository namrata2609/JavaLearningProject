import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OlympicMedals {

    static void MaxMedals(int testCase, String[] nkDetails) {
        for (int i = 0; i < testCase; i++) {
            // System.out.println("Test case -------------------------"+i);
           int[] horizontalArray= Arrays.stream(nkDetails[i].split(" ")).mapToInt(Integer::parseInt).toArray();

            boolean isFree = false;
            long dayWhenFree = 0;
            if ((horizontalArray[0]+horizontalArray[1]+horizontalArray[2])>(horizontalArray[3]+horizontalArray[4]+horizontalArray[5]))
            {
                isFree = true;
            }

                if(isFree) {
                    //  System.out.println("queryAsked<maximumQueries -------------------------");
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
            }
        }





    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int totalCases = Integer.parseInt(sc.nextLine());
            String[] nkDetails = new String[totalCases];
            if (totalCases >= 1 && totalCases <= Math.pow(10, 5)) {
                for (int i = 0; i < totalCases; i++) {
                    nkDetails[i] = sc.nextLine();
                }
                MaxMedals(totalCases, nkDetails);
            }
        }
        sc.close();	// your code goes here
    }
}
