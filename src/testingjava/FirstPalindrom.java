package testingjava;

public class FirstPalindrom {
    private static String reverse(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }

    private static String firstPalindrom(String input) {
        String output = "";
        String temp;
        for (int j = 3; j <= input.length(); j++) {
            for (int i = 0; i < input.length()-j; i++) {
                temp = input.substring(i, i + j);
                if (temp.equals(reverse(temp))) {
                    return temp;
                }
            }
        }
        return "No palindrom string found";
    }

    public static void main(String[] args) {
        System.out.println(firstPalindrom("malayalam"));
        System.out.println(firstPalindrom("palindrom"));
        System.out.println(firstPalindrom("malylam"));
        System.out.println(firstPalindrom("ellewaseeraeesawelle"));
    }
}
