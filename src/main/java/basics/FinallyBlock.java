package basics;

public class FinallyBlock {

    public static String getValue(){
        String result = "";
        try{
            int i = 1;
            i = 1/0;
        }catch(Exception e){
            //System.out.println("Exception"+e.getMessage());
            result=e.getMessage();
            //System.exit(1);
            return result;
        }finally {
            result = "Failed";
           // System.out.println("Finally");
            return result;
        }
    }

    public static void main(String args[]){

        System.out.println("Result "+getValue());
    }
}
