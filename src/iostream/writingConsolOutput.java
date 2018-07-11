package iostream;

import java.io.PrintWriter;

public class writingConsolOutput {
    public static void main(String []args){
        int b;
        b='A';
        System.out.write(b);
        System.out.write(47);
        System.out.write('\n');
        PrintWriter pw=new PrintWriter(System.out,true);
        pw.println("hello World");
        pw.println(1234);
    }
}
