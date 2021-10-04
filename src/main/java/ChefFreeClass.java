import java.util.Arrays;
import java.util.Scanner;

public class ChefFreeClass {
    static void getFreeDay(int testCase, String[] nkDetails, String[] queriesDetails) {
        for (int i = 0; i < testCase; i++) {
            // System.out.println("Test case -------------------------"+i);
            long dayWhenNewQueryStopped = Integer.parseInt(nkDetails[i].split(" ")[0]);
            long maximumQueries = Integer.parseInt(nkDetails[i].split(" ")[1]);
            long[] totalQueriesSolved = Arrays.stream(queriesDetails[i].split(" ")).mapToLong(Long::parseLong).toArray();
            long remainingQueries = 0;
            boolean isFree = false;
            long dayWhenFree = 0;
                if (maximumQueries >= 1 && maximumQueries <= Math.pow(10, 8)) {
                    int k = 0;
                    while (k < totalQueriesSolved.length&&!isFree) {
                        if (totalQueriesSolved[k]>= 0 && totalQueriesSolved[k] <= Math.pow(10, 8)) {
                            // System.out.println("totalQueriesSolved -------------------------"+k);
                            long queryAsked = totalQueriesSolved[k]+ remainingQueries;
                            if (queryAsked >= maximumQueries) {
                                remainingQueries = (queryAsked - maximumQueries);
                            } else {
                                isFree = true;
                                dayWhenFree = k + 1;
                            }
                        }
                        k++;
                    }
                    if(isFree) {
                        //  System.out.println("queryAsked<maximumQueries -------------------------");
                        System.out.println(dayWhenFree);
                    } else {
                        long remainder = remainingQueries % maximumQueries;
                        long quotient = ((remainingQueries - remainder) / maximumQueries);
                        //  System.out.println("dayWhenNewQueryStopped---"+dayWhenNewQueryStopped +"  quotient==="+quotient+"  (quotient==0?0:1) "+(remainder==0?0:1));
                        dayWhenFree = dayWhenNewQueryStopped + quotient + 1;
                        System.out.println(dayWhenFree);
                    }
                }
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int totalCases = Integer.parseInt(sc.nextLine());
            // sc.nextLine();

            String[] nkDetails = new String[totalCases];
            String[] queriesDetails = new String[totalCases];
            if (totalCases >= 1 && totalCases <= Math.pow(10, 5)) {
                for (int i = 0; i < totalCases; i++) {
                    nkDetails[i] = sc.nextLine();
                    queriesDetails[i] = sc.nextLine();
                }
                getFreeDay(totalCases, nkDetails, queriesDetails);
            }
        }
        sc.close();
    }
}