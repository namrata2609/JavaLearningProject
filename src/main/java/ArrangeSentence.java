
import com.sun.net.httpserver.Authenticator;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrangeSentence {

        /*
         * Complete the 'arrange' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING sentence as parameter.
         */

        public static String arrange(String sentence) {
            // Write your code here
            String result = "";
            String[] wordsArray = sentence.split(" ");

            int[] lengthArray = new int[wordsArray.length];

            for(int i= 0; i<wordsArray.length;i++){
                lengthArray[i] =wordsArray[i].length();
            }
            Arrays.sort(lengthArray);
            Arrays.sort(lengthArray);
            Deque<String> finalQueue = (Deque<String>) new LinkedList();
            for(int j= 0;j<lengthArray.length;j++){
                System.out.println("Main loop "+result);
                String pickedValue = "";
                for(int k=0;k<wordsArray.length;k++){
                    System.out.println("Second loop "+result);
                    if(lengthArray[j]==wordsArray[k].length()){
                        System.out.println("Main Condition "+result);
                        if(finalQueue.size()==0){
                            System.out.println("Empty list "+result);
                            pickedValue = wordsArray[k];
                            break;
                        }else if(!(finalQueue.contains(wordsArray[k]))){
                            System.out.println("words not here "+result);
                            pickedValue = wordsArray[k];
                            break;
                        }
                    }

                }

                finalQueue.addLast(pickedValue);
            }
            for(String str: finalQueue){
                System.out.println("value "+result);
                if (result.isEmpty()){
                    result += str.substring(0,1).toUpperCase()+str.substring(1)+" ";
                }else{
                    result += (str.length() >0?(str.substring(0,1).toLowerCase()+str.substring(1)):str)+" ";}
            }
            System.out.println("value============ "+result);

            return result;

        }

        public static void main(String[] args) throws IOException {
            InputStreamReader r=new InputStreamReader(System.in);
            BufferedReader sc=new BufferedReader(r);
            String result = sc.readLine();
            arrange(result);
        }


}
