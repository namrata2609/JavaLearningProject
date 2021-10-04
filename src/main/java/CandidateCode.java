import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void getMaximumDominent(int R, int C, String[] values) {
        int maximum_values = 0;
        int beltNumber = 0;
        String valuesForCity = "";
        String[][] newArray = new String[R][C];
        boolean followNext = false;
        List<Map> totalMapDetails = new ArrayList<Map>();
        int totalCOdeDominentCities = 0;
        System.out.println("In stating");
        for (int l = 0; l < R; l++) {
            for (int q = 0; q < C; q++) {
                Map map = new HashMap();
                if (Integer.valueOf(values[l].split(" ")[q]) == 1) {
                    totalCOdeDominentCities += 1;
                    map.put("J", l);
                    map.put("K", q);
                    totalMapDetails.add(map);
                }
            }
        }
        System.out.println("In stating-----------------"+totalMapDetails.toString());
        String[] elemetDetails = new String[totalCOdeDominentCities];
        List<Map> elementArray = new ArrayList<Map>();
        boolean[] elemetEnableFlag = new boolean[totalCOdeDominentCities];
        for (int i = 0; i < totalMapDetails.size(); i++) {
            Map details = totalMapDetails.get(i);
            Map newElementArray = new HashMap();
            int j = Integer.parseInt(String.valueOf(details.get("J")));
            int k = Integer.parseInt(String.valueOf(details.get("K")));
            elemetDetails[i] = "E" + details.get("J") + details.get("K");
            elemetEnableFlag[i] = false;
            int verticalValueDown = (j + 1 < R ? (Integer.valueOf(values[j + 1].split(" ")[k])) : -1);
            int verticalValueUP = (j - 1 >= 0 ? (Integer.valueOf(values[j - 1].split(" ")[k])) : -1);
            int horizontalValueRight = (k + 1 < C ? (Integer.valueOf(values[j].split(" ")[k + 1])) : -1);
            int horizontalValueLeft = (k - 1 >= 0 ? (Integer.valueOf(values[j].split(" ")[k - 1])) : -1);
            int digonalValueRight = (j + 1 < R && k + 1 < C ? (Integer.valueOf(values[j + 1].split(" ")[k + 1])) : -1);
            int digonalValueLeft = (j + 1 < R && k - 1 >= 0 ? (Integer.valueOf(values[j + 1].split(" ")[k - 1])) : -1);
            int digonalValueRightUp = (j - 1 >= 0 && k + 1 < C ? (Integer.valueOf(values[j - 1].split(" ")[k + 1])) : -1);
            int digonalValueLeftUp = (j - 1 >= 0 && k - 1 >= 0 ? (Integer.valueOf(values[j - 1].split(" ")[k - 1])) : -1);

            String Elementvalue = "";
            if (horizontalValueLeft == 1) {
                Elementvalue += "E"+(j) + "" + (k - 1) + ",";
            }
            if (horizontalValueRight == 1) {
                Elementvalue += "E"+(j) + "" + (k + 1) + ",";
            }
            if (verticalValueDown == 1) {
                Elementvalue += "E"+(j + 1) + "" + k + ",";
            }
            if (verticalValueUP == 1) {
                Elementvalue += "E"+(j - 1) + "" + (k) + ",";
            }

            if (digonalValueRight == 1) {
                Elementvalue += "E"+(j + 1) + "" + (k + 1) + ",";
            }
            if (digonalValueLeft == 1) {
                Elementvalue += "E"+(j + 1) + "" + (k - 1) + ",";
            }
            if (digonalValueRightUp == 1) {
                Elementvalue += "E"+(j - 1) + "" + (k + 1) + ",";
            }
            if (digonalValueLeftUp == 1) {
                Elementvalue += "E"+(j - 1) + "" + (k - 1) + ",";
            }
            Elementvalue = Elementvalue.substring(0, Elementvalue.length() - 1);
            newElementArray.put("Elementname", elemetDetails[i]);
            newElementArray.put("Elementvalue", Elementvalue);
            elementArray.add(newElementArray);
        }
 System.out.println(elementArray.toString());
//System.out.println(elementArray.get(""));

    }
        public static void main (String args[] ){
            Scanner sc = new Scanner(System.in);
            String rowColumns = sc.nextLine();

            int R = Integer.valueOf(rowColumns.split(" ")[0]);
            int C = Integer.valueOf(rowColumns.split(" ")[1]);
            String[] values = new String[R];

            for (int i = 0; i < R; i++) {
                values[i] = sc.nextLine();
            }
            getMaximumDominent(R, C, values);
            sc.close();

        }

}
