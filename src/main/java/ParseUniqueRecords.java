import org.json.JSONObject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ParseUniqueRecords {
    public static void main(String args[]){
        JSONObject obj = new JSONObject();
        obj.put("ANC",123);
        System.out.println("Validation "+obj.has("ANC"));
    String emp_str= "16242,16026,12834 27500,12360,12570,1231,1490/*0,27307,1114 12834,1644,12834,27460,1114,1476,27342,1035,27387,27189,1508,1231,27387";
    System.out.println("EMPLOYEE_DFF "+emp_str+"  "+emp_str.length());
    String[] empArr = emp_str.split(",");
        //flexi.setStatusMessage("Emp Array--"+Arrays.toString(empArr));
        Set empSet = new HashSet(Arrays.asList(empArr));
        //flexi.setStatusMessage("Emp Set--"+empSet);
        String empList = String.join(",", empSet);
        System.out.println("EMPLOYEE_DFF "+empList+"  "+empList.length());
    }
}
