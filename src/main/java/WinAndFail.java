import java.util.Arrays;
import java.util.Scanner;

public class WinAndFail {

    public static void winOrLoose(int T,String[][] values ){

        for(int i=0;i<T;i++){
            boolean looseFlag = false;
            int numberOfPlayer = Integer.parseInt(values[i][0]);
            int[] villainsStrength =Arrays.stream(values[i][1].split(" ")).mapToInt(Integer::parseInt)
                    .toArray();
            int[] playerStrength =Arrays.stream(values[i][2].split(" ")).mapToInt(Integer::parseInt)
                    .toArray();
            Arrays.sort(villainsStrength);
            Arrays.sort(playerStrength);
            for(int j=0;j<numberOfPlayer;j++){
                int playerplayerStrengthInt= playerStrength[j];
                int villainsStrengthInt= villainsStrength[j];
                if(playerplayerStrengthInt<villainsStrengthInt) {
                    looseFlag = true;
                }
            }

            if(looseFlag){
                System.out.println("LOSE");
            }else{
                System.out.println("WIN");
            }
        }

    }
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int totalTestCase = Integer.parseInt(sc.nextLine());
        String[][] dataInput = new String[totalTestCase][3];
        for(int i=0;i<totalTestCase;i++){
            dataInput[i][0]=sc.nextLine();
            dataInput[i][1]=sc.nextLine();
            dataInput[i][2]=sc.nextLine();
        }
        winOrLoose(totalTestCase,dataInput);


        //Write code here

    }
}

