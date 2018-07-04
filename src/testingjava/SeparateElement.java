package testingjava;

import java.util.Arrays;

public class SeparateElement {
    private static  int[] separateElement(int []input){
        int []output=new int[input.length];
        int cnt=0;
        for (int i:input){
            if (i==0){
                output[cnt++]=0;
            }
        }
        for (int i:input){
            if (i==1){
                output[cnt++]=1;
            }
        }
        return output;
    }
    public static void main(String []args){
        int []array={1,0,0,1,0,1,0,0,0,1};
        int []out=separateElement(array);
        System.out.println(Arrays.toString(out));

    }
}
