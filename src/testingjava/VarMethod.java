package testingjava;

public class VarMethod {
    private static int sum(int... arg){
        int sum=0;
        for (int temp:arg){
            sum+=temp;
        }
        return sum;

    }
    public static void main(String []args){
        System.out.println(sum(2,3,4,5));
        System.out.println((sum(2,3)));
        System.out.println((sum(2,3,4,9,6)));
        System.out.println((sum(2)));
        System.out.println((sum(2,3,3)));
        System.err.println((sum(2,3,2)));
    }
}
