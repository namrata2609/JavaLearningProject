package basics;

public class Solution {

    public static int solution(int N) {
        int result = 0;
        // write your code in Java SE 8
        String binaryRepresentation  = Integer.toBinaryString(N);
        System.out.println("binaryRepresentation  "+binaryRepresentation);
        if(N>0&&N<2147483647){
            System.out.println("Inside loop");
            char[] charArray  = binaryRepresentation.toCharArray();
            int zerosCurrentLength = 0;

            for(int i = 0;i<charArray.length;i++){
                if(charArray[i]=='0'){
                    zerosCurrentLength +=1;
                }else{
                    if(result==0||result<zerosCurrentLength){
                        result = zerosCurrentLength;
                    }
                    zerosCurrentLength = 0;
                }
            }

        }
        return result;
    }

    public static void main(String args[]){
        System.out.println(solution(1041));
    }
}
