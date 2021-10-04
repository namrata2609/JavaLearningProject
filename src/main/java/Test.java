import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class Test
{
    // to find the path from
    // top left to bottom right
    static boolean isPath(int arr[][]){
        // set arr[0][0] = 1
      //  arr[0][0] = 1;

        // Mark reachable (from top left) nodes
        // in first row and first column.
        for (int i = 0; i < 5; i++)
            if (arr[0][i] != 0)
                arr[0][i] = arr[0][i - 1];
        for (int j = 0; j < 5; j++)
            if (arr[j][0] != 0)
                arr[j][0] = arr[j - 1][0];

        // Mark reachable nodes in
        //  remaining matrix.
        for (int i = 1; i < 5; i++)
            for (int j = 1; j < 5; j++)
                if (arr[i][j] != 0)
                    arr[i][j] = Math.max(arr[i][j - 1],arr[i - 1][j]);

        // return yes if right
        // bottom index is 1
        return (arr[5 - 1][5 - 1] == 1);
    }

    //Driver code
    public static void main(String[] args) throws IOException {
        String str= "SELECT *\n" +
                "FROM FLEXI_WO_LABEL_DETAILS\n" +
                "WHERE lot_no = CONCAT(item_number,\'-\',?,\'-\',\n" +
                "REPLACE(prod_date,\'/\',\'\'),\'-\',box_count,\'-\',?)\n" +
                "ORDER BY id DESC\n" +
                "LIMIT 1";
        
        String strng= "\"20000\",\"22000\",\"45656\"";
        System.out.println(strng.replace("\"",""));
        /*
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int[] RC = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int R= RC[0];
        int C = RC[1];
        String[] elementArray = new String[R];
        for(int i = 0;i<R;i++){
            elementArray[i] =br.readLine();
        }
*/



    }
}
// This code is contributed
// by prerna saini
