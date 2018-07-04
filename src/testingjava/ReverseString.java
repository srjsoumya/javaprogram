package testingjava;

public class ReverseString {
    private static String reverseWordString(String input) {
        String output = "";
        String[] temp = input.split(" ");
        for (int i = 0; i < temp.length; i++) {
            for (int j = temp[i].length() - 1; j >= 0; j--) {
                output += temp[i].charAt(j);
            }
            if (i != temp.length - 1)
                output += " ";
        }
        return output;
    }
    private static String reverseString(String input) {
        String output = "";
        String[] temp = input.split(" ");
        int cnt = 0;
        for (int i = temp.length - 1; i >= 0; i--) {
            output += temp[i];
            if (i != 0)
                output += " ";
        }
        return output;
    }
    private static String reverseWordStringRec(String input){
        String output="";
        String []temp=input.split(" ");
        int cnt=temp.length;
        for(int i=cnt-1;i>=0;i--){
            for(int j=temp[i].length()-1;j>=0;j--){
                output+=temp[i].charAt(j);
            }
            if (i!=0)
                output+=" ";
        }
        return output;
    }
    private static String vowelString(String input){
        String output="";
        String []temp=input.split(" ");
        for (int i=0;i<temp.length;i++){
            char ch=temp[i].charAt(0);
            if (ch =='A' ||ch =='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                output += temp[i];
                if (i != temp.length - 1) {
                    output += " ";
                }

            }
        }
        return output;
    }

    public static void main(String[] args) {
        String input = "java is a strong language.";
        System.out.println(reverseString(input));
        System.out.println(reverseWordString(input));
        System.out.println(reverseWordStringRec(input));
        System.out.println(vowelString("Java is a strong language where as Python is a stronger language."));
    }
}
