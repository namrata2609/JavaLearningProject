import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CompSegmnt {
  static void getTotalCostTotravle(int testCases, String[] araryElements ){

      int i = 0;
      while(i<testCases){
          long[] coordinates = Arrays.stream(araryElements[i].split(" ")).mapToLong(Long::parseLong).toArray();
              long x1= coordinates[0];
              long y1 = coordinates[1];
              long x2 = coordinates[2];
              long y2 = coordinates[3];

              if(x1 ==x2 && y1==y2){
                  System.out.print(0);
              }
          i++;
      }

  }

        public static void main(String args[]) throws IOException {
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader sc=new BufferedReader(r);
            int N = Integer.parseInt(sc.readLine());
            String[] arrayElements = new String[N];
            for(int i = 0;i< N;i++){
                arrayElements[i] = sc.readLine();
            }
             getTotalCostTotravle(N,arrayElements);
            sc.close();
        }
}
