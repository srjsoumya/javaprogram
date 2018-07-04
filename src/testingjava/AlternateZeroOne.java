package testingjava;

public class AlternateZeroOne {
    private static String convert(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                output += "1";
            }
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '0') {
                output += "0";
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String input = "111000110011";
        System.out.println(convert(input));
    }
}
