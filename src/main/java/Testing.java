import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Testing {
    static int sockMerchant(int n, int[] ar) {

        int[] sortedArray = ar;
        Arrays.sort(sortedArray);
        System.out.println("values"+sortedArray[1]);
        int totalPairs = 0;
        int pointer = 0;
        for (int i = 0; i<n; i++){
            if(i==0){
                pointer += 1;
            }else{
                if(sortedArray[i-1]==sortedArray[i]){
                    pointer +=1;
                }else{
                    int remainder = pointer%2;
                    int pair = (pointer-remainder)/2;
                    totalPairs += pair;
                    pointer = 1;
                }
            }
        }
        return totalPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


