import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ExceptionTest {

    public static void main(String[] args) {
        float i;
        int j;
        try{
            i = (float) (1.0/0);
           System.out.println(i);
        }catch(Exception e){
            System.out.println("Exception A"+e);
        }

        try{
            j = (1/0);
            System.out.println(j);
        }catch(Exception e){
            System.out.println("Exception B "+e);
        }


    }

}
