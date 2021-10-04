import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharParse {

    public static void main(String args[]){
        String str = "741.27415,741.27145*27415,1021,27390.16115,1008,27186,1644,27460,741,27388,1114,1476,12519,1035,16115,12535,12248,27390.27498,27390,12457";
        Pattern p = Pattern.compile(".*[!@#&()–[{}]:;',?/*~$^+=<>]");
        Matcher m = p.matcher(str);
        // boolean b = m.matches();
        boolean b = m.find();
         if(b){
        /*can show message*/
        /*Can repalce*/
         String finalvalues = str.replaceAll("[ .*!@#&()–[{}]:;',?/*~$^+=<>]",",");
             String[] empArr = finalvalues.split(",");
             System.out.println("Emp Array--"+Arrays.toString(empArr));
             TreeSet empSet = new TreeSet(Arrays.asList(empArr));
             //flexi.setStatusMessage("Emp Set--"+empSet);
             String empList = String.join(",", empSet);
            // System.out.println("EMPLOYEE_DFF "+empList+"  "+empList.length());
        System.out.println("Old values "+str+"\r\n"+"finalvalues"+"  "+empList);

        }

    }
}
