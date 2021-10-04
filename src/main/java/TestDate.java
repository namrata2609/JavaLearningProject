import java.text.DecimalFormat;
import java.text.ParseException;

public class TestDate {

    public static void main(String args[]) throws ParseException {
        String STRT_TIME = "2019-09-30 12:34:56";
        String LAST_TXN_TIME = "2019-09-30 09:34:56";

        String starttime =null;
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        if(STRT_TIME !=null){
            System.out.println("else if condition -1--------------------------------");
            if(LAST_TXN_TIME==null){
                System.out.println("else if condition 0--------------------------------");
                starttime = String.valueOf(STRT_TIME);
            }else{
                java.text.DateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                int compareValue = (sdf.parse(String.valueOf(STRT_TIME)).compareTo(sdf.parse(String.valueOf(LAST_TXN_TIME))));

                long difference_In_Time = sdf.parse(STRT_TIME).getTime() - sdf.parse(LAST_TXN_TIME).getTime();
                long difference_In_Minutes  = (difference_In_Time/ (1000 * 60))/60;
                System.out.println("Difference "+difference_In_Minutes);
                System.out.println("else if condition 1 "+sdf.parse(String.valueOf(STRT_TIME)).compareTo(sdf.parse(String.valueOf(LAST_TXN_TIME))));
                try {
                    if(compareValue>=0){
                        starttime = String.valueOf(STRT_TIME);
                        System.out.println("else if condition 2--------------------------------");
                    }else {
                            starttime = LAST_TXN_TIME;
                            System.out.println("else condition--------------------------------");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Final Date--------------------------------"+starttime);
        }
    }
}
