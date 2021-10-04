import java.io.*;
import java.util.*;
public class CodeDominent {
    public static void getMaximumDominent(int R, int C, String[] values) {
        int maximum_values = 0;
        int beltNumber = 0;
        String valuesForCity = "";
        String[][] newArray = new String[R][C];
        boolean followNext = false;
        List<Map> totalMapDetails = new ArrayList<Map>();
        boolean goingToStartFlag = false;
        int totalCOdeDominentCities = 0;
        for (int l=0 ; l<R;l++){
            for (int q = 0;q<C;q++){
                if(Integer.valueOf(values[l].split(" ")[q])==1){
                    totalCOdeDominentCities +=1;
                }
            }
        }
        while(totalMapDetails.size()!=totalCOdeDominentCities){
            Map map = new HashMap();
            for (int j = 0; j < R; j++) {
                List<Map> localTest = new ArrayList<Map>();
                System.out.println("New Row Started " + j);
                System.out.println("beltNumber-----------" + beltNumber);
                for (int k = 0; k < C; k++) {
                    if(!goingToStartFlag){
                        goingToStartFlag  = true;
                    }
                    int cityIsDominent = Integer.valueOf(values[j].split(" ")[k]);
                    if (cityIsDominent == 1) {
                        map.put("J",j);

                        int verticalValueDown = (j + 1 < R ? (Integer.valueOf(values[j + 1].split(" ")[k])) : -1);
                        int verticalValueUP = (j - 1 >= 0 ? (Integer.valueOf(values[j - 1].split(" ")[k])) : -1);
                        int horizontalValueRight = (k + 1 < C ? (Integer.valueOf(values[j].split(" ")[k + 1])) : -1);
                        int horizontalValueLeft = (k - 1 >= 0 ? (Integer.valueOf(values[j].split(" ")[k - 1])) : -1);
                        int digonalValueRight = (j + 1 < R && k + 1 < C ? (Integer.valueOf(values[j + 1].split(" ")[k + 1])) : -1);
                        int digonalValueLeft = (j + 1 < R && k - 1 >= 0 ? (Integer.valueOf(values[j + 1].split(" ")[k - 1])) : -1);
                        int digonalValueRightUp = (j - 1 >= 0 && k + 1 < C ? (Integer.valueOf(values[j - 1].split(" ")[k + 1])) : -1);
                        int digonalValueLeftUp = (j - 1 >= 0 && k - 1 >= 0 ? (Integer.valueOf(values[j - 1].split(" ")[k - 1])) : -1);

                        if(verticalValueDown==1){

                        }
                        if(verticalValueUP==1){

                        }
                        if(horizontalValueRight==1){

                        }
                        if(horizontalValueLeft==1){

                        }
                        if(digonalValueRight==1){

                        }
                        if(digonalValueLeft==1){

                        }
                        if(digonalValueRightUp==1){

                        }
                        if(digonalValueLeftUp==1){

                        }
                    }

                    if (cityIsDominent == 1) {
                        if (j == 0 && k == 0) {
                            System.out.println("Starting");
                            beltNumber += 1;
                            newArray[j][k] = "C" + beltNumber;
                        } else if (!followNext) {

                            System.out.println("Not connected");
                            beltNumber += 1;
                            newArray[j][k] = "C" + beltNumber;
                        } else {
                            System.out.println("connected");
                            // newArray[j][k] = ("C" + beltNumber);
                            newArray[j][k] = (valuesForCity.equals("-1") ? ("C" + beltNumber) : valuesForCity);
                            valuesForCity = "-1";
                            followNext = false;
                        }
                    } else {
                        System.out.println("Not Dominent");
                        newArray[j][k] = "0";
                        followNext = false;
                    }
                    // System.out.println( newArray[j][k]);

                }

            }
        }
        System.out.println("beltNumber-----------"+beltNumber);
        for (int i=1 ;i<= beltNumber;i++) {
            int particularValue = 0;
            for (int l=0 ; l<R;l++){
                for (int q = 0;q<C;q++){
                    if(newArray[l][q].equals("C"+i)){
                        particularValue +=1;
                    }
                }
            }
            // System.out.println(particularValue+"maximum_values "+maximum_values);
            if(maximum_values<particularValue){
                maximum_values = particularValue;
            }
        }
        System.out.print(maximum_values);
    }

    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        String rowColumns=  sc.nextLine();

        int R = Integer.valueOf(rowColumns.split(" ")[0]);
        int C = Integer.valueOf(rowColumns.split(" ")[1]);
        String [] values = new String[R];

        for (int i = 0;i<R;i++){
            values[i] = sc.nextLine();
        }
        getMaximumDominent(R,C,values);
        sc.close();

    }
}
