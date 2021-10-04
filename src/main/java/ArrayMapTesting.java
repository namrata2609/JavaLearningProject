import java.util.*;

public class ArrayMapTesting {

    public static void getValues(int R ,String[] values ){
        List<Map> ITEM_ARRAYs= null;
        for (int i=0;i<R;i++) {
            List<Map> items = (ITEM_ARRAYs != null ? (ITEM_ARRAYs) : new ArrayList<>());
            Map<String, Object> ItemItemDetails = new HashMap<>();
            ItemItemDetails.put("USERNAME", values[i].split(" ")[0]);
            ItemItemDetails.put("USERID", values[i].split(" ")[1]);
            ItemItemDetails.put("ORGCODE", values[i].split(" ")[2]);
            ItemItemDetails.put("PO", "PO");
            ItemItemDetails.put("UPDATE_LOGIN", -1);
            items.add(ItemItemDetails);
            ITEM_ARRAYs = items;
        }
            List<Map> arrayObj = ITEM_ARRAYs;
            String usernmae = null;
            for (int i = 0; i < arrayObj.size(); i++) {
                Map obj1 = arrayObj.get(i);
                usernmae = (String) obj1.get("USERNAME");
                System.out.println("arrayObj.length" + arrayObj.size() + usernmae);
            }

    }

    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        String rowColumns=  sc.nextLine();
        int R = Integer.valueOf(rowColumns.split(" ")[0]);
        //int C = Integer.valueOf(rowColumns.split(" ")[1]);
        String[] values = new String[R];

        for (int i = 0;i<R;i++){
            values[i] = sc.nextLine();
        }
        //getValues(R,C,values);
        sc.close();
        getValues(R,values);
    }
}
