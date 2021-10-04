import java.io.*;
import java.util.*;
    class ReadIOValues{
        public static void task(InputReader in){
            int test=in.nextInt();//ISSUE
        /*

        SOME CODE

        */
            System.out.println(test);
        }
        public static void main(String[] args)throws IOException {
            try{
                InputStream inputStream = System.in;
                InputReader in = new InputReader(inputStream);
                task(in);
                // out.close();
            }
            catch(NumberFormatException e){
                System.out.println(e);
            }
        }
        public static class InputReader {
            private InputStream stream;
            private byte[] buf = new byte[8192];
            private int curChar;
            private int numChars;
            private SpaceCharFilter filter;
            public InputReader(InputStream stream) {
                this.stream = stream;
            }
            public int read() {
                if (numChars == -1) {
                    throw new InputMismatchException();
                }
                if (curChar >= numChars) {
                    curChar = 0;
                    try {
                        numChars = stream.read(buf);
                    } catch (IOException e) {
                        throw new InputMismatchException();
                    }
                    if (numChars <= 0) {
                        return -1;
                    }
                }
                return buf[curChar++];
            }
            public int nextInt() {
                int c = read();
                while (isSpaceChar(c)) {
                    c = read();
                }
                int sgn = 1;
                if (c == '-') {
                    sgn = -1;
                    c = read();
                }
                int res = 0;
                do {
                    if (c < '0' || c > '9') {
                        throw new InputMismatchException();
                    }
                    res *= 10;
                    res += c - '0';
                    c = read();
                } while (!isSpaceChar(c));
                return res * sgn;
            }

            public boolean isSpaceChar(int c) {
                if (filter != null) {
                    return filter.isSpaceChar(c);
                }
                return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
            }
            public interface SpaceCharFilter {
                public boolean isSpaceChar(int ch);
            }
            private boolean isEndOfLine(int c) {
                return c == '\n' || c == '\r' || c == -1;
            }
        }
    }