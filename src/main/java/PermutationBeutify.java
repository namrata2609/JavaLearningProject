import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PermutationBeutify {
    static void getArray(int testcases, int[] values) {
        for (int i = 0; i < testcases; i++) {
            String finalResult = "";
            int N = values[i];
            if (N >= 1 && N <= 100000) {
                Deque<Integer> deque = new LinkedList<Integer>();
                for (int k = 1; k <= N; k++) {
                    for (int l = 1; l <= N; l++) {
                        int result = (k & l);
                        if (k != l && result > 0) {
                            if (deque.size() == 0) {
                                deque.addFirst(k);
                                deque.addLast(l);
                                finalResult = finalResult + k + " " + l;
                            } else if (!(deque.contains(k) && deque.contains(l))) {
                                    if (deque.getFirst() == k) {
                                        deque.addFirst(l);
                                        finalResult = l + " " + finalResult;
                                    } else if (deque.getLast() == k) {
                                        deque.addLast(l);
                                        finalResult = finalResult + " " + l;
                                    }else if (deque.getFirst() == l){
                                        deque.addFirst(k);
                                        finalResult = k + " " + finalResult;
                                    }else if (deque.getLast() == l) {
                                        deque.addLast(k);
                                        finalResult = finalResult + " " + k;
                                    }
                            }
                        }
                    }
                }
                if (deque.size() == 0 || deque.size() < N) {
                    System.out.println("-1");
                } else {
                    System.out.println(finalResult);
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader sc=new BufferedReader(r);
            int totalCases = Integer.parseInt(sc.readLine());

            int[] values = new int[totalCases];

            for (int i = 0; i < totalCases; i++) {
                values[i] = Integer.parseInt(sc.readLine());
            }
            if (totalCases >= 1) {
                //  System.out.println("Start timing ----"+new Date());
                getArray(totalCases, values);
            }

        sc.close();
    }
}